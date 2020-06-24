package com.revature.P0.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.revature.P0.dao.DAOUtilities;
import com.revature.P0.models.Character;

public class CharacterDAOImpl implements CharacterDAO{

	public List<Character> getAllCharacters()
	{
		List<Character> characters = new ArrayList<Character>();
		Connection connection = null;
		Statement stmt = null;
		
		
		try {
			connection = DAOUtilities.getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT * FROM playercharacters";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			while(rs.next())
			{
				Character temp = new Character();
				
				temp.setPlayerID(rs.getInt("playerid"));
				temp.setName(rs.getString("name"));
				temp.setPlayername(rs.getString("playername"));
				temp.setClassid(rs.getInt("classid"));
				temp.setLevel(rs.getInt("level"));
				temp.setSTR(rs.getInt("STR"));
				temp.setDEX(rs.getInt("DEX"));
				temp.setCON(rs.getInt("CON"));
				temp.setINT(rs.getInt("INT"));
				temp.setWIS(rs.getInt("WIS"));
				temp.setCHA(rs.getInt("CHA"));
				temp.setHp_max(rs.getInt("hp_max"));
				temp.setHp_cur(rs.getInt("hp_cur"));
				temp.setPartyid(rs.getInt("partyid"));
				temp.setInvid(rs.getInt("invid"));
				
				characters.add(temp);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return characters;
	}
	
	@Override
	public
	void saveCharacter(Character character) throws Exception
	{
		Connection connection = null;
		PreparedStatement stmt = null;
		int success = 0;
		try {
			connection = DAOUtilities.getConnection();
			
			String sql = "INSERT INTO playercharacters VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			stmt = connection.prepareStatement(sql);
			
			stmt.setInt(1, character.getPlayerID());
			stmt.setString(2, character.getName());
			stmt.setString(3, character.getPlayername());
			stmt.setInt(4, character.getClassid());
			stmt.setInt(5, character.getLevel());
			stmt.setInt(6, character.getSTR());
			stmt.setInt(7, character.getDEX());
			stmt.setInt(8, character.getCON());
			stmt.setInt(9, character.getINT());
			stmt.setInt(10, character.getWIS());
			stmt.setInt(11, character.getCHA());
			stmt.setInt(12, character.getHp_max());
			stmt.setInt(13, character.getHp_cur());
			stmt.setInt(14, character.getPartyid());
			stmt.setInt(15, character.getInvid());
			
			success = stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (success == 0) {
			// then update didn't occur, throw an exception
			throw new Exception("Insert character failed: " + character);
		}
	
	}

	@Override
	public Character makeCharacter(Scanner sc) throws Exception {
		
		
		Connection connection = null;
		Statement stmt = null;
		Statement stmt2 = null;
		int PlayerID = 0;
		String name = "";
		String playername = "";
		int classid = 1;
		int level = 0;
		int STR = 0;
		int DEX = 0;
		int CON = 0;
		int INT = 0;
		int WIS = 0;
		int CHA = 0;
		int hp_max = 0;
		int hp_cur = 0;
		int partyid = 1;
		int invid = 1;
		
		try {
			connection = DAOUtilities.getConnection();
			stmt = connection.createStatement();
			String pidquery = ("SELECT MAX(playerid) AS maxId FROM playercharacters ");
			ResultSet rs = stmt.executeQuery(pidquery); 
			
			if(rs.next()) {
			PlayerID = rs.getInt("maxId") + 1;
			}
			System.out.println("Your ID is " + PlayerID);
			
			
			//stmt2 = connection.createStatement();
			//String iidquery = ("SELECT MAX(invid) AS maxInv FROM playercharacters ");
			//rs = stmt2.executeQuery(iidquery);
			sc.nextLine();
			System.out.println("Please enter the character's name :");
			name = sc.nextLine();
			System.out.println("Please enter the name of the player :");
			playername = sc.nextLine();
			
			do {
				System.out.println("Please enter the character's class id (1 Fighter, 2 Warlock, 3 Bard) :");
				classid = sc.nextInt();	
			}while(classid < 1 || classid > 3);
			do {
				System.out.println("Please enter the character's level (max 20) :");
				level = sc.nextInt();	
			}while(level < 1 || level > 20);
			do {
				System.out.println("Please enter the character's STR (-5 to 5) :");
				STR = sc.nextInt();	
			}while(STR < -5 || STR > 5);
			do {
				System.out.println("Please enter the character's DEX (-5 to 5) :");
				DEX = sc.nextInt();	
			}while(DEX < -5 || DEX > 5);
			do {
				System.out.println("Please enter the character's CON (-5 to 5) :");
				CON = sc.nextInt();	
			}while(CON < -5 || CON > 5);
			do {
				System.out.println("Please enter the character's INT (-5 to 5) :");
				INT = sc.nextInt();	
			}while(INT < -5 || INT > 5);
			do {
				System.out.println("Please enter the character's WIS (-5 to 5) :");
				WIS = sc.nextInt();	
			}while(WIS < -5 || WIS > 5);
			do {
				System.out.println("Please enter the character's CHA (-5 to 5) :");
				CHA = sc.nextInt();	
			}while(CHA < -5 || CHA > 5);
			System.out.println("Please enter the character's maximum health points :");
			hp_max = sc.nextInt();
			do {
				System.out.println("Please enter the character's current health points (over 0):");
				hp_cur = sc.nextInt();	
			}while(hp_cur < 1);
			System.out.println("Please enter the character's party ID :");
			partyid = sc.nextInt();
			//System.out.println("Please enter the character's inventory ID (1-3 for now) :");
			//invid = sc.nextInt();
			//if(rs.next()) {
			//invid = rs.getInt("maxInv") + 1;
			//}
			//System.out.println("Your Inventory ID is " + invid);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (stmt2 != null) {
					stmt2.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		Character temp = new Character(PlayerID, name, playername, classid, level, STR, DEX, CON, INT, WIS, CHA, hp_max, hp_cur, partyid, invid);
			return temp;
	}
	
	public int rollDice(int playerid, int stat, int size)
	{
		int roll = 0;
		String statChoice = "";
		Connection connection = null;
		Statement stmt = null;
		switch(stat) {
		
		case 1:
			statChoice = "STR";
			break;
		case 2:
			statChoice = "DEX";
			break;
		case 3:
			statChoice = "CON";
			break;
		case 4:
			statChoice = "INT";
			break;
		case 5:
			statChoice = "WIS";
			break;
		case 6:
			statChoice = "CHA";
			break;
		case 7:
			try {
			connection = DAOUtilities.getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT atkstat AS atkstat FROM class JOIN playercharacters ON class.\"ClassID\"=playercharacters.classid WHERE playerid="+playerid;
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				 statChoice = rs.getString("atkstat");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if (stmt != null)
						stmt.close();
					if (connection != null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			break;
		}
		try {
			connection = DAOUtilities.getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT \"" +statChoice+ "\" AS bonus FROM playercharacters WHERE playerid="+playerid;
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				 roll = rs.getInt("bonus");
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		Random r = new Random();
		
		roll += r.nextInt(size)+1;
		
		return roll;
		
	}
	
}

	
	

