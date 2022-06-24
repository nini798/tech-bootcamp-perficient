package com.perficient.techbootcampnicholaschen.melee.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.perficient.techbootcampnicholaschen.melee.domain.Player;
import com.perficient.techbootcampnicholaschen.melee.domain.Team;
import com.perficient.techbootcampnicholaschen.melee.jpa.MeleeJpaService;

@Configuration
public class InitData {

	@Autowired
	private MeleeJpaService meleeJpaService;
	
	@PostConstruct
	private void init() {
		meleeJpaService.createTeam(new Team(0, "Panda Global", "PG", 
				"https://ssb.wiki.gallery/images/thumb/3/37/PandaHD.png/1200px-PandaHD.png",pandaPlayers()));
		meleeJpaService.createTeam(new Team(1, "Golden Guardian", "GG", 
				"https://upload.wikimedia.org/wikipedia/en/thumb/1/1a/Goldenguardians_logo.svg/1200px-Goldenguardians_logo.svg.png",ggPlayers()));
		meleeJpaService.createTeam(new Team(2, "Team SoloMid", "TSM",
				"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/TSM_Logo.svg/302px-TSM_Logo.svg.png",tsmPlayers()));
	}
	
	private List<Player> pandaPlayers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(1,"Plup", "Sheik", 10));
		players.add(new Player(2,"IBDW", "Fox", 2));
		return players;
	}
	
	private List<Player> ggPlayers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(3,"Zain","Marth", 3));
		players.add(new Player(4,"PPMD","Marth, Falco", 40));
		players.add(new Player(5,"n0ne","Captain Falcon", 19));
		return players;
	}
	
	private List<Player> tsmPlayers() {
		List<Player> players = new ArrayList<>();
		players.add(new Player(6,"Leffen","Fox", 4));
		return players;
	}
	
}
