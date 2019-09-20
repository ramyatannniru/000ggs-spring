package com.spring.rest.api.dao;

import java.util.List;

import com.spring.rest.api.customer.Customer;

public interface CustomerDao {

	List<Customer> getAllCustomer();

}