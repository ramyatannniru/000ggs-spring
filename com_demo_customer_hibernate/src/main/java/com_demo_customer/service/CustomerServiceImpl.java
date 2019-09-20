package com_demo_customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com_demo_customer.dao.*;
import com_demo_customer.entity.Customer;;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao dao;
	public void createCustomer(Customer theCustomer) {
		dao.createCustomer(theCustomer);

	}

}