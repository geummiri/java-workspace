package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {

		ArrayPractice arr = new ArrayPractice();
//	arr.method1();
//	arr.method2();
//		arr.method3();
	arr.method4();
//	arr.method5();

	}

	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 */
	public void method1() {

		String[] arr = { "바나나", "사과", "오렌지", "수박", "배" };

		System.out.println((arr[1]));

	}

	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된
	 * 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5 배열 0번째 인덱스에 넣을 값 : 4 배열 1번째 인덱스에 넣을 값 : -4 배열 2번째 인덱스에 넣을 값 : 3 배열 3번째
	 * 인덱스에 넣을 값 : -3 배열 4번째 인덱스에 넣을 값 : 2 [4, -4, 3, -3, 2] 2
	 */
	public void method2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int a = sc.nextInt();

		String b = "";
		int sum = 0;

		int[] num = new int[a];

		for (int i = 0; i < num.length; i++) {

			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			num[i] = sc.nextInt();
			sum += num[i];

			if (i == (num.length - 1)) {

				System.out.println(Arrays.toString(num));

				System.out.println(sum);

			}

		}
	}

	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을
	 * 출력하세요.
	 * 
	 */
	public void method3() {

		Scanner sc = new Scanner(System.in);
		String[] arr = { "치킨", "떡볶이", "피자", "햄버거" };

		System.out.print("음식 메뉴 : ");
		String menu = sc.nextLine();

		int i = 0;
		while (true) {

			if (i >= arr.length) {
				System.out.println("배달 불가능");
				break;
			}

			if (menu.equals(arr[i])) {
				System.out.println("배달가능");
				break;
			}

			i++;
		}
	}


	/*
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
	 * 
	 * 주민등록번호 : 123456-1234567 123456-1******
	 * 
	 */
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("주민등록번호 : ");
		String usernum = sc.nextLine();
		
		char[] num = new char[usernum.length()];
		
		for(int i=0; i<num.length; i++) {
			
			if(i>=8) 
				num[i] = '*';
				
			
			else 
				num[i] = usernum.charAt(i);
				
			
			System.out.print(num[i]);

		}
		} 
	
		//charAt(i) 사용해서 8번째부터는 *로 표기하고싶어 
	
		
		
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
	 * 
	 * 단어 입력 : programming gnimmargorp
	 * 
	 */
	
	public void method5() {
		

	}
}

