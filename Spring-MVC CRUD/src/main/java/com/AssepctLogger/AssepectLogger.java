package com.AssepctLogger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import com.Controller.EmpController;

@Aspect
public class AssepectLogger {

	private static Logger log = Logger.getLogger(EmpController.class);

	@Before("execution(* com.Controller.EmpController.*(..))")
	public void logBefore(JoinPoint point) {
		log.info(point.getSignature().getName() + "START... #### ");
	}

	@After("execution(* com.Controller.EmpController.*(..))")
	public void logafter(JoinPoint point) {
		log.info(point.getSignature().getName() + " END... ####");
	}

	@AfterReturning(pointcut = "execution(* com.Controller.EmpController.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		log.info(joinPoint.getSignature().getName() + ": " + result.toString() + " ####");
	}

}
