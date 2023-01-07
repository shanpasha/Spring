package com.config;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.apache.commons.dbcp.BasicDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration 
@ComponentScan("com.")
@PropertySource("classpath:db.properties")
@org.springframework.transaction.annotation.Transactional

public class SpringConfig {
	public static	Logger log= LoggerFactory.getLogger(Controller.class);
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

	public Properties hibernatePro() {
		Properties pro=new Properties();
		pro.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		pro.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
		pro.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
		pro.put("hibernate.hbm2ddl.auto", env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		log.info("pro{}",pro);
		return pro;
		
		
	}
	
	 
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		log.info("before get session{}");
		LocalSessionFactoryBean lsf=new LocalSessionFactoryBean();
		lsf.setDataSource(dataSource());
		lsf.setPackagesToScan("com.");
		lsf.setHibernateProperties(hibernatePro());
		lsf.setPackagesToScan(new String[] {"com.model" });
		log.info("after get session{}",lsf);
		log.info("first..............");
		return lsf;
		
	}
	
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory().getObject());
		return transactionManager;
	}
	
	
	
	@Bean
	public HibernateTemplate hTemplate() {
		
		HibernateTemplate hibenateTemplate=new HibernateTemplate();
		hibenateTemplate.setSessionFactory( sessionFactory().getObject());
		
		return hibenateTemplate;
		
		
		
	}
}
