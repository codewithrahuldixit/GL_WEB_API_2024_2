package com.rahul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigurationDemo {

	@Bean(name = "Name")
	public String getName() {
		return "Rahul Kumar Dixit";
	}
	
	@Bean (name = "Contact")
	public Long getContact() {
		return 9015088066l;
	}
	
	@Bean ("circle")
	@Primary
	public Circle getCircle() {
		return new Circle(12);
	}
	
	@Bean("rect")
	public Rectangle getRectangle() {
		return new Rectangle(12,12);
	}
}
