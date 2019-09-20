package com.spring.rest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.api.customer.Customer;
import com.spring.rest.api.dao.CustomerDao;
@Service
public class CustomerServiceImpl implements CustomerService{
   @Autowired
	private CustomerDao dao;
@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

}