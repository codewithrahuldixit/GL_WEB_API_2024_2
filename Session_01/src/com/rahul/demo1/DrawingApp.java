package com.rahul.demo1;

public class DrawingApp {

	private Circle circle;

	public DrawingApp(Circle circle) {
		super();
		this.circle = circle;
	}
	
	public void draw() {
		System.out.println("Circle Object Is Printed " + circle);
	}
}
