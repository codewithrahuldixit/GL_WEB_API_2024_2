package com.rahul;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class Rectangle implements Shape{

	private int length;
	private int breath;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Rectangle Object Is Created");
	}

	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}
