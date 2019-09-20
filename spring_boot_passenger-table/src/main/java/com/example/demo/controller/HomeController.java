package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repositories.ReservationRepositories;

@Controller
@RequestMapping("/api")
public class HomeController {
	
	private ReservationRepositories reservationRepositories;
	
	
	public HomeController(ReservationRepositories reservationRepositories) {
		super();
		this.reservationRepositories = reservationRepositories;
	}


	@RequestMapping("/reservations")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("reservations",reservationRepositories.findAll());
		return "reservations";
	}

}