package com.itheima12.spring.aop.xml.privilege.annotation;

import java.lang.reflect.Method;

public class AnnotationParse {
	/*
	 * targetClass  目标类的class形式
	 * methodName  在客户端调用哪个方法，methodName就代表哪个方法
	 */
	public static String parse(Class targetClass,String methodName) throws Exception{
		String methodAccess = "";
		/**
		 * 该方法没有参数
		 */
		Method method = targetClass.getMethod(methodName);
		//判断方法上面是否存在PrivilegeInfo注解
		if(method.isAnnotationPresent(PrivlegeInfo.class)){
			//得到方法上面的注解
			PrivlegeInfo privlegeInfo = method.getAnnotation(PrivlegeInfo.class);
			methodAccess = privlegeInfo.name();
		}
		return methodAccess;
	}
}
