package com.itheima12.spring.hibernate.transaction.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.itheima12.spring.hibernate.transaction.dao.PersonDao;
import com.itheima12.spring.hibernate.transaction.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}
}
