package com.itheima12.spring.aop.xml.time.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima12.spring.aop.xml.time.action.PersonAction;

public class TimeTest {
	@Test
	public void testTime(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.savePerson();
	}
}
