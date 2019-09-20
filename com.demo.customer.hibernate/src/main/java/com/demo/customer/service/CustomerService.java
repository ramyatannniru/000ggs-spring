package com.demo.customer.service;

import java.util.List;

import com.demo.customer.entity.Customer;


public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	public void delete(int id);
	
}