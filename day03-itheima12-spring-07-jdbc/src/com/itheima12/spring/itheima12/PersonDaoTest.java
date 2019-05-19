package com.itheima12.spring.itheima12;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
	@Test
	public void testPersonDao() throws Exception{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao2");
		personDao.savePerson();
	}
}
