package com.kh.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.kh.project.model.Food;

public class FoodController {

	
	private HashMap<Food, Integer> hMap = new HashMap<>(); // 마트에서 음식 저장용 hashCode() Food클래스가서 생성하기
	private ArrayList<Food> list = new ArrayList<>();      // 고객이 구매한 음식 저장용
	
	
	public boolean addNewKind(Food f, int amount) {
		
		if(!(hMap.containsKey(f))) {
			hMap.put(f, amount);
			return true;
		}
		return false; 
		}
	
	public boolean removeKind(Food f) {
		
		if(hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		}

		return false;
	}
	
	public boolean changeAmount(Food f, int amount) {
		
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
		return true;
		}
		
		return false;
	}
	
	public String printFood() {

		String temp = "";
		Set<Food> map = hMap.keySet();
		
		for (Food food : map) {
			temp += "음식 종류 : " + food.getKind() + ", 음식 이름 : " + food.getName() + ", 음식 개수 : " + hMap.get(food) + "개 \n" ;
		}
		
		return temp;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	//고객 음식 구매하기 
	public boolean buyFood(Food f, int num) {
		
		if(hMap.containsKey(f) && hMap.get(f) > 0) {
		
			list.add(f);
			hMap.put(f, hMap.get(f)-1);
			
			return true;
			}
		return false;
	}
	
	public boolean removeFood(Food f) {
		
		if(list.contains(f)) {
		list.remove(f);
		hMap.put(f, hMap.get(f)+1);
		return true;
		}
		
		return false;
	}
	
	public ArrayList<Food> printBuyFood() {
		return list;
	}
	
	public String buyFoodList() {
		
		String temp = "";
//		Set<Food> key = hMap.keySet(); list 썼으니까 셋 안써도됨
		for (Food food : list) {
			temp += food.getKind() + " / "  + food.getName() + " / " + hMap.get(food) + "개 \n";
		}
		return temp;
	}

}
