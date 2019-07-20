package com.skilldistillery.lordoftheobjects;

public class HammerBro extends Participants{

	public HammerBro() {
		
	}//end HammerBro no arg constructor

	public int attack1(int playerHp) {
		int crit = (int)(Math.random()*10)+1;
		if (crit > 9) {
			playerHp -= attack1 * 2;
			System.out.println("Hammer Bro lobs an unusually large hammer and hits Player1 in the "
					+ "head which does double damange!  \nPlayer1's health is now: "
					+ playerHp);
		}else if (crit > 5) {
			playerHp -= attack1;
			System.out.println("Hammer Bro lobs his hammer and hits Player1 in the chest.  "
					+ "\nPlayer1's health is now: " + playerHp);
		}else 
			System.out.println("Player1 dives out of the way at the last second, and"
					+ " dodges Hammer Bro's hammer.");
		
		
		return playerHp;
	}
	
	
	
}
