package com.example.demo.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.*;
import com.example.demo.repository.ReciepeRepository;


@Controller
@RequestMapping("/reciepe")
public class HomeController {

	public HomeController(ReciepeRepository reciepeRepository) {
		super();
		this.reciepeRepository = reciepeRepository;
	}


	private ReciepeRepository reciepeRepository;
	

	
	
	@GetMapping("/add")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Reciepe reciepe =new Reciepe();
		
		theModel.addAttribute("reciepes", reciepe);
		
		return "reciepe-form";
	}

	
	
	
	@PostMapping("/save")
	public String save(@ModelAttribute("reciepes")Reciepe reciepe) {
		
		// save the employee
		reciepeRepository.save(reciepe);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/reciepes";
	}
	
	
	@PostMapping("/reciepes")
	public String getAll(Model theModel) {
		
		// delete the employee
		theModel.addAttribute("reciepes", reciepeRepository.findAll());
		
		// redirect to /employees/list
		return "redirect:/employees/list";
		
	}
}

