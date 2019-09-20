package com.example.demo.services;



import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import com.example.demo.data.Player;

import com.example.demo.repository.PlayerRepo;
import com.example.demo.dto.PlayerDto;

@Service
public class PlayerService implements PlayerServiceImpl {
	private Environment env;
	@Autowired
	private PlayerRepo playerRepo;
	@Autowired
	public PlayerService(Environment env, PlayerRepo playerRepo) {
		super();
		this.env = env;
		this.playerRepo = playerRepo;
	
	}
	@Override
	public PlayerDto createUser(PlayerDto playerDto) {
		
		String spass = UUID.randomUUID().toString();
		System.out.println(spass);
//		leagueDto.setUserid(spass);
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			
			
			Player userEntity = mapper.map(playerDto, Player.class);
			playerRepo.save(userEntity);
		PlayerDto tempDto = mapper.map(userEntity, PlayerDto.class);
			return tempDto;
	}

	

}