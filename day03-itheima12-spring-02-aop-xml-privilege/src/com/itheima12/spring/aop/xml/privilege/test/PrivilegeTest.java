package com.itheima12.spring.aop.xml.privilege.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima12.spring.aop.xml.privilege.aspect.PrivilegeAspect;
import com.itheima12.spring.aop.xml.privilege.bean.Privilege;
import com.itheima12.spring.aop.xml.privilege.service.PersonService;

public class PrivilegeTest {
	@Test
	public void testPrivilege(){
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		/**
		 * 初始化用户的权限
		 */
		PrivilegeAspect privilegeAspect = (PrivilegeAspect)context.getBean("privilegeAspect");
		Privilege privilege1 = new Privilege();
		privilege1.setName("asfd");
		
		Privilege privilege2 = new Privilege();
		privilege2.setName("updatePerson");
		
		privilegeAspect.getPrivileges().add(privilege2);
		privilegeAspect.getPrivileges().add(privilege1);
		
		PersonService personService = (PersonService)context.getBean("personService");
		personService.savePerson();
	}
}
