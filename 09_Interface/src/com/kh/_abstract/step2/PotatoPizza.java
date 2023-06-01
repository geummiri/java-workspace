package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {

	public PotatoPizza(int price, String storeName) {
		//super(price, storeName);
		this.price = price;
		this.storeName = storeName; //부모클래스에서 protected로 정의 내려서 자식 클래스에서 this로 사용 가능
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}
	
	

}
