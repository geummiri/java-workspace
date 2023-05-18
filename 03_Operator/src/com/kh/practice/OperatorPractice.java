package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		
		OperatorPractice op = new OperatorPractice();
//		op.method1();
		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
//		op.method6();
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int student = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int pencil = sc.nextInt();
		
		System.out.println("1인당 연필 개수 :" + pencil / student);
		System.out.println("남는 연필 개수 :" + pencil % student);
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		System.out.println((num > 0) ? num / 100 * 100 : "양수를 입력해주세요.");
	}
	
	public void method3() {

		Scanner sc = new Scanner(System.in);
		
		boolean result = true;
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		result = (num1 == num2) && (num2 == num3);
		
		System.out.println(result);
		
		// 요런 식으로 해도 결과가 나오니 괜찮지만!
		// 사실 삼항연산자에서 true, false를 직접 넣는 경우는 드물거든요! 논리 연산자로도 해볼 수 있는데 논리 연산자 활용해보실래요?
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num / 2 == 0) ? "짝수다" : "홀수다");
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		System.out.println((num <= 13) ? "어린이" : (num > 19) ? "성인" : "청소년");
		
	}
	
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int num2 = sc.nextInt();
		
		result = (num1 % num2 == 0) ? (num1 / num2) : (num1 / num2 + 1);
		 
		System.out.println(result);
		
	}
}

