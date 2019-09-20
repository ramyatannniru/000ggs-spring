package com_demo_customer.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com_demo_customer.entity.Customer;
import com_demo_customer.service.CustomerService;

@Controller
//@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService service;

	@GetMapping("/")
	public String showForm(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		return "customer-home";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute("customer") Customer theCustomer, Model theModel)

	{
		service.createCustomer(theCustomer);
		return "redirect:/";
	}
}