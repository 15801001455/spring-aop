package com.itheima12.spring.aop.xml.time.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimeAspect {
	public void methodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable{
		String targetClassName = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		long preTime = System.currentTimeMillis();
		joinPoint.proceed();//执行目标类的目标方法
		long postTime = System.currentTimeMillis();
		long executionTime = postTime-preTime;
		System.out.print("当前的类是:"+targetClassName+",");
		System.out.print("当前的方法是:"+methodName+",");
		System.out.print("当前方法的开始时间:"+preTime+",");
		System.out.println("当前方法的执行时间:"+executionTime);
	}
}
