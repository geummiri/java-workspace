package com.kh.step2;

import com.kh.step2.model.Card;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(Card.width);  //클래스변수는 인스턴스 생성 없이 호출 가능!!!!!!!!!!!
		System.out.println(Card.height);
		
		System.out.println();
		
		Card c1 = new Card(); //인스턴스 생성
		c1.kind = "Heart"; //인스턴스변수 호출
		c1.number = 7;
		
		Card c2 = new Card(); //인스턴스 생성
		c2.kind = "Spade";
		c2.number = 3;
		
		//클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다.
		
		c1.width = 50; //static에 붙여져 있는 변수는 한개만 변경되는게 아니라 전부 변경됨
		c1.height = 80; //c1, c2 모두 변경

		System.out.println("첫번째 카드는 " + c1.kind + " " + c1.number + "이며, 크기는 " + c1.width + " X " + c1.height + " 입니다.");
		System.out.println("두번째 카드는 " + c2.kind + " " + c2.number + "이며, 크기는 " + c2.width + " X " + c2.height + " 입니다.");
		
	}

}
