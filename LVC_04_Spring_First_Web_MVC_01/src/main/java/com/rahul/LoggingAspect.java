package com.rahul;

import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingAspect {
private Logger logger = LoggerFactory.getLogger(getClass());


@Before("execution(* com.rahul.StudentController.*.*(..))")
public void logMethodBeforeCall() {
logger.info("Before Method is Called - {}");
}



}
