package com.ctgu.proname.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class testaop {
	@Pointcut("execution(* com.ctgu.proname.controller.*.*(..))")
	public void testAop() {
	}

	@Before("testAop()")
	public void testAop1() {
		System.out.println(" UserController beforeAdvice ... ");
	}
}
