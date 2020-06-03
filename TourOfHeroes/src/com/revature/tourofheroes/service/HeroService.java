package com.revature.tourofheroes.service;

import com.revature.tourofheroes.exceptions.InvalidHealthValueException;
import com.revature.tourofheroes.models.Hero;

public class HeroService {
	public boolean createHero() {
		String[] specialMoves = {"heat vision", "flight", "invulnerability"};
		Hero newHero;
		try {
			newHero = new Hero("Superman", specialMoves, 2, false);
			System.out.println(newHero);
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (InvalidHealthValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			System.out.println("I tried so hard, and got so far!");
		}
		//try with resources - to read on
		
		return false;
		
	}
}

