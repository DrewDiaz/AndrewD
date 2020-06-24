package com.revature.P0.dao;

import java.util.List;
import java.util.Scanner;

import com.revature.P0.models.Character;

public interface CharacterDAO {

	List<Character> getAllCharacters();
	Character makeCharacter(Scanner sc) throws Exception;
	void saveCharacter(Character characterToSave) throws Exception;
	int rollDice(int selection, int stat, int size);
}
