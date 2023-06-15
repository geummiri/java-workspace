package com.kh.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.kh.project.model.Food;

public class FoodController {

	
	private HashMap<Food, Integer> adminMap = new HashMap<>(); //음식 메뉴 저장
	private HashMap<Food, Integer> customerMap = new HashMap<>(); //음식 메뉴 저장
//	private ArrayList<Food> list = new ArrayList<>();      //고객이 구매한 음식 저장용
	
	//새로운 메뉴 추가
	public boolean addNewKind(Food f, int amount) {
		
		if(!(adminMap.containsKey(f))) {
			adminMap.put(f, amount);
			return true;
		}
		return false; 
		}
	//메뉴삭제
	public boolean removeKind(Food f) {
		
		if(adminMap.containsKey(f)) {
			adminMap.remove(f);
			return true;
		}

		return false;
	}
	//음식 개수 수정
	public boolean changeAmount(Food f, int amount) {
		
		if(adminMap.containsKey(f)) {
			adminMap.put(f, amount);
		return true;
		}
		
		return false;
	}
	//메뉴에 있는 음식 나열하기
	public String printFood() {

		String temp = "";
		Set<Food> map = adminMap.keySet();
		
		for (Food food : map) {
			temp += "음식 종류 : " + food.getKind() + ", 음식 이름 : " + food.getName() + ", 음식 개수 : " + adminMap.get(food) + "개 \n" ;
		}
		
		return temp;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	//메뉴에 있는 음식 고객이 구매하기 
	public boolean buyFood(Food f, int num) {
		
		if(adminMap.containsKey(f) && adminMap.get(f) >= num && num>0) {
		
			if(customerMap.get(f) == null) {
				
				customerMap.put(f, num);
			}
			else customerMap.put(f,customerMap.get(f)+num);
			
			adminMap.put(f, adminMap.get(f)-num);
			
			return true;
			}
		return false;
	}
	//고객 음식 취소 
	public boolean removeFood(Food f, int num) {
		
		if(customerMap.containsKey(f)) {
		customerMap.put(f, customerMap.get(f)-num);
		adminMap.put(f, adminMap.get(f)+num);
		return true;
		}
		
		return false;
	}
	
	//고객이 구매할 수 있는 메뉴 목록 전체 확인하기 
	public HashMap<Food, Integer> printBuyFood() {
		return customerMap;
	}
	
	//고객이 구매한 메뉴내역 전체 확인하기
	public String buyFoodList() {
		
		String temp = "";
		Set<Food> key = customerMap.keySet();
		
		for (Food f : key) {
			temp += f.getKind() + " / "  + f.getName() + " / " + customerMap.get(f) + "개 \n";
		}
		return temp;
	}

}
