package com.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class SpringLvc01Application {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(SpringLvc01Application.class);
		
		//By Name
	//	Circle circle = (Circle)context.getBean("circle");
	//	Rectangle rectangle = (Rectangle)context.getBean("rect");
		//By Type
	/**	Circle circle = context.getBean(Circle.class);
		Rectangle rectangle = context.getBean(Rectangle.class);
		System.out.println(circle);
		System.out.println(rectangle);
		Shape  shape = context.getBean(Shape.class);
		System.out.println(shape);*/
	//	DrawingApp  d = context.getBean(DrawingApp.class);
	//	d.draw();
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		System.out.println(context.getBean(DrawingApp.class).hashCode());
		
	}

}
