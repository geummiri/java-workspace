package com.kh.set;

import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

public class B_TreeSet {

/*
 * TreeSet (정렬 가능함)
 * -저장과 동시에 자동 오름차순 정렬 
 * -HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
 */
	public static void main(String[] args) {
		
		B_TreeSet b = new B_TreeSet();
		b.method1();
//		b.method2();
		
	}
	
	public void method1() {
		Set<String> set = new TreeSet<>();
		
		set.add("마동석");
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); //HashSet() 은 무작위로 출력 / TreeSet()은 정렬되어서 출력됨
		
	}
	
	public void method2() {
		
		TreeSet<Person> set = new TreeSet<Person>(); //Person클래스에서 implements Comparable<Person> 작성해주고 add compare to() override 해줘야함
		
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52));
		set.add(new Person("이준혁", 39));
		
		System.out.println(set);
		
	}
}
