package com_spring_form_demo;

import javax.annotation.PostConstruct;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component(value="JdbcTemplate")
public class Jdbcfile extends JdbcTemplate {
 @Autowired
 private BasicDataSource datasource;
  @PostConstruct
  public void init()
  {
	  
  }
	
}
