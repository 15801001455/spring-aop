package com.itheima12.spring.aop.xml.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAOPTest {
	@Test
	public void testAnnotationAOP(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.savePerson();
	}
}
