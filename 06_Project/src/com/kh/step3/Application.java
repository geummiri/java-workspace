package com.kh.step3;

import java.util.Scanner;

import com.kh.step3.model.Calculator;

public class Application {
	
	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 *  -참조변수.변수;
		 *  
		 * 메서드 호출 방법
		 *  -참조변수.메서드이름();               //매개변수없는경우
		 *  -참조변수.메서드이름(값1, 값2, ...);   //매개변수있는경우
		 * 
		 */
		
		Calculator c = new Calculator();
		
//		c.a = 200;
//		c.b = 100;
//		
//		System.out.println("최대값 : " + c.max());
		
		c.a = 7;
		c.b = 4;
		
		//return 값 : 나누기 -> 형태 : "몫은 ," ~ "나머지는 " ~ "이다."
		System.out.println("더하기 : " + c.add());
		System.out.println("빼기 : " + c.substract());
		System.out.println("곱하기 : " + c.multiply(c.a, c.b));
		System.out.println("나누기 : " + c.divide(c.a, c.b));
		System.out.println(c.divide(c.a, c.b));
		
		
		System.out.println(c.factorial(c.a));
	}
}
