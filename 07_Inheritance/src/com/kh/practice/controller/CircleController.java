package com.kh.practice.controller;

import com.kh.practice.model.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return c.draw() + " / " + radius * radius * Math.PI;
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return  c.draw() + " / " + radius * 2 * Math.PI;
	}
	
}
