package com.skilldistillery.lordoftheobjects;

public class HammerBro extends Participants {

	public HammerBro() {

	}// end HammerBro no arg constructor

	public int attack1(int playerHp) {
		int crit = (int) (Math.random() * 10) + 1;
		if (crit > 9) {
			playerHp -= attack1 * 2;
			System.out.println(
					"Hammer Bro lobs an unusually large hammer and hits Mario in the " + "head which does 30 damage!");
		} else if (crit > 4) {
			playerHp -= attack1;
			System.out.println("Hammer Bro lobs his hammer and hits Mario in the chest.  This causes 15 damage.");
		} else
			System.out.println(
					"Hammer Bro lobs his hammer, but Mario dives \nout of the way at the last second, \nand dodges Hammer Bro's hammer.  This causes 0 damage.");

		return playerHp;
	}

}// end HammerBro class
