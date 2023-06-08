package com.kh.practice3.model;

public class Fruit extends Farm {
	
	public Fruit(String name) { //생성자만 생성하고 부모클래스 super로 작성해주기
		super("과일", name);
	}
	
}
