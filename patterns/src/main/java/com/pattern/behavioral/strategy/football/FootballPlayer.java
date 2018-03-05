package com.pattern.behavioral.strategy.football;

public class FootballPlayer {

	private String name;
	private String surname;
	private Integer age;
	private Integer skillLevel;
	
	public FootballPlayer() { }
	
	public FootballPlayer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public FootballPlayer(String name, String surname, Integer skillLevel) {
		this(name, surname);	
		this.skillLevel = skillLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}
}
