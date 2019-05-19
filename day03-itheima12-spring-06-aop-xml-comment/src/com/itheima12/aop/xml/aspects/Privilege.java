package com.itheima12.aop.xml.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class Privilege {
	private String access;

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}
	
	public void controlShowSalary(ProceedingJoinPoint joinPoint) throws Throwable{
		if("admin".equals(this.access)){
			joinPoint.proceed();
		}else{
			System.out.println("对不起，没有权限查看工资");
		}
	}
}
