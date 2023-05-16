package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice v = new CastingPractice();
		
		v.method1();
	//	System.out.println(int(1 + a));
//		v.method2();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자 : ");
		int str = sc.nextInt();
		sc.nextLine();
		
		
		
		
		System.out.println(str +" unicode : " + (str));
		
		System.out.println(str+1 + " unicode : " + str+1);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("총점 : " + (korean + eng + math));
		
		System.out.println("평균 : " + (double)((korean + eng + math)/3)); 소수점 0으로 나옴
//		System.out.printf("평균 : %d ", (korean+eng+math)/3);
		
	}
}
