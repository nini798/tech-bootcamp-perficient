package com.perficient.techbootcampnicholaschen.melee.domain;

public class Player {

	private Integer id;
	private String name;
	private String main;
	
	public Player() {}
	
	public Player(int id, String name, String main) {
		this.id = id;
		this.name = name;
		this.main = main;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
}
