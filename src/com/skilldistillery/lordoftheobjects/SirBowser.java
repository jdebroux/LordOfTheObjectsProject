package com.skilldistillery.lordoftheobjects;

public class SirBowser extends Participants {

	public SirBowser() {

	}// end SirBowser no arg constructor

	public int attack1(int playerHp) {
		int crit = (int)(Math.random()*10)+1;
		if (crit > 7) {
			playerHp -= attack1 * 2;
			System.out.println("Bowser shoots a cannonball and hits Mario \nright in the "
					+ "forehead which causes 60 damage!");
		}else if (crit > 4){
			playerHp -= attack1;
			System.out.println("Bowser tucks into his shell, and spins while chasing Mario down."
					+ "\nMario tries to run away, but is not quick enough.  \nBowser collides into Mario,"
					+ " and pops back to a defensive position.  \nThis causes 30 damage!");
		}else
			System.out.println("Bowser shoots fire breath at Mario.  \nMario does a triple jump and dodges.  \nThis does 0 damage.");
		
		return playerHp;
	}//end attack()
	
}// end SirBowser class
