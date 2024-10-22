package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringLvc01Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		String name = (String)context.getBean("Name");
		Long number = (Long)context.getBean("Contact");
		System.out.println(name);
		System.out.println(number);
		//By Name
	//	Circle circle = (Circle)context.getBean("circle");
	//	Rectangle rectangle = (Rectangle)context.getBean("rect");
		//By Type
		Circle circle = context.getBean(Circle.class);
		Rectangle rectangle = context.getBean(Rectangle.class);
		System.out.println(circle);
		System.out.println(rectangle);
		Shape  shape = context.getBean(Shape.class);
		System.out.println(shape);
		
	}

}
