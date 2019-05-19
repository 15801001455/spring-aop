package com.itheima12.spring.aop.xml.privilege.service.impl;

import com.itheima12.spring.aop.xml.privilege.annotation.PrivlegeInfo;
import com.itheima12.spring.aop.xml.privilege.service.PersonService;

public class PersonServiceImpl implements PersonService{
	@PrivlegeInfo(name="savePerson")
	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("save person");
	}

	@PrivlegeInfo(name="updatePerson")
	public void updatePerson() {
		// TODO Auto-generated method stub
		System.out.println("update person");
	}
}
