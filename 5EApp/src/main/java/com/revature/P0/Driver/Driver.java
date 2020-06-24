package com.revature.P0.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.revature.P0.dao.CharacterDAO;
import com.revature.P0.dao.CharacterDAOImpl;
import com.revature.P0.dao.DAOUtilities;
import com.revature.P0.models.Character;

public class Driver {

	public static void main(String[] args)
	{
	
		
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		int selection = 1;
		CharacterDAO dao = new CharacterDAOImpl();
		System.out.println("----WELCOME To 5E Character App----");
		System.out.println("");
		
		
		
		
		while(on) {
			System.out.println("Please enter the number next to the option you choose:");
			System.out.println("[0] Quit");
			System.out.println("[1] See all saved characters");
			System.out.println("[2] Create a character");
			System.out.println("[3] Roll a die with a character");
			System.out.println("[4] Deal damage to a character");
			int choice = sc.nextInt();
				switch(choice) {
		
					case 1: 
							List<Character> list = dao.getAllCharacters();
							for (int i = 0; i < list.size(); i++){
								Character f = list.get(i);
								System.out.println(f);
								}
							break;
								
					case 2: 
					try {
						dao.saveCharacter(dao.makeCharacter(sc));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
						break;
					
					case 3:
						System.out.println("Which character are you rolling with? (Choose with ID)");
						List<Character> list2 = dao.getAllCharacters();
						for (int i = 0; i < list2.size(); i++){
							Character f = list2.get(i);
							System.out.println(f);
							}
						selection = sc.nextInt();
						System.out.println(selection);
						System.out.println("What stat are you rolling? (Please enter the id associated)");
						System.out.println("[1] STR");
						System.out.println("[2] DEX");
						System.out.println("[3] CON");
						System.out.println("[4] INT");
						System.out.println("[5] WIS");
						System.out.println("[6] CHA");
						System.out.println("[7] An attack!");
						int stat = sc.nextInt();
						System.out.println("What size dice are you rolling?");
						int size = sc.nextInt();
						System.out.println("You rolled a "+dao.rollDice(selection, stat, size));
						
						break;
							
						
					case 4:
						System.out.println("Which character took damage? (Choose with ID)");
						List<Character> list3 = dao.getAllCharacters();
						for (int i = 0; i < list3.size(); i++){
							Character f = list3.get(i);
							System.out.println(f);
							}
						selection = sc.nextInt();
						
						System.out.println("How much damage did they take?");
						int damage = sc.nextInt();
						
						Connection connection = null;
						Statement stmt = null;
						
						try {
							connection = DAOUtilities.getConnection();
							stmt = connection.createStatement();
							String sql1 = "SELECT hp_cur AS hp FROM playercharacters WHERE playerid="+selection;
							ResultSet rs = stmt.executeQuery(sql1);
							int oldhp = 0;
							if(rs.next()) {
								 oldhp = rs.getInt("hp");
								}
							int newhp = oldhp-damage;
							if(newhp>0) {
								String sql2 = "UPDATE playercharacters SET hp_cur="+newhp+"WHERE playerid="+selection;
								stmt.executeUpdate(sql2);
								rs = stmt.executeQuery(sql1);
								rs.next();
								System.out.println("Your new HP is at "+rs.getInt("hp"));
							}else {
								String sql2 = "DELETE FROM playercharacters WHERE playerid="+selection;
								stmt.executeUpdate(sql2);
								System.out.println("YOU DIED!");
							}
						}catch(SQLException e) {
							e.printStackTrace();
						}
						break;
					case 0:
						sc.close();
						on = false;
						break;
		
		
		 
		    }
		
		
		}
	}
	
	
}
