package com.kh.practice1;

/*
 * 컴파일 에러(compile-time error) : 컴파일 시 에 발생하는 에러
 * 런타임 에러(runtime error) : 실행 시에 발생하는 에러
 * 논리적 에러(logical error) : 실행은 되지만, 의도와 다르게 동작
 *  
 * 에러(error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
 * 	--> 메모리 부족(OutOfMememoryError) 또는 스택오버플로우(StackOverflowError)
 * 
 * - 예외(exception) : 프로그램 코드에 의해서 수습될 수 있는 오류
 * 
 * Object > Throwable > Exception / Error
 * 
 */

public class A_TryCatch {
	
	/* 예외처리하기
	 * try ~ catch
	 * 
	 * [표현법]
	 * 		
	 * try {
	 * 		//예외가 발생할 가능성이 있는 코드
	 * } catch(예외클래스 e) {
	 * 		//try 블록에서 예외가 발생할 때
	 * 		// --> catch 블록으로 이동하여 예외 처리 코드 실행
	 * } [finally {
	 * 		//예외가 발생하거나 그렇지 않아도 무조건 실행
	 *		//finally 주로 자원을 반납하는 코드 ... close() 
	 * 	 
	 * }] 있어도 없어도 무관
	 * 
	 * - printStachTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의
	 * 						 정보와 예외 메세지를 화면에 출력
	 * 
	 * - getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있음
	 * 
	 */
	public static void main(String[] args) {
		//예외처리하기 최상위 클래스는 Exception()
		try {
			throw new Exception(); //고의로 예외 발생!!!
		}	catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
