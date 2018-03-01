package com.pattern.behavioral.strategy.football.formation;

import java.util.List;

import com.pattern.behavioral.strategy.football.FootballPlayer;

public interface Formation {
	String formationInfo();
	void toArrange(List<FootballPlayer> players);
}
