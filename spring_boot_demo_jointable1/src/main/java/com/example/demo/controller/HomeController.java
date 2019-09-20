package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.BookRepository;

@Controller
@RequestMapping("/api")
public class HomeController {
	
	private BookRepository bookRepository;
	
	
	public HomeController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("books",bookRepository.findAll());
		return "books";
	}

}