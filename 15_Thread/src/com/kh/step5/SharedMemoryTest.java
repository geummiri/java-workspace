package com.kh.step5;

public class SharedMemoryTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		//공유 자원 사용할 시 문제점 : user1 출력값 100, user2 출력값 50 이나
		//멀티스레드여서 두 값이 50 나오게 됨
		//문제 해결 방법 : 메서드에 synchronized(동기화) 처리하기
		// -> public synchronized void setMemory()
	}

}
