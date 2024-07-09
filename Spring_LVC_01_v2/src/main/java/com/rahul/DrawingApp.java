package com.rahul;

public class DrawingApp {

	private Shape shape;

	public DrawingApp(Shape shape) {
		super();
		this.shape=shape;
	}
	
	public void draw() {
		System.out.println("Shape Object Is Printed " + shape);
	}
}
