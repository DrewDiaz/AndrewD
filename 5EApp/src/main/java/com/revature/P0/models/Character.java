package com.revature.P0.models;

public class Character {

	private int PlayerID = 0;
	private String name = "";
	private String playername = "";
	private int classid = 0;
	private int level = 0;
	private int STR = 0;
	private int DEX = 0;
	private int CON = 0;
	private int INT = 0;
	private int WIS = 0;
	private int CHA = 0;
	private int hp_max = 0;
	private int hp_cur = 0;
	private int partyid = 0;
	private int invid = 0;
	
	public Character() {}
	
	public Character(int PlayerID, String name, String playername, int classid, 
			int level, int STR, int DEX, int CON, int INT, int WIS, int CHA,
			int hp_max, int hp_cur, int partyid, int invid)
	{
		this.PlayerID = PlayerID;
		this.name = name;
		this.playername = playername;
		this.classid = classid;
		this.level = level;
		this.STR = STR;
		this.DEX = DEX;
		this.CON = CON;
		this.INT = INT;
		this.WIS = WIS;
		this.CHA = CHA;
		this.hp_max = hp_max;
		this.hp_cur = hp_cur;
		this.partyid = partyid;
		this.invid = invid;
	}

	@Override
	public String toString() {
		return " [" + PlayerID + "] name=" + name + ", playername=" + playername + ", classid="
				+ classid + ", level=" + level + ", STR=" + STR + ", DEX=" + DEX + ", CON=" + CON + ", INT=" + INT
				+ ", WIS=" + WIS + ", CHA=" + CHA + ", hp_max=" + hp_max + ", hp_cur=" + hp_cur 
				+ ", partyid=" + partyid
				//+ ", invid=" + invid + "]"
				;
	}

	public int getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(int playerID) {
		PlayerID = playerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSTR() {
		return STR;
	}

	public void setSTR(int sTR) {
		STR = sTR;
	}

	public int getDEX() {
		return DEX;
	}

	public void setDEX(int dEX) {
		DEX = dEX;
	}

	public int getCON() {
		return CON;
	}

	public void setCON(int cON) {
		CON = cON;
	}

	public int getINT() {
		return INT;
	}

	public void setINT(int iNT) {
		INT = iNT;
	}

	public int getWIS() {
		return WIS;
	}

	public void setWIS(int wIS) {
		WIS = wIS;
	}

	public int getCHA() {
		return CHA;
	}

	public void setCHA(int cHA) {
		CHA = cHA;
	}

	public int getHp_max() {
		return hp_max;
	}

	public void setHp_max(int hp_max) {
		this.hp_max = hp_max;
	}

	public int getHp_cur() {
		return hp_cur;
	}

	public void setHp_cur(int hp_cur) {
		this.hp_cur = hp_cur;
	}

	public int getPartyid() {
		return partyid;
	}

	public void setPartyid(int partyid) {
		this.partyid = partyid;
	}

	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}
}
