package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {
		
		Book b1 = new Book("HTML+CSS+자바스크립트", 30000, 0.2, "고경희"); //import 꼭 해주기!!!!
		
		Book b2 = new Book();
		
		b2.setTitle("리액트 200제");
		b2.setprice(25000);
		b2.setdiscountRate(0.1);
		b2.setauthor("이정열");
		
//		System.out.println(b1);
//		System.out.println(b2);
		
		System.out.println("b1 책 할인 적용된 가격은 : "+ (int)(b1.getprice() - (b1.getprice() * b1.getdiscountRate())));
		System.out.println("b2 책 할인 적용된 가격은 : "+ (int)(b2.getprice() - (b2.getprice() * b2.getdiscountRate())));
		
//		System.out.println("b1 책 할인 적용된 가격은 : "+ );

		
		
		//Getter를 이용하여 두 객체 각각 할인율을 적용한 책 가격을 계산해서 출력
		
		
	}

}
