package com.itheima12.spring.aop.xml.transaction;

public class PersonDaoImpl implements PersonDao{
	public String savePerson() {
//		/int a = 1/0;
		System.out.println("save person");
		return "aaa";
	}
}
