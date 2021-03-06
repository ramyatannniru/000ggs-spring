package com.example.demo.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import com.example.demo.data.League;

import com.example.demo.repository.LeagueRepo;
import com.example.demo.dto.LeagueDto;

@Service
public class LeagueService implements LeagueServiceImpl {
	private Environment env;
	
	private LeagueRepo leagueRepo;
	@Autowired
	public LeagueService(Environment env, LeagueRepo leagueRepo) {
		super();
		this.env = env;
		this.leagueRepo = leagueRepo;
	
	}
	@Override
	public LeagueDto createUser(LeagueDto leagueDto) {
		
		
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			
			League userEntity = mapper.map(leagueDto, League.class);
			leagueRepo.save(userEntity);
		LeagueDto tempDto = mapper.map(userEntity, LeagueDto.class);
			return tempDto;
	}

	

}