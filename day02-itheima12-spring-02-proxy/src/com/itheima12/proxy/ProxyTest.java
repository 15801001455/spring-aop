package com.itheima12.proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void testProxy(){
		PersonDao personDao = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		PersonDaoProxy proxy = new PersonDaoProxy(personDao, transaction);
		proxy.savePerson();
	}
}
