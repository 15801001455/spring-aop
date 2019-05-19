package com.itheima12.spring.itheima12;

public class PersonDao extends Itheima12Template{
	public void savePerson() throws Exception{
		this.insert("insert into person(name,description) values('aa','aa')");
	}
}
