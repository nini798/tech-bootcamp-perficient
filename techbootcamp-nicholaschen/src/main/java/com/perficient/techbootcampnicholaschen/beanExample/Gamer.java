package com.perficient.techbootcampnicholaschen.beanExample;

public class Gamer {
	String name;
	String character;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCharacter(String character) {
		this.character = character;
	}
	
	public String toString() {
		String out = "Name: " + name + ", Character: " + character;
		return out;
	}
}
