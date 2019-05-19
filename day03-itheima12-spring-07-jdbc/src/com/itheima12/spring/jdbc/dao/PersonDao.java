package com.itheima12.spring.jdbc.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDao extends JdbcDaoSupport{
	public void savePerson(String sql){
		this.getJdbcTemplate().execute(sql);
	}
}
