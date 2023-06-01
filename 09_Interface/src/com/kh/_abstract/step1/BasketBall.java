package com.kh._abstract.step1;

public class BasketBall extends Sports{

	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
		
	}

	@Override //부모 클래스의 추상 메서드는 자식 클래스에서 끌어올때 오버라이드 꼭 적어줘야함 무조건!! 없으면 에러
	public void rule() {
		
		System.out.println("BasketBall의 선수의 수는 " + this.numberOfPlayers + "명, 공을 던져서 링에 넣어야한다.");
	}
	
}
