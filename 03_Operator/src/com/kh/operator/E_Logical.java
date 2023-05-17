package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
		
	/*
	 * 논리 연산자
	 * - 두개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과마저도 논리값
	 * 
	 * 논리값 && 논리값 : (and, 그리고) 왼쪽, 오른쪽 둘 다 true인 경우 : 결과값 -> true
	 * 논리값 || 논리값 : (or, 또는) 왼쪽, 오른쪽 둘 중 하나라도 true인 경우 : 결과값 -> true
	 * 
	 */
	
	public static void main(String[] args) {
		
		E_Logical e = new E_Logical();
//		e.method1();
//		e.method2();
		e.method3();
		
	}
	
	public void method1() {
		
		int number = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		System.out.print("임의의 정수를 입력해주세요 > ");
		number = sc.nextInt();
		
		//1<=number<=100 -> 이렇게 사용할수없음
		result = (number >=1) && (number <= 100);
		System.out.println(number + "는 1부터 100사이의 값인가요? : " + result);

	}
	public void method2() {
		
		//Short Cut Evaluation
		int number = 10;
		boolean result = false;
		
		//&& 연산자를 기준으로 앞에서 이미 false가 나오면 뒤의 연산은 수행하지 않는다.
	 	result = (number < 5) && (++number > 0);
//		result = (++number > 0) &&  (number < 5);
		
		System.out.println(result);
		System.out.println(number);
		
//		|| 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행하지 않는다.
		result = (number < 20) || (++number>  0);
		System.out.println(result); //앞에 true가 나와서 뒤는 연산하지 않음, number는 그대로 10
		
	}
	/*
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z'까지가 코드값으로 65~90까지의 숫자로 나열
	 */
	
	public void method3() {
	 	
		Scanner sc = new Scanner(System.in);
		
		boolean result = true;
		
		System.out.print("알파벳 작성 > ");
		char a = sc.nextLine().charAt(0);
		
		
		result = (a>=65) && (a<=90);
		System.out.println("사용자가 입력한 값이 대문자입니까 ? : "  + ((a >= 'A') && (a <='Z')));
		
//		System.out.println("알파벳이 대문자인가요 ? " + result);
//		System.out.println((int)a);
		
		
	}
}
