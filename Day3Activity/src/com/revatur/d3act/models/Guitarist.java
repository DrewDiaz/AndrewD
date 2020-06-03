package com.revatur.d3act.models;

public class Guitarist extends Musician{

	public Guitarist() {
		
	}
	
	public Guitarist(String name, Integer songsMade) {
		this.name = name;
		this.instrument = "guitar";
		this.songsMade = songsMade;
	}
	
	
}
