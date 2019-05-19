package com.itheima12.proxy;

public class PersonDaoProxy implements PersonDao{
	private PersonDao personDao;
	private Transaction transaction;
	public PersonDaoProxy(PersonDao personDao,Transaction transaction) {
		super();
		this.personDao = personDao;
		this.transaction = transaction;
	}

	public void savePerson() {
		/**
		 * 1、开启事务
		 * 2、执行目标方法
		 * 3、事务提交
		 */
		this.transaction.beginTransaction();
		this.personDao.savePerson();
		this.transaction.commit();
	}
}
