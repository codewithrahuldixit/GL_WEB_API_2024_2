package com.rahul;

import com.rahul.demo1.Circle;
import com.rahul.demo1.DrawingApp;

public class Driver_Code1 {

	public static void main(String[] args) {
		//Tightly Coupled Example
		Circle circle = new Circle(12);
		DrawingApp da= new DrawingApp(circle);
		da.draw();

	}

}
