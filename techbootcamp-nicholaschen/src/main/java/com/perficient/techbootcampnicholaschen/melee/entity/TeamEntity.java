package com.perficient.techbootcampnicholaschen.melee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity(name = "team")
public class TeamEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TEAM_SEQ")
	private int teamId;
	
	private String name;
	
	private String initials;
	
	private String logo;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "team_id")
	private List<PlayerEntity> playerList;
	
	public TeamEntity() {}
	
	public TeamEntity(String name, String initials, String logo, List<PlayerEntity> playerList) {
		this.setName(name);
		this.setInitials(initials);
		this.setLogo(logo);
		this.setPlayerList(playerList);
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
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

	public List<PlayerEntity> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<PlayerEntity> playerList) {
		this.playerList = playerList;
	}
}
