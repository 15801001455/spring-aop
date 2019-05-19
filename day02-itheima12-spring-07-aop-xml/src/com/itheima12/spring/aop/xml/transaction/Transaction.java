package com.itheima12.spring.aop.xml.transaction;


//切面
public class Transaction {
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	
	public void commit(){
		System.out.println("commit");
	}
}
