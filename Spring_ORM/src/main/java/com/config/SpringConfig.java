package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


//@Configuration 
//@ComponentScan("com.")
//@PropertySource("classpath:db.properties")

public class SpringConfig {
	
	@Autowired	Environment env;
	
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
	public LocalSessionFactoryBean sessionFactory() {
		Properties pro=new Properties();
		pro.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		pro.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
		pro.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		pro.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(dataSource());
		//lsf.setPackagesToScan("com.");
		lsf.setHibernateProperties(pro);
		lsf.setPackagesToScan(new String[] {"com.model" });
		
		return lsf;
		
	}
	@Bean
public	HibernateTransactionManager mytransaction() {
		
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory((SessionFactory) sessionFactory());
		
		
		return htm;
	}
	
	@Bean
	public HibernateTemplate hTemplate() {
		
		HibernateTemplate hibenateTemplate=new HibernateTemplate();
		hibenateTemplate.setSessionFactory((SessionFactory) sessionFactory());
		
		return hibenateTemplate;
		
		
		
	}
}
