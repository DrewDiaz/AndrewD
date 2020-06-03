package com.revatur.d3act.models;

abstract class Musician {

	protected String name;
	protected String instrument = "music";
	protected Integer songsMade;
	
	//instance several musicians and name them --
	//have each play their instrument (overriding) --
	//use wrapper to get length of songsMade to give ranking --
	//write the stats of each musician to a file and then read it off
	
	public void playMusic() {
		System.out.println(name+" plays "+instrument+" vigorously!");
	}
	
	public void playMusic(String song) {
		System.out.println(name+" played a new song called " + song + "!");
		songsMade++; 
	}
	
	public void rankMe() {
		String rankS = songsMade.toString();
		
		System.out.println("I'm "+name+" and my song making rank is "+rankS.length()+ "!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public Integer getSongsMade() {
		return songsMade;
	}

	public void setSongsMade(Integer songsMade) {
		this.songsMade = songsMade;
	}
	
}
