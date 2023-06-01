package com.kh._interface.step1;
//클래스가 인터페이스를 가지고 오려면 implements 가 필요함
//implements 클래스 입력하고 재정의 필요 (오버라이드)

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}

	
}
