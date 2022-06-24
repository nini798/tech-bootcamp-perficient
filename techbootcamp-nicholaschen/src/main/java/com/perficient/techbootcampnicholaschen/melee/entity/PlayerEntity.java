package com.perficient.techbootcampnicholaschen.melee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "player")
public class PlayerEntity {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLAY_SEQ")
	private int playerId;
	private String name;
	private String main;
	private int ranking;
	
	public PlayerEntity() {}
	
	public PlayerEntity(String name, String main, int ranking) {
		this.setName(name);
		this.setMain(main);
		this.setRanking(ranking);
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
}
