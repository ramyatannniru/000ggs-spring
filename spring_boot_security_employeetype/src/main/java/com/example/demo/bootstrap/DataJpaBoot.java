package com.example.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

import com.example.demo.repository.EmployeeRepository;

@Component
public class DataJpaBoot implements ApplicationListener<ContextRefreshedEvent> {

@Autowired
public DataJpaBoot(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
		
	}

public DataJpaBoot() {
		super();
		// TODO Auto-generated constructor stub
	}

private EmployeeRepository employeeRepository ;


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		Employee emp=new Employee("ramya","tanniru","tsr@","permenant","","","6773","887");
	employeeRepository.save(emp);
		
        
        
	
	}

}