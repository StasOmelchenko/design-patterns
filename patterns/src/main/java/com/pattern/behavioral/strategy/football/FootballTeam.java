package com.pattern.behavioral.strategy.football;

import java.util.ArrayList;
import java.util.List;

import com.pattern.behavioral.strategy.football.formation.Formation;

public class FootballTeam {
	
	private String name;
	private List<FootballPlayer> players;
	private Formation formation;
	
	public FootballTeam() {
		players = new ArrayList<>();
	}
	
	public FootballTeam(String name) {
		players = new ArrayList<>();
		this.name = name;
	}
	
	public void play() {
		System.out.println(name + ": The players start playing");
		System.out.print(name + ": ");
		formation.toArrange(players);
	}
	
	public void stop() {
		System.out.println(name + ": The players stop playing");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public FootballPlayer getPlayer(Integer index) {
		return players.get(index);
	}
	
	public void addPlayer(FootballPlayer player) {
		players.add(player);
	}

	public List<FootballPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(List<FootballPlayer> players) {
		this.players = players;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}	
}
