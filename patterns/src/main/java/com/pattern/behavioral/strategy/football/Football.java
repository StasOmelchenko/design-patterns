package com.pattern.behavioral.strategy.football;

import com.pattern.behavioral.strategy.football.formation.PyramidFormation;
import com.pattern.behavioral.strategy.football.formation.WMFormation;

public class Football {

	public static void main(String[] args) {
		FootballTeam firstTeam = new FootballTeam("Barcelona");
		firstTeam.setFormation(new PyramidFormation());
		
		FootballTeam secondTeam = new FootballTeam("Real Madrid");
		secondTeam.setFormation(new WMFormation());
		
		Match match = new Match();
		match.setHomeTeam(firstTeam);
		match.setGuestTeam(secondTeam);
		match.start();
	}
}