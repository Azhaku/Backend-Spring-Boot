package org.techm.codingchallenges.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techm.codingchallenges.entity.Teams;
import org.techm.codingchallenges.repository.TeamsRepository;

@Service
public class TeamsService {
	
	@Autowired
	TeamsRepository teamsRepo;
	
	public List<Teams> getAllTeams() {
		return teamsRepo.findAll();
	}


}