package com.demo.controller;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.ToDo;

@RestController
@RequestMapping("/api")
public class ToDoController {
	private List<ToDo> list=null;
	
	@PostConstruct
	public void createList()
	{
		list=new ArrayList<ToDo>();
	}
	@GetMapping("/todos")
	public List<ToDo> getAllToDo()
	{
		
		list.add(new ToDo("Practice Spring Core",new Date()));
		list.add(new ToDo("Learn Spring AOP", new Date()));
		return list;
	}

}
