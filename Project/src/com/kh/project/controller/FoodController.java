package com.kh.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.kh.project.model.Food;

public class FoodController {

	
	private HashMap<Food, Integer> hMap = new HashMap<>(); // 마트에서 음식 저장용 hashCode() Food클래스가서 생성하기
	private ArrayList<Food> list = new ArrayList<>();      // 고객이 구매한 음식 저장용
	
	
	public boolean addNewKind(Food f, int amount) {
		// containsKey() : 해당 map에 key가 존재하는가
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		if(!(hMap.containsKey(f))) {
		// f와 amount를 각각 키와 값으로 저장 후 true 반환
			hMap.put(f, amount);
			return true;
		}
		// 존재할 경우 false 반환
		return false; }
	
	public boolean removeKind(Food f) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때
		if(hMap.containsKey(f)) {
		// hMap에 f 삭제 후 true 반환
			hMap.remove(f);
			return true;
		}
		// 존재하지 않을 경우 false 반환

		return false;
	}
	
	public boolean changeAmount(Food f, int amount) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때 
		if(hMap.containsKey(f)) {
		// f와 amount 저장 후 true 반환
			hMap.put(f, amount);
		// 존재하지 않을 경우 false 반환
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
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환
		
			list.add(f);
			hMap.put(f, hMap.get(f)-1);
			
			return true;
		// 존재하지 않으면 false 반환
			}
		return false;
	}
	
	public boolean removeFood(Food f) {
		
		// 전달 받은 f가 list에 존재할 때
		if(list.contains(f)) {
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환
		list.remove(f);
		hMap.put(f, hMap.get(f)+1);
		return true;
		}
		// 아니면 false 반환
		
		return false;
	}
	
	public ArrayList<Food> printBuyFood() {
		return list;
	}
	
	public String buyFoodList() {
		String temp = "";
		Set<Food> key = hMap.keySet();
		for (Food food : key) {
			temp += food.getKind() + " : "  + food.getName() + hMap.get(key);
		}
//		   for (String string : key) {
//			            temp += "받는 사람 : " + string + " 메일 제목 :" + mailMap.get(string).getMailIndex() + " 메일 내용 :"
//			                    + mailMap.get(string).getMailnote() + "\n";

			
		return temp;
	}
	

	
}
