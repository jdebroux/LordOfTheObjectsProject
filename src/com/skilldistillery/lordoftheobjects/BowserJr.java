package com.skilldistillery.lordoftheobjects;

public class BowserJr extends Participants {

	public BowserJr() {

	}//end BowserJr no arg constructor

	public int attack(int playerHp) {
		int crit = (int) (Math.random() * 10) + 1;
		if (crit > 8) {
			playerHp -= attack1 * 2;
			System.out.println("Bowser Jr. throws a fireball that hits Player1 and starts Player1's "
					+ "clothing on fire!  Player1 manages to get the fire out but was badly burned in "
					+ "the process.  \nPlayer1's health is now: " + playerHp);
		} else if (crit > 2) {
			playerHp -= attack1;
			System.out.println("Bowser Jr. throws a shell with perfect spin.  Player1 tries to dive out"
					+ "of the way, but ends up landing right in the way of the shell and gets hit.  "
					+ "\nPlayer1's health is now: " + playerHp);
		} else
			System.out.println("Bowser Jr. tries to throw a fireball, but trips and falls over a shell.");

		return playerHp;
	}// end attack()

}// end of BowserJr class
