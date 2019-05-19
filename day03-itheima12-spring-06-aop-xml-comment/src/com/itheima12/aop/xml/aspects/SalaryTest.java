package com.itheima12.aop.xml.aspects;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryTest {
	@Test
	public void testSalary(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Privilege privilege = (Privilege)context.getBean("privilege");
		privilege.setAccess("asfd");
		SalaryManagerImpl salaryManager = (SalaryManagerImpl)context.getBean("salaryManager");
		salaryManager.showSalary();
	}
}
