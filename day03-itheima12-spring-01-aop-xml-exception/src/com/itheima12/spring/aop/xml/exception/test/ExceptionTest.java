package com.itheima12.spring.aop.xml.exception.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima12.spring.aop.xml.exception.service.StudentService;

public class ExceptionTest {
	@Test
	public void testException() throws Exception{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		PersonService personService = (PersonService)context.getBean("personService");
//		personService.updatePerson();
		StudentService studentService = (StudentService)context.getBean("studentService");
		studentService.savePerson();
	}
}
