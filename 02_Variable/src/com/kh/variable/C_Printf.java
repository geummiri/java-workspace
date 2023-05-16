package com.kh.variable;

public class C_Printf {
		
	public static void main(String[] args) {
		//System.out.print(출력하고자하는값); - 출력만 함 (줄바꿈 발생 X)
		//System.out.println(출력하고자하는값); - 출력 후 줄바꿈 발생 O

		System.out.print("hello\n");
		System.out.println("hello");
		
		//System.out.printf("출력하고자하는 형식(포맷)", 출력하고자하는값, 값, ..............);
		//출력하고자하는 값들이 제시한 형식에 맞춰서 출력만 진행
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		System.out.print(iNum1 + "% ");
		System.out.println(iNum2 + "%");

		System.out.printf("%d%%, %d%%\n",iNum1, iNum2);
		
		System.out.println("-----------------------");
		
		//5칸의 공간 확보 후 오른쪽 정렬 (음수면 왼쪽)
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%5d\n", 250);
		System.out.printf("%-5d\n", -12);
		System.out.printf("%10d\n", 20);
		System.out.printf("%d\n", 20);

		System.out.println("-----------------------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		//무조건 소수점 아래 6째짜리까지 보여줌 (ex. 0이여도 모두 보여줌 4.53 -> 4.530000)  
		System.out.printf("%f\t%f\n", dNum1, dNum2); // \t 탭키 -> 탭 \n 엔터 -> 줄 바꿈
		System.out.printf("%f\t%.2f\n", dNum1, dNum2); // 소수점 자리 바꿈 -> %f -> 소수점 두번째 자리 나타내려면 %.2f 
		
		System.out.println("-----------------------");

		char ch = 'a';
		String str = "Hello";
		
		// a Hello a
		System.out.printf(" %c %s %c\n", ch, str, ch);
		
		// A Hello A
		System.out.printf(" %C %S %C\n", ch, str, ch);
		
	}
	
}
