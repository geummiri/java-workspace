package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * Set의 특징
 * -중복 없음
 * -순서 없음
 * 
 * HashSet
 * -Set 인터페이스를 구현한 대표적인 컬렉션 클래스
 */

public class A_HashSet {

	public static void main(String[] args) {

		A_HashSet a = new A_HashSet();
		a.method1();
//		a.method2();
	}
	
	public void method1() {
		Set<String>set = new HashSet<>(); 
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); //중복된 값 안나오고 순서도 맘대로임
		System.out.println(set.size()); //4
		System.out.println(set.contains("마동석")); //true
		set.remove("아오키 무네타카");
		System.out.println(set);
		
		set.clear();
		System.out.println(set); // clear 되어서 전부 제거 됨
		System.out.println("비었는지 ? " + set.isEmpty()); //true
		
	}
	
	public void method2() {
		
		HashSet<Person> set = new HashSet<Person>(); //객체는 주소값이 달라서 set인데도 중복값 추출됨 우리가 중복값 없애줘야행
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		/*
		 * 객체의 주소값을 가지고 비교하기 떄문에 모두 다른 객체로 인식해서 중복 제거되지 않음
		 * --> Person 클래스에서 hashCode(), equals() 메서드 재정의
		 */
		System.out.println(set); // Person 클래서에서 hashCode() and equals() 재정의 해줌으로써 중복값 제거 가능
		System.out.println(set.size());
		
		
		/*
		 * Iterator
		 * -컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * -iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		 * 
		 */
		
		Iterator<Person> it = set.iterator(); //iterator() 반환값은 Iterator<Person>
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인하는 메서드, 확인이 됐으면 다음으로 넘어가서 요소 읽어오기 / while의 반환값이 boolean 이여서 hasNext()로 가져옴
			System.out.println(it.next()); //Person.. 다음 요소를 읽어옴  첫번째 요소 불러오고 마지막 요소까지 계속 불러옴 for문이랑 똑같애
			
		}
		
	}

}
