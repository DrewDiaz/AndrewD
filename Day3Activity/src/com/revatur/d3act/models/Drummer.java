package com.revatur.d3act.models;

public class Drummer extends Musician{

	public Drummer() {
		
	}
	
	public Drummer(String name, Integer songsMade) {
		this.name = name;
		this.instrument = "drums";
		this.songsMade = songsMade;
	}
	
	
}
