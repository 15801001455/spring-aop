package com.itheima12.spring.jdbc.datasource;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {
	@Test
	public void testDataSource(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource)context.getBean("dataSource");
		System.out.println(dataSource);
	}
}
