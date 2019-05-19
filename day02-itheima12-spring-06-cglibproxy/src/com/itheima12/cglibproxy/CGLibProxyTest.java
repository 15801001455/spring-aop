package com.itheima12.cglibproxy;

import org.junit.Test;


/**
 * 通过cglib产生的代理对象，代理类是目标类的子类
 * @author zd
 *
 */
public class CGLibProxyTest {
	@Test
	public void testCGlib(){
		Object target = new PersonDaoImpl();
		Transaction transaction = new Transaction();
		MyInterceptor interceptor = new MyInterceptor(target, transaction);
		PersonDaoImpl personDaoImpl = (PersonDaoImpl)interceptor.createProxy();
		personDaoImpl.savePerson();
	}
}
