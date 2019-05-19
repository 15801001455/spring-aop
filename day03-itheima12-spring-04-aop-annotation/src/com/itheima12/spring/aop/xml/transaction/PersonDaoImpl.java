package com.itheima12.spring.aop.xml.transaction;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		System.out.println("save person");
	}
}
