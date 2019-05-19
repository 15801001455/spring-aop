package com.itheima12.spring.hibernate.transaction.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SessionFactoryTest {
	@Test
	public void testSessionFactory(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory = (SessionFactory)context.getBean("sessionFactory2");
		System.out.println(sessionFactory);
	}
}
