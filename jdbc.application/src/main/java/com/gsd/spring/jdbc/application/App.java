package com.gsd.spring.jdbc.application;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;
import com.spring.bean.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao=context.getBean("eDao",EmployeeDao.class);
        dao.createEmployee(new Employee(1,"ramya"));
       System.out.println(dao.getAllEmployee().toString());
        
    }
}