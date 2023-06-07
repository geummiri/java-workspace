package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.kh.map.model.Snack;
import com.kh.practice3.model.Farm;

public class FarmController {

	private HashMap<Farm, Integer> hMap = new HashMap<>(); // 마트에서 농산물 저장용
	private ArrayList<Farm> list = new ArrayList<>();      // 고객이 구매한 농산물 저장용
	Set<Farm> key = hMap.keySet(); //key값 먼저 지정하기
	public boolean addNewKind(Farm f, int amount) {
		
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		if(!(hMap.containsKey(f))) {
		// f와 amount를 각각 키와 값으로 저장 후 true 반환
			hMap.put(f, amount);
			return true;
		}
		// 존재할 경우 false 반환
		return false;
	}
	
	public boolean removeKind(Farm f) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때
		if(hMap.containsKey(f)) {
		// hMap에 f 삭제 후 true 반환
			hMap.remove(f);
			return true;
		}
		// 존재하지 않을 경우 false 반환

		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		
		// 전달 받은 f가 hMap 안에 key로 존재할 때 
		if(hMap.containsKey(f)) {
		// f와 amount 저장 후 true 반환
			hMap.put(f, amount);
		// 존재하지 않을 경우 false 반환
		return true;
		}
		
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		
		return hMap ;
	}
	
	// 고객 관련 기능 ------------------------------------------------------------
	
	public boolean buyFarm(Farm f) {
		
		if(hMap.containsKey(f) && f != null) {
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 1개 이상 일 때
		// list에 f 추가, 그리고 hMap에 f 수량 1 감소, true 반환
		
			
			return true;
		// 존재하지 않으면 false 반환
			}
		return false;
	}
	
	public boolean removeFarm(Farm f) {
		
		// 전달 받은 f가 list에 존재할 때 
		// list에 f 삭제, 그리고 hMap에 f 수량 1 증가, true 반환
		
		// 아니면 false 반환
		
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}
}
