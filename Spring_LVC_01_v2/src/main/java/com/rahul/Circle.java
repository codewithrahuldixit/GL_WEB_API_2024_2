package com.rahul;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("circle")
@Lazy
public class Circle implements Shape{
	
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Circle Object Is Created");
	}

	//Parameterized Constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	//Getter
	public int getRadius() {
		return radius;
	}

	//Setter
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
