package com.example.demo.controller;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.*;
import com.example.demo.model.*;

import com.example.demo.services.*;
import com.example.demo.dto.*;
@RequestMapping("/")
@RestController
public class LeagueController {
	@Autowired
	private LeagueService leagueService;
	
	@PostMapping("/leagues")
	public ResponseEntity<CreateLeagueReaponseModel> createUser(@RequestBody CreateLeagueRequestModel leagueDetail) {
		
//		userDetail.setPassword(bCryptPasswordEncoder.encode(userDetail.getPassword()));
		System.out.println(leagueDetail.getTitle());
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		League userEntity=mapper.map(leagueDetail,League.class);
		System.out.println(userEntity.getSeason());
		LeagueDto leagueDto = mapper.map(userEntity,LeagueDto.class);
		
		LeagueDto temp = leagueService.createUser(leagueDto);
		CreateLeagueReaponseModel model = mapper.map(temp, CreateLeagueReaponseModel.class);
		return new ResponseEntity<CreateLeagueReaponseModel>(model, HttpStatus.CREATED);
	}
}