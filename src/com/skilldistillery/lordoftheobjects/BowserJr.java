package com.skilldistillery.lordoftheobjects;

public class BowserJr extends Participants {

	public BowserJr() {

	}// end BowserJr no arg constructor

	public int attack1(int playerHp) {
		int crit = (int) (Math.random() * 10) + 1;
		if (crit > 9) {
			playerHp -= attack1 * 2;
			System.out.println("Bowser Jr. throws a fireball that hits Mario and \nstarts Marios's "
					+ "overalls on fire!  Mario manages to \nget the fire out but was badly burned \nin "
					+ "the process.  This causes 40 damage!");
		} else if (crit > 2) {
			playerHp -= attack1;
			System.out.println("Bowser Jr. throws a shell with perfect spin.  \nMario tries to dive out"
					+ " of the way, \nbut ends up landing right in the way of the shell and gets hit.  \nThis causes 20 damage!");
		} else
			System.out.println(
					"Bowser Jr. tries to throw a fireball, but trips \nand falls over a shell causing 0 damage.");

		return playerHp;
	}// end attack()

}// end of BowserJr class
