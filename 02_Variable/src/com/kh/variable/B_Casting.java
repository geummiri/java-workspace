package com.kh.variable;

public class B_Casting {

		/*
		 * 형 변환(Casting) -> 자료형을 변환시킨다.
		 * - 값의 타입을 다른 타입으로 변환하는 것
		 * - boolean 을 제외한 기본형은 서로 형변환 가능
		 */
	
	public static void main(String[] args) {
		B_Casting b = new B_Casting();
//		b.autoCasting();
		b.casting();
	}
		/*
		 * 자동 형 변환( 묵시적 형 변환)
		 * - 자동으로 형 변환이 이루어지기 때문에 따로 형변환하지 않아도됨.
		 * - 데이터 범위가 작은 자료형을 큰 자료형으로 변환 
		 */
	
	public void autoCasting() {
		byte b = 10; // 1byte
		short s = b; // 2byte
		int i = s; // 4byte
		long l = i; // 8byte
		
		float f = l; //4byte(표현 가능한 수의 범위가 더 크기 때문에 자동 형변환이 가능)
		double d = l; //8byte
		
		System.out.println("b : " + b);
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		
		double result = 12 + 3.3;
		// byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리
		int result2 = b + s;
		
		System.out.println("-------------------");
		System.out.println(result);
		System.out.println(result2);
		
		/* 강제 형 변환(명시적 형 변환)
		 * 
		 * [표현법](자료형) 데이터;
		 * -범위가 큰 크기의 자료형의 테디터를 작은 크기의 자료형태로 젼환하려고 할 때 사용
		 * -강제 형 변환의 경우 데이터 손실이 발생할 수 있음 ex) 큰 컵에서 작은 컵으로 물 넣을때 물이 손실되는 경우
		 */
	
	}
	
	public void casting() {
		
		double d = 4.12345678904567890; // 소수점 15자리수까지만 가능
		float f = (float)d; // 6자리수
		int i = (int)f;
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);

		System.out.println("-------------------------------");

		int sum =  (int) (i + d); //정수랑 실수 만나면 정수됨 i와d를 한개로 묶기
		int sum2 = i + (int)d; // d를 먼저 정수로 만들고 값 만들기
		
		System.out.println("sum : " + sum);
		System.out.println("sum2 : " + sum2);
		
		System.out.println("-------------------------------");
		
		int number = 290;
		byte bNumber = (byte)number;
		
		System.out.println("number : " + number);
		System.out.println("bNumber : " + bNumber);
		
		int number2 = 128;
		byte bNumber2 = (byte)number2;
		
		System.out.println("-------------------------------");
		
		System.out.println("number2 : " + number2);
		System.out.println(bNumber2); //128 숫자가 넘어가서 -128로 나옴
		
		//char <-> int : 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능 (유니코드)
		//char는 음수값 저장 불가 -> 값의 범위가 0 ~ 65535
		
		System.out.println("-------------------------------");

		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 52143;
		System.out.println("ch : " + ch);


		



	}
}