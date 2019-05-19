package com.itheima12.spring.hibernate.transaction.service.impl;

import com.itheima12.spring.hibernate.transaction.dao.PersonDao;
import com.itheima12.spring.hibernate.transaction.domain.Person;
import com.itheima12.spring.hibernate.transaction.service.PersonService;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void savePerson(Person person) {
		this.personDao.savePerson(person);
	}
}
