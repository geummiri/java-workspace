package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println(c.radius * 2 * c.PI);
		System.out.println(c.radius * c.radius * c.PI);
		c.incrementRadius();
		System.out.println(c.radius * 2 * c.PI);
		System.out.println(c.radius * c.radius * c.PI);
	}

}
