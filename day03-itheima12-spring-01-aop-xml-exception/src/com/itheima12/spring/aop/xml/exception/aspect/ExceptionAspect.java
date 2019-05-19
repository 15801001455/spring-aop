package com.itheima12.spring.aop.xml.exception.aspect;

import org.aspectj.lang.JoinPoint;

/**
 * 说明：
 *     切面的通知是处理异常的，而这个异常处理是完全独立于系统之外的内容
 * @author zd
 *
 */
public class ExceptionAspect {
	public void throwingExcetion(JoinPoint joinPoint,Throwable ex){
		System.out.println(ex.getMessage());
	}
}
