package com.perficient.techbootcampnicholaschen.melee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perficient.techbootcampnicholaschen.melee.domain.Team;
import com.perficient.techbootcampnicholaschen.melee.jpa.MeleeJpaService;

@RestController
public class meleeController {
	@Autowired
	private MeleeJpaService meleeJpaService;
	
	@GetMapping("/team")
	public List<Team> getTeams() {
		List<Team> teams = meleeJpaService.getTeams();
		return teams;
	}
	
	@PostMapping("/team")
	public Team createTeam(@RequestBody Team team) {
		return meleeJpaService.createTeam(team);
	}
}
