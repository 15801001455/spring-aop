package com.itheima12.spring.iocdi.initdestroy;

public class Person {
	private String name;
	
	public Person(){
		System.out.println("new instance");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public Person(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	
}
