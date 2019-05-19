package com.itheima12.spring.jdbc.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
	@Test
	public void testSavePerson(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao3");
		personDao.savePerson("insert into person(name,description) values('aa','aa')");
	}
}
