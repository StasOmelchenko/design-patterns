package com.pattern.behavioral.strategy.football;

import com.pattern.behavioral.strategy.football.formation.MetodoFormation;

public class Match {

	private FootballTeam homeTeam;
	private FootballTeam guestTeam;

	private void play() {
		homeTeam.play();
		guestTeam.play();
	}
	
	private void stop() {
		homeTeam.stop();
		guestTeam.stop();
	}

	public void start() {
		System.out.println(homeTeam.getName() + " vs " + guestTeam.getName());
		System.out.println("First time:");
		play();

		pause();

		System.out.println("First time:");
		play();
		
		System.out.println("End of the match");
		stop();
	}

	public void pause() {
		System.out.println("Pause:");
		stop();
		guestTeam.setFormation(new MetodoFormation());
	}

	public FootballTeam getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(FootballTeam homeTeam) {
		this.homeTeam = homeTeam;
	}

	public FootballTeam getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(FootballTeam guestTeam) {
		this.guestTeam = guestTeam;
	}

}
