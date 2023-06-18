package com.kh.list;

import java.util.ArrayList;

import com.kh.list.model.A_Person;

public class A_List {
	
	public static void main(String[] args) {
		
		A_List a = new A_List();
		a.method1();
	}
	
	public void method1() {
		
		ArrayList<A_Person> list = new ArrayList<>();
		
		//1.add(E e) : 리스트 끝에 추가
		list.add(new A_Person("전현무", "삼섬동", 45));
		list.add(new A_Person("남궁민", "서울숲", 45));
		list.add(new A_Person("이시언", "상도", 40));
		list.add(new A_Person("이제훈", "서울숲", 38));
		
		//리스트에 저장된 사람들의 평균 연령을 출력
		int sum = 0;
		
		for(int i=0; i<list.size(); i++) {
			
			sum += list.get(i).getAge();
		}
		int avg = sum/list.size();
		
		System.out.println(avg);
		
		//저장된 사람들의 이름만 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		
		System.out.println();
		
		for(A_Person a : list) {
			System.out.println(a.getName());
		}
		
		//서울숲에 사는 사람들만 출력
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAddr().contains("서울숲")) {
				System.out.println(list.get(i));
			}
		}
		
		for(A_Person a : list) {
			if(a.getAddr().equals("서울숲")) {
				System.out.println(a);
			}
		}

}
	}
