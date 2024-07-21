package com.rahul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DrawingApp {

	// @Autowired//Field Injection
	// @Qualifier("square")
	private Shape shape;// Dependency Must be injected Here of Shape Type
//circle , Rectangle 
	// Constructor Injection

	//@Autowired
	//@Qualifier("square")
	public DrawingApp(Shape shape) {
		super();
		this.shape = shape;
		System.out.println("Drawing Object Is Created");
	}

	public void draw() {
		System.out.println("Shape Object Is Printed " + shape);
	}

//	@Autowired //Setter Injection
	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
