package com.itheima12.spring.itheima12;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.jdo.JdoTemplate;
import org.springframework.orm.jdo.support.JdoDaoSupport;

public class Itheima12Template {
	private DataSource dataSource;
	public Itheima12Template(){
		
	}
	
	public Itheima12Template(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(String sql) throws Exception{
		Connection conn = this.dataSource.getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
	}
}
