package com.itheima12.jdkproxy;

public class Transaction implements Interceptor{
	public void interceptor() {
		System.out.println("transaction");
	}
}
