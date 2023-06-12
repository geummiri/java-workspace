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
	
	public HashMap<Food, Integer> printFood() {
		
		return hMap ;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	//고객 음식 구매하기 
	public boolean buyFood(Food f) {
		
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
//		private ArrayList<Food> list = new ArrayList<>();
		
		String temp = "";
//		Set<Food> key = hMap.keySet();
		for (Food food : list) {
			temp += food.getKind() + " - "  + food.getName() + " (" + hMap.get(food) +") ";
			
		}
		return temp;
	}
	

	
}
