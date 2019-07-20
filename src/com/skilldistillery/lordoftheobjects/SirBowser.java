package com.skilldistillery.lordoftheobjects;

public class SirBowser extends Participants {

	public SirBowser() {

	}// end SirBowser no arg constructor

	public int attack(int playerHp) {
		int crit = (int)(Math.random()*10)+1;
		if (crit > 7) {
			playerHp -= attack1 * 2;
			System.out.println("Bowser shoots a cannonball and hits Player1 right in the "
					+ "forehead which does double damange!  \nPlayer1's health is now: "
					+ playerHp);
		}else
			playerHp -= attack1;
			System.out.println("Bowser tucks into his shell, and spins while chasing Player1 down."
					+ "Player1 tries to run away, but is not quick enough.  Bowser collides into Player1,"
					+ "and pops back to a defensive position."
					+ "\nPlayer1's health is now: " + playerHp);
		
		return playerHp;
	}//end attack()
	
}// end SirBowser class
