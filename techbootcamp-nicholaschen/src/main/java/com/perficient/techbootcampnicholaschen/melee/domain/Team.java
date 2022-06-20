package com.perficient.techbootcampnicholaschen.melee.domain;

import java.util.Collections;
import java.util.List;

public class Team {

	private int id;
	private String name;
	private String initials;
	private String logo;
	private List<Player> players;
	
	public Team() {
		this.players = Collections.emptyList();
	}
	
	public Team(int id, String name, String initials, String logo) {
		this.id = id;
		this.name = name;
		this.initials = initials;
		this.logo = logo;
		this.players = Collections.emptyList();
	}
	
	public Team(int id, String name, String initials, String logo, List<Player> players) {
		this.id = id;
		this.name = name;
		this.initials = initials;
		this.logo = logo;
		this.players = players;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
