package com.rahul.configuration;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfiguration {

	@Pointcut("execution(* com.rahul.controller.*.*(..))")
	public void allcontrollerAspect() {}
	
	@Pointcut("@annotation (java.lang.annotation.RetentionPolicy.RUNTIME)")
	public void timeTrack() {}
	
	
}
