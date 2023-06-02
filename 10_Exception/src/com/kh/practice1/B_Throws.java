package com.kh.practice1;

import java.io.IOException;

public class B_Throws {

	/*
	 * 예외처리 떠넘기기
	 * 
	 * [표현법]
	 * 
	 * 리턴타입 메서드명(매개변수, ...) throws 예외클래스1, 예외클래스2, ...{}
	 */
	
	public static void main(String[] args) {
		//static 메서드에서는 그렇지 않는 메서드를 가져올때 생성해서 가져오기
			try {
				new B_Throws().method1();
			} 
				catch (ClassNotFoundException e) {
					e.printStackTrace();
			} 	
				catch (IOException e) {
					e.printStackTrace();
			} 
				catch (Exception e) {
					e.printStackTrace();
			} 
		}
	
	
	public void method1() throws Exception {
		System.out.println("method1() 호출");
		
		method2();
		
		System.out.println("method2() 호출");
	}
	
	public void method2() throws IOException, ClassNotFoundException {
		
		System.out.println("method2() 호출");
		
		method3();
		
		System.out.println("method2() 종료");
	}
	
	public void method3() throws IOException, ClassNotFoundException{
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random() * 3 + 1);
		
		if(random == 1) {
			throw new ClassNotFoundException();
			
		} else if(random == 2) {
			throw new IOException();
		}
		
		System.out.println("method3() 종료");
	}
}
