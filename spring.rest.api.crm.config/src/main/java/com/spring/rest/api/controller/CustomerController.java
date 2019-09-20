package com.spring.rest.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.api.customer.Customer;
import com.spring.rest.api.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerController {
@Autowired
	private CustomerService service;
	@GetMapping("customers")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomer();
	}
}