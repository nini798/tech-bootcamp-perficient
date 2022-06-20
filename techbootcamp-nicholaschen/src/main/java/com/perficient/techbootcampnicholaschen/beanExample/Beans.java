package com.perficient.techbootcampnicholaschen.beanExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
	
	@Bean(name = "p1")
	public Gamer createP1Player() {
		Gamer player = new Gamer();
		player.setName("p1");
		player.setCharacter("mario");
		return player;
	}
	
	@Bean(name = "p2")
	public Gamer createP2Player() {
		Gamer player = new Gamer();
		player.setName("p2");
		player.setCharacter("luigi");
		return player;
	}
}
