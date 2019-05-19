package com.itheima12.spring.aop.xml.transaction;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Aspect
 * @Pointcut("execution(* com.itheima12.spring.aop.xml.transaction.PersonDaoImpl.*(..))")
 * private void aa(){}==
 * <aop:config>
  		<aop:pointcut 
  			expression="execution(* com.itheima12.spring.aop.xml.transaction.PersonDaoImpl.*(..))" 
  			id="aa()"/>
   </aop:config>
 * @author zd
 *
 */
@Component("transaction")
@Aspect
public class Transaction {
	@Pointcut("execution(* com.itheima12.spring.aop.xml.transaction.PersonDaoImpl.*(..))")
	private void aa(){}  //方法签名
	
	@Before("aa()")
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	
	@AfterReturning("aa()")
	public void commit(){
		System.out.println("commit");
	}
}
