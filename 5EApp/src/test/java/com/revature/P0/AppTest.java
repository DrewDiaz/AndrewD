package com.revature.P0;

import com.revature.P0.dao.CharacterDAO;
import com.revature.P0.dao.CharacterDAOImpl;
import com.revature.P0.dao.DAOUtilities;
import com.revature.P0.models.Character;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;

public class AppTest {

	
	CharacterDAO dao = new CharacterDAOImpl();
	Scanner sc = new Scanner(System.in);
	@Test
	public void inTest()
	{
		int giveBack = 0;
		Character c = new Character(200, "Gale", "Drew", 3, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
		try {
			dao.saveCharacter(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = null;
		Statement stmt = null;
		try {
			connection = DAOUtilities.getConnection();
			stmt = connection.createStatement();
			String sql = "SELECT playerid AS pid FROM playercharacters WHERE playerid=200";
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next())
			{
				giveBack = rs.getInt("pid");
			}
			String sql2 = "DELETE FROM playercharacters WHERE playerid=200";
			stmt.executeUpdate(sql2);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		assertEquals( giveBack, 200);
	}
	
	
	@Test
	public void rollingBonus()
	{
		assertEquals(dao.rollDice(1, 1, 1), 6);
	}
	
	
	
}
