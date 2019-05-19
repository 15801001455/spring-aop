package com.itheima12.jdkproxy.salary;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class SalaryTest {
	@Test
	public void testSalary(){
		Object target = new SalaryManagerImpl();
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("asfd");
		MyInterceptor interceptor = new MyInterceptor(target, logger, security, privilege);
		SalaryManager  proxy = (SalaryManager)Proxy.newProxyInstance(
					target.getClass().getClassLoader(), 
					target.getClass().getInterfaces(), interceptor);
		proxy.showSalary();
	}
}
