package com.pattern.behavioral.strategy.football.formation;

import java.util.List;

import com.pattern.behavioral.strategy.football.FootballPlayer;

public class WMFormation implements Formation {
	private String formation;
	
	public WMFormation() {
		formation = "3-2-5";
	}
	
	@Override
	public void toArrange(List<FootballPlayer> players) {		
		System.out.println(String.format("The players uses %s formation", formation));
	}
	
	@Override
	public String formationInfo() {
		return formation;
	}
	
}
