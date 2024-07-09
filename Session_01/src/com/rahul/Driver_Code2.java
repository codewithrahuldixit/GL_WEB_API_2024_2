package com.rahul;

import com.rahul.demo2.Circle;
import com.rahul.demo2.DrawingApp;
import com.rahul.demo2.Rectangle;

public class Driver_Code2 {

	public static void main(String[] args) {
		//Loose Coupled Example
		Circle circle = new Circle(12);
		Rectangle rectangle = new Rectangle(12,13);
		DrawingApp da= new DrawingApp(rectangle);
		da.draw();

	}

}
