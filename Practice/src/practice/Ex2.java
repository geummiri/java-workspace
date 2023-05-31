package practice;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//두 수를 더하기
		//바이트 크기 정수면 어떻게 구현할건지
		//long int 는 4바이트 정수까지 저장 가능
		//입력 : 첫번째 줄에는 문제의 정수 N이 주어진다 4의 배수
		//N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형 이름 출력
		//예시 입력 4 -> 출력 long int 입력 20 -> 출력 long long long long int
		
		
			String str1 = new String("long");
			
			System.out.println("숫자 입력 :");
			int number = sc.nextInt();
			int num = number / 4;
			
			System.out.print(str1 );
			
		}
			
	}
			

