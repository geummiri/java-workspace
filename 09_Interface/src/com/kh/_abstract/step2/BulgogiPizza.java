package com.kh._abstract.step2;

public class BulgogiPizza extends Pizza{

	public BulgogiPizza(int price, String storeName) {
		super(price, storeName);
		
	}

	@Override
	public void topping() { //오버라이드 꼭 해주기
		System.out.println("Bulgogi Topping ....");
	}

	
	
	
}
