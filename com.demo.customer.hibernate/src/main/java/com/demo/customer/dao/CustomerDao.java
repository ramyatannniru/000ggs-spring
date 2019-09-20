package com.demo.customer.dao;

import com.demo.customer.entity.Customer;

import java.util.List;




public interface CustomerDao {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	public void delete(int id);
	
}