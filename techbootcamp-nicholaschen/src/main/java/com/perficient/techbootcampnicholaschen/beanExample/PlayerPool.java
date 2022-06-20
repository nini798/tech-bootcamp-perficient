package com.perficient.techbootcampnicholaschen.beanExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PlayerPool {
	@Autowired
	@Qualifier("p1")
	private Gamer p1Player;
	
	@Autowired
	@Qualifier("p2")
	private Gamer p2Player;
	
	public Gamer getP1Player() {
		return p1Player;
	}
	
	public Gamer getP2Player() {
		return p2Player;
	}
}
