package com.itheima12.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 拦截器
 *    1、目标类导入进来
 *    2、事务导入进来
 *    3、invoke完成
 *        1、开启事务
 *        2、调用目标对象的方法
 *        3、事务的提交
 * @author zd
 *
 */
public class MyInterceptor implements InvocationHandler{
	private Object target;//目标类
	private Transaction transaction;
	
	
	public MyInterceptor(Object target, Transaction transaction) {
		super();
		this.target = target;
		this.transaction = transaction;
	}

	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if("savePerson".equals(methodName)||"updatePerson".equals(methodName)
				||"deletePerson".equals(methodName)){
			this.transaction.beginTransaction();//开启事务
			method.invoke(target);//调用目标方法
			this.transaction.commit();//事务的提交
		}else{
			method.invoke(target);
		}
		return null;
	}
}
