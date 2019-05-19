package com.itheima12.spring.hibernate.transaction.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima12.spring.hibernate.transaction.domain.Person;
import com.itheima12.spring.hibernate.transaction.service.PersonService;

public class PersonServiceTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService)context.getBean("personService");
		Person person = new Person();
		person.setName("afds");
		personService.savePerson(person);
	}
}
