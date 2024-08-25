package com.rahul.configuration;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect // This is Aspect which have to be weaved
//Advice 
public class LoggingAspect {
	private Logger logger = LoggerFactory.getLogger(getClass());


	// "execution(* (Return) com.rahul.* (Class) .*(..))"
	@Before("com.rahul.configuration.CommonPointCutConfiguration.allcontrollerAspect()")
	public void logMethodBeforeCall(JoinPoint joinPoint) {
		logger.info("Before Method is Called - {} and with these values {} ", joinPoint, joinPoint.getArgs());
	}

	@After("com.rahul.configuration.CommonPointCutConfiguration.allcontrollerAspect()")
	public void logMethodAfterCall(JoinPoint joinPoint) {
		logger.info("After Method is Called - {} ", joinPoint);
	}

	@AfterThrowing(pointcut = "com.rahul.configuration.CommonPointCutConfiguration.allcontrollerAspect()", throwing = "exception")
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - {} has thrown an exception {}", joinPoint, exception);
	}

@AfterReturning(
			pointcut = "com.rahul.configuration.CommonPointCutConfiguration.allcontrollerAspect()",
			returning = "resultValue"
			)
			public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint, 
			Object resultValue) {
			logger.info("AfterReturning Aspect - {} has returned {}"
			, joinPoint, resultValue);

}

	@Around("com.rahul.configuration.CommonPointCutConfiguration.timeTrack()")
	// ProceedingJoinPoint : used to Proceed the method
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
	//Start a timer
	long startTimeMillis = System.currentTimeMillis();
	//Execute the method
	Object returnValue = proceedingJoinPoint.proceed();
	//Stop the timer
	long stopTimeMillis = System.currentTimeMillis();
	long executionDuration = stopTimeMillis - startTimeMillis;
	logger.info("Around Aspect - {} Method executed in {} ms"
	,proceedingJoinPoint, executionDuration);
	return returnValue;
	}


}
