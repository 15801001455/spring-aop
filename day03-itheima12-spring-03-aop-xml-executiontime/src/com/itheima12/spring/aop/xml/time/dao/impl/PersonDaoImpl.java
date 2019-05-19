package com.itheima12.spring.aop.xml.time.dao.impl;

import com.itheima12.spring.aop.xml.time.dao.PersonDao;

public class PersonDaoImpl implements PersonDao{

	public void savePerson(){
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("save person");
	}
}
