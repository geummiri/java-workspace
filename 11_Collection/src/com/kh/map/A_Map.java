package com.kh.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.kh.map.model.Snack;

import java.util.Set;
import java.util.Iterator;


public class A_Map {

	public static void main(String[] args) {
		
		A_Map m = new A_Map();
//		m.method1();
		m.method2();
		
	}
		

	public void method1() {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("미리", 28);
		map.put("나경", 32);
		map.put("딘", 30);
		
//		System.out.println(map);
//		
//		//key만 가져오기
//		System.out.println(map.keySet());
//		//다른방법
//		Set<String> key = map.keySet();
//		System.out.println(key);
//		
//		//키에 해당하는 value값 가져오기
//		Iterator<String> it = key.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			System.out.println("이름 : " + name + ", 나이 : " + map.get(name));
//		}
//		
////		Set<String> key = map.keySet();
//		for(String str : key) {
//		System.out.println(map.get(str));
		
		//entrySet() 메서드
//		Set<Entry<String, Integer>> entrySet = map.entrySet();
//			
//		for(Entry<String, Integer> entry : entrySet) {
//			System.out.println(entry.getKey() + entry.getValue());
			/*
			 *미리28
			 *나경32
			 *딘30
			 */

			}
	
	public void method2() {
		
		Map<String, Snack> map = new HashMap<>(); //값은 중복될수있으나, 키는 중복안됨
		
		map.put("웨하스", new Snack("치즈", 240));
		map.put("웨하스", new Snack("딸기", 255));
		map.put("고래밥", new Snack("양념치킨", 173));
		map.put("자유시간", new Snack("아몬드", 232));
		map.put("칸쵸", new Snack("딸기 요거트", 880));
		map.put("홈런볼", new Snack("초코", 270));
		map.put("스윙칩", new Snack("볶음고추", 347));
		map.put("나쵸", new Snack("치즈", 486));
		map.put("꼬깔콘", new Snack("매콤달콤", 175));
		map.put("후렌치파이", new Snack("딸기", 900));
		
//		System.out.println(map);
//		System.out.println(map.size());
//		
//		Snack sn = map.get("웨하스");
//		System.out.println(sn); //Snack [flavor=딸기, calorie=255]
//		
//		
//		map.remove("웨하스");
//		System.out.println(map);
		
		//1.홈런볼에 해당하는 과자 정보 출력
//		Set<String> key = map.keySet();
//		System.out.println(map.get("홈런볼"));
		
		//2.후렌치파이의 맛 정보 출력 : 딸기
//		Set<String> key = map.keySet();
//		System.out.println(map.get("후렌치파이").getFlavor());
		
		//3.맛에 '딸기'가 들어간 과자들의 칼로리 평균
		Set<String> str = map.keySet();
		
		int total = 0;
		int count = 0;
		
		for(String key : str) {
			
			if(map.get(key).getFlavor().contains("딸기")) {
				total += map.get(key).getCalorie();
				count++;
			}
		}
		System.out.println(total/count);
		
	}
		
	}
			

