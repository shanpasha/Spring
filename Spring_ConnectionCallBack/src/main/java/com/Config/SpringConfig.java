package com.Config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration 
@ComponentScan("com.")
@PropertySource("classpath:db.properties")
public class SpringConfig {
	
	@Autowired
	Environment env;
	
	@Bean
public	DataSource dataSource() {
	BasicDataSource basicDataSource=new BasicDataSource();
	basicDataSource.setUrl(env.getProperty("mysql.url"));
	basicDataSource.setDriverClassName(env.getProperty("mysql.driver"));
	basicDataSource.setUsername(env.getProperty("mysql.username"));
	basicDataSource.setPassword(env.getProperty("mysql.password"));
	
	return basicDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
		
		return jdbcTemplate;
		
		
		
		
		
		
	}
	
	
}
