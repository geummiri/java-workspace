package com.kh.practice;

public class Application {

	public static void main(String[] args) {
		
		
		IPhone14Pro iphone = new IPhone14Pro(null, null);
		
		iphone.printInformation();
		iphone.takeCall();
		iphone.makeCall();
		iphone.picture();
		iphone.pen();
		
		System.out.println();
		
		S23Ultra s23 = new S23Ultra(null, null);
		s23.printInformaiton();
		s23.takeCall();
		s23.makeCall();
		s23.picture();
		s23.pen();
		
//		System.out.println(s23);
	}

}
