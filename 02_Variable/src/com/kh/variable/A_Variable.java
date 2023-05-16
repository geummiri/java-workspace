package com.kh.variable;

public class A_Variable {

	
	/*
	 * 변수(Variable)란?
	 * - 하나의 값을 저장하는 "공간"
	 */
	
	public static void main(String[] args) {
		
		//실행할 메소드가 있는 클래스를 생성(new)해야 함
		A_Variable v = new A_Variable();
		
		
		//생성한 클래스로 메소드 실행(호출)
		v.printValue();
	}
	
	public void printValue() {
		
		//변수를 사용하지 않았을때
		System.out.println(10 * 2 * 3.141592); // 원의 둘레 = 반지름 * 2 * 3.141592
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 = 반지름 * 반지름 * 3.141592
		
		System.out.println("-----------------------");
		
		//변수 사용 시
		int r = 10;
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);
		
	}
	
	public void variableTest() {
		/*
		 * 변수의 선언
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 *  - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보
		 *  - 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용
		 *  
		 * 변수 초기화
		 * 
		 * [표현법] 변수명 = 값(리터럴);
		 * 
		 *  - 변수에 처음으로 값을 저장하는 것
		 *  - "="는 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자
		 */
		
		// 기본 자료형(Primitive type)
		// 실제 값을 저장
		// 논리형 : 1byte
		  boolean isTrue;
		  isTrue = true;
		  
		  boolean isFalse = false;
//		  isFalse = 1; //에러발생 -> 논리형만 가능

		  //문자형 : 2byte
		  char ch = 'a';
//		  ch = 'ab'; //에러발생 -> 한글자만 작성해야함
		  
		  //정수형
		  byte bNum; //1byte(8bit) : -128 ~ 127(256개)
		  short sNum; //2byte
		  int iNum; //4byte (기본)
		  long lNum; //8byte
		  
// 		  bNum = 128; //에러발생 -> 오버플로우(Overflow)
		  lNum = 9223372936854L; //숫자 뒤에 L 또는 l을 입력해야함
		  
		  //실수형
		  float fNum; //4byte
		  double dNum; //8byte (기본)
		  
		  fNum = 3.14F; //숫자 뒤에 F또는 f를 입력해야함
		  dNum = 3.14;
		  
		  // 참조 자료형 : 4byte, 기본형을 제외한 나머지(클래스)
		  // 주소 값을 저장
		  String name = "이한주"; //클래스 명령 규칙은 이름 맨앞이 대문자여서 String으로 작성
		  
		  // 변수의 명명 규칙
		  // 1) 대소문자 구분
		  int number;
		  int NUMBER;
		  int Number;
//		  String number; //자료형이 달라도 변수명이 같으면 에러 발생
		  
		  // 2) 숫자로 시작하면 안됨
//		  int 1age; //변수명 맨앞이 숫자라서 안됨
		  int a5g4e2; //숫자가 맨앞이 아니여서 가능
		  
		  // 3) 특수문자는 '_', '$' 만 사용 가능
		  int _age;
		  int a_g_e;
		  int age$;
		  int $age;
//		  int %age; 사용안됨
		  
		  // 4) 예약어(Reserved word) 사용 안됨
//		  int public;
//		  int void;
//  	  int int;
//		  int class;
		  
		  // 5) (권장사항) 낙타표기법 (카멜케이스)
		  // -첫글자는 항상 소문자
		  // -여러 단어가 올 때는 각 단어의 첫 글자를 대문자로 지정
//		  int maxnumber;
//		  int max_number;
		  int maxNumber; //권장사항
		  
	}
	
	public void constant() {
			/*
			 * 상수
			 * 
			 * [표현법] final 자료형 변수명;
			 * 
			 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
			 * - 초기화 이후에는 값을 변경할 수 없음
			 * 
			 */
		
			int age;
			age = 20;
			age = 25;
			
			final int AGE; //상수 작성 시 자료형 앞에 final 작성 후 변수명 전부 대문자 작성
			AGE = 30;
//			AGE = 35; //에러 발생 -> 상수 값 30 선언 했으므로 두번째 작성할 수 없음
			
			var age2 = 20;
			var age3 = "홍수민";
			
		}
	
	
}
