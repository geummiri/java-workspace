package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	
	//FQCN(Fully Qualified Class Name)
	//클래스가 속한 패키지명을 모두 포함한 이름
	
	public static void main(String[] args) {
 
		VariablePractice aa = new VariablePractice();
		
//		aa.method1();
//		aa.method2();
//		aa.method3();
		aa.method4();
		
		
	}
	
	
	//method1 메소드 만들기
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
	
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
	}
	
	public void method2() {
		
		int adult = 10000;
		int child = 7000;
		
		System.out.println("성인 2명 : " + (adult *2) + "원");
		System.out.println("청소년 3명 : " + (child *3) + "원");
		System.out.println();
		System.out.println("총 금액 : " +((adult *2) + (child *3)) + "원");
	}
	
	public void method3() {
		
		int x = 5;
		int y = 7;
		int z = 9;
		
		int a = 0;
		
		a = x;
		x = y;
		y = z;
		z = a;
		
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		System.out.println("z= " + z);
		
		
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 입력하세요 : ");
		
		String num1 = sc.next();
		sc.nextLine();
		
		System.out.println("첫번째 문자 : " + num1.charAt(0));
		System.out.printf("마지막 문자 : " + num1.charAt(7));
		
		
		// 요렇게 되면 computer보다 작은 단어를 입력하면 에러가 날거에요!
		// 이제 조건문 들어가고 반복문 들어가는데요! 반복문에서 배우게 되는 것 중 이 문제를 해결할 수 있는 힌트를 얻으 실 수 있는데요!
		// 그때 풀어보셔도 되구~ 만약 지금 생각해보고 싶다면 좀 더 고민해보셔도 됩니다!
				
		
	}
}
