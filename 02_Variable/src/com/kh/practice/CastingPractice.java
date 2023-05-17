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
		float korean = sc.nextInt();
		//초기값을 int로 적고 싶은데 평균낼때 38.00 으로 나와서 어떤게 베스트 답인지 모르겠습니다 ㅠㅠ
		
		System.out.print("영어 : ");
		float eng = sc.nextInt();
		
		System.out.print("수학 : ");
		float math = sc.nextInt();
		
		float sum = (int)(korean + eng + math);
		float avg = (sum/3);
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f" ,avg); 
		
	}
}
