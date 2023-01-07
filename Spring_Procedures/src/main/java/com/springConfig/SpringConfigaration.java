package com.springConfig;

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
@PropertySource("classpath:db.properties")
@ComponentScan("com.")
public class SpringConfigaration {
	
@Autowired
	Environment envi;


@Bean
public DataSource dataSource() {
	
	BasicDataSource basicDataSource =new BasicDataSource();
	basicDataSource.setUrl(envi.getProperty("mysql.url"));
	basicDataSource.setDriverClassName(envi.getProperty("mysql.driver"));
	basicDataSource.setUsername(envi.getProperty("mysql.username"));
	basicDataSource.setPassword(envi.getProperty("mysql.password"));
	
	return basicDataSource;
		
	}
@Bean
public 	JdbcTemplate jdbcTemplate() {

	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource());
	return jdbcTemplate;
	
	
}
}
	
	


