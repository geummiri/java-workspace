package com.kh._abstract.step2;

public abstract class Pizza {

	protected int price;
	protected String storeName;
	
	public Pizza() {}

	public Pizza(int price, String storeName) {
		this.price = price;
		this.storeName = storeName;
	}
	
	public void makePizza() { //추상클래스에는 일반 메서드도 들어갈 수 있음
		System.out.println(toString());
		dough();
		topping();
		bake();
		cut();
		box();
		System.out.println();
	}
	
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 빚다");
	}
	
	public abstract void topping(); //추상 클래스는 구현부{} 없음
	
	public void bake() {
		System.out.println("피자를 180도에서 10분간 구워냅니다.");
	}
	
	public void cut() {
		System.out.println("피자를 8등분으로 자릅니다.");
	}
	
	public void box() {
		System.out.println("피자 boxing..");
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + ", storeName=" + storeName + "]";
	}
	
	
}
