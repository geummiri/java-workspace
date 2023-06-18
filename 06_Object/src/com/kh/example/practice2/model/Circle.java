package com.kh.example.practice2.model;

public class Circle {
	
	public final static double PI = 3.14; //상수는 final 적기!!!! final만 적으면 다른 클래스에서 사용 못하나 static 적어주면 가눙

	public int radius = 1; //접근제한자? public 없어도됨
	
//	public double dimensions() { 
//	return radius * radius * PI;
//	}
//	
//	public double round() {
//		return (radius * 2) * PI;
//	}
	
	public void incrementRadius() {
		++radius;
	};
}

//넓이 : 반지름 * 반지름 * 3.14
//둘레 : 지름 * 3.14