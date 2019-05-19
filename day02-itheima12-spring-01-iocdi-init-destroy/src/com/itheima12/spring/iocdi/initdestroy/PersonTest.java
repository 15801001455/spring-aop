package com.itheima12.spring.iocdi.initdestroy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void testPerson(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
	}
}
