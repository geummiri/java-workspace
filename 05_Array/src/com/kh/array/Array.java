package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		 * 표현법
		 * 배열선언 
		 * 자료형[]배열명; 자료형 배열명[];
		 * String[] num; String num[]
		 *
		 * 배열초기화 
		 * 배열명 = new 자료형[배열크기] //배열도 클래스?
		 * 
		 * 선언 초기화 동시에
		 * 자료형[] 배열명 = new 자료형[배열크기];
		 *	String[] num = new String[6];
		 * 
		 * 
		 */
		
		Array a = new Array();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
		a.method6();
	}
		//배열의 전체 합 구하
		public void method1(){
			int[] score = new int[] { 100, 90, 80, 70, 60 };
			int sum = 0;
			for(int i=0; i<score.length; i++) {
				
				sum += score[i];
				
			}
			
			System.out.println(sum);

		}
		//3명의 키를 입력받아 배열에 저장, 3명의 키 평균값 구하기
		//키 입력 > 180 키 입력 > 177.3 키 입력 > 168.2
		//키값 더블로 받기 
		public void method2() {
			
			//입력받아서 넣을 배열 먼저 만들기
			double arr[] = new double[3];
			//평균값 변수 생성 
			double avg = 0;
			//평균 구하기 위한 합계 변수 생성
			int sum = 0;

			//배열에 집어넣기 위해 for문 사용해서 돌리기
			for(int i=0; i<arr.length; i++) {
			
			//3명의 키를 입력받을 스캐너 생성 후 arr[] 배열에 집어넣기
			arr[i] = sc.nextDouble();
			//키가 들어간 배열을 하나씩 sum 값에 넣어주기 
			
			sum += arr[i];
			}
			System.out.println("3명의 평균 키의 값은 : " + sum / arr.length);
			
		}
		/*
		 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후 각 
		 * 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
		 * 
		 * 정수 : 5 
		 * 배열 0번째 인덱스에 넣을 값 : 4 
		 * 배열 1번째 인덱스에 넣을 값 : -4 
		 * 배열 2번째 인덱스에 넣을 값 : 3 
		 * 배열 3번째 인덱스에 넣을 값 : -3 
		 * 배열 4번째 인덱스에 넣을 값 : 2 
		 * [4, -4, 3, -3, 2]
		 * 2
		 */
		public void method3() {
			//배열의 크기 사용자에게 입력받기 
			int num = 0;
			System.out.print("정수 : ");
			num = Integer.parseInt(sc.nextLine());
			//입력받은 값 배열에 집어넣기 생성 및 초기화 완료 
			int arr[] = new int[num];
			
			//배열 인덱스 값 전부 받으면 합계가 필요하므로 합계 생성 및 초기화 해주기
			int sum = 0;
			//배열의 크기만큼 인덱스 값 하나씩 사용자에게 받기
			//for문 이용해서 0부터 길이만큼 받기
			for(int i=0; i<arr.length; i++) {
			
				System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : " );
				arr[i] = sc.nextInt();
				sum += arr[i];
				
				if(i == (arr.length-1)) {
					System.out.println(Arrays.toString(arr));
					System.out.println(sum);

				}
			}
		}
		/*
		 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 
		 * 배열 사용해서 사용자가 입력한 값이 배열에 있으면 
		 * "배달 가능", 없으면 "배달 불가능"을
		 * 출력하세요.
		 * 
		 */
		public void method4() {
			//if문 사용해서 하기
			//관리자가 먼저 음식메뉴랑 개수지정하고
			//고객한테 값 받기
			
			//고객에게 메뉴 입력하게 만들어주기
			System.out.print("음식 입력 : ");
			String customerMenu = sc.nextLine();
			
			//메뉴 넣을 배열 생성
			//배열 값 한개당 전부 돌리면서 값이 한개만 나와야해서 while문으로 사용 
			String[] menu = {"짜장면", "탕수육", "볶음밥", "깐풍기"};
			
			//while문은 반복횟수가 정해져있지 않고 값이 false일때 while문을 벗어난다. 
			//사용자로부터 유효한 값을 얻어낼 때까지 계속 반복 
			int num = 0;

			while(true) {
				if(customerMenu.equals(menu[num])) {
					System.out.println("배달가능");
					break;
				}
				if(num >= menu.length) {
					System.out.println("배달 불가능");
					break;
				}
				num++;
			}
		}	
		/*
		 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열은 건드리지 않고!
		 * 
		 * 주민등록번호 : 123456-1234567 123456-1******
		 * 
		 */
		public void method5() {
			
			
			
			//사용자 주민번호 배열로 받아야하므로, 배열 생성
			System.out.print("주민번호 입력 : ");
			String numUser = sc.nextLine();
			
			char num[] = new char[numUser.length()];

			//사용자에게 주민번호 입력받기
			
			//for 사용해서 배열의 8번째부터 *처리할
			for(int i=0; i<num.length; i++) {
				if(i>=8) {
				num[i] = '*';
			}
				else {
					num[i] = numUser.charAt(i);
				}
				System.out.print(num[i]);
		}
	}
		/*
		 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요.
		 * 단어 입력 : programming gnimmargorp
		 * 
		 */
		public void method6() {
			
			//사용자가 입력할 단어
			System.out.println("단어를 입력하시오. >> ");
			String str = sc.nextLine();
			//배열 사용하기
			char userStr[] = new char[str.length()];
					
			for(int i=userStr.length-1; i>=0; i--) {
				userStr[i] = str.charAt(i);
				System.out.print(userStr[i]);
			}
		}
}

