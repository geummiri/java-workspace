package com.kh.practice.model;

public class CookBook extends Book{
	
	private boolean coupon; //요리 쿠폰 유무

	public CookBook() {}

	public CookBook(String title, boolean coupon) {
		super(title);
		this.coupon = coupon;
	}

	public boolean isCoupon() { //게터세터 boolean 은 is로 표현
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return super.toString() + " / CookBook [coupon=" + coupon + "]";
	}
	
}
