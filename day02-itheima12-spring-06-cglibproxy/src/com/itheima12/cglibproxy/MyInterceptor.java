package com.itheima12.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyInterceptor implements MethodInterceptor{
	private Object target;//目标类
	private Transaction transaction;
	
	
	public MyInterceptor(Object target, Transaction transaction) {
		super();
		this.target = target;
		this.transaction = transaction;
	}
	
	public Object createProxy(){
		//代码增强类
		Enhancer enhancer = new Enhancer();
		enhancer.setCallback(this);//参数为拦截器
		enhancer.setSuperclass(target.getClass());//生成的代理类的父类是目标类
		return enhancer.create();
	}


	public Object intercept(Object arg0, Method method, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		this.transaction.beginTransaction();
		method.invoke(target);
		this.transaction.commit();
		return null;
	}
	
}
