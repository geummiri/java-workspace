package com.kh.practice;

public class S23Ultra extends SmartPhone implements Phone, Pen, Camera {
	
	String name = "S23 Ultra";
	String brand = "삼성";
	
	
		
	public S23Ultra(String name, String brand) {
		
	}
	public void printInformaiton() {
		super.printInformation(name, brand);
	}

	@Override
	public boolean pen() {
		return true;
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		return "2억 화소 카메라";
	}

	
}
