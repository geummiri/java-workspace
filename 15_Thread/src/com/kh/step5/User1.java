package com.kh.step5;

public class User1 extends Thread {

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		setName("CalculatorUser1"); //setName은 Thread가 가지고있음
		
	}
	
	public void run() {
		calculator.setMemory(100);//User1을 실행하면 메모리 값이 100으로 바뀐다.
		
	}
	
	
}
