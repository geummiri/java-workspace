package com.kh.inheritance;

import com.kh.inheritance.child.Notebook;
import com.kh.inheritance.child.SmartPhone;
import com.kh.inheritance.child.Tv;

public class Application {
	
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("애플","a1111","맥북 프로 14",2790000,"m2");
		SmartPhone phone = new SmartPhone("삼성","s2222","S23 울트라", 1590000,"SKT");
//		Tv tv = new Tv();
		
		
		System.out.println(notebook);
		System.out.println(phone);
	}
}
