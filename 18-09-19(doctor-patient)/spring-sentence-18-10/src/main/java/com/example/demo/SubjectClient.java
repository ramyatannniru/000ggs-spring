package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("SUBJECT")
public interface SubjectClient {

	@GetMapping("/")
	Word getWord();
	
}