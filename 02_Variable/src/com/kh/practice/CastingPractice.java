package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice v = new CastingPractice();
		
//		v.method1();
		v.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");
		char str =sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println(str +" unicode : " + (int)str);
		System.out.println((char)(str+1) + " unicode : " + (int)(str+1));
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (korean + eng + math);
		float avg = (float)(korean + eng + math)/3;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" , avg); 
		
		//소수점 두째자리까지 나타내기
	}
}
