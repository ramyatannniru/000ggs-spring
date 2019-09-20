package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class HomeRestController {
	@Autowired
private StudentDao dao;
	@GetMapping("/home")
	public String getHome()
	{

		return "welcome to spring boot! its break time";
	}
	@Transactional
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		return dao.getAllStudents();
	}
	@PostMapping("/student")
	public void create(@RequestBody Student theStudent)
	{
	dao.createNewStudent(theStudent);
		
	}
}
