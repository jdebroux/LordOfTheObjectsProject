package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		Player1 mario = new Player1();
		mario.attack1 = 15;
		mario.attack2 = 20;
		mario.attack3 = 25;
		mario.attack4 = 30;
		mario.hp = 100;
		mario.name = "Mario";

		HammerBro hammer = new HammerBro();
		hammer.attack1 = 15;
		hammer.hp = 100;
		hammer.name = "Hammer Bro";

		BowserJr bowserJ = new BowserJr();
		bowserJ.attack1 = 20;
		bowserJ.hp = 150;
		bowserJ.name = "Bowser Jr.";

		SirBowser bigBow = new SirBowser();
		bigBow.attack1 = 30;
		bigBow.hp = 200;
		bigBow.name = "Sir Bowser";

		introduction();

		do {
			startGame();
			mario.hp = battle(kb, mario.hp, hammer.hp, mario, hammer);

			if (!(mario.hp > 0)) {
				continue;
			}

			nextStoryBattle2();

			mario.hp += 50;
			System.out.println("Mario's HP: " + mario.hp);

			mario.hp = battle(kb, mario.hp, bowserJ.hp, mario, bowserJ);

			if (!(mario.hp > 0)) {
				continue;
			}

			nextStoryBattle3();

			mario.hp = battle(kb, mario.hp, bigBow.hp, mario, bigBow);

			if (!(mario.hp > 0)) {
				continue;
			}
		} while (playAgain(kb));

	}// end main

	private static int battle(Scanner kb, int playerHp, int foeHp, Player1 mario, HammerBro foe) {
		boolean playerAlive = true;
		boolean foeAlive = true;
		do {
			int userInput = choice(kb);
			switch (userInput) {
			case 1:
				foeHp = mario.attack1(foeHp);
				System.out.println(mario.name + " shoots a bouncing ball at " + foe.name + ".  \nThe ball hits " + foe.name
						+ " in the" + " gut.  \nThis causes: " + mario.attack1 + " damage.");
				break;
			case 2:
				foeHp = mario.attack2(foeHp);
				System.out.println(mario.name + " throws a red shell at " + foe.name + ".  \nThe shell hits " + foe.name + " in the"
						+ " legs and knocks " + foe.name + " down.  \nThis causes: " + mario.attack2 + " damage.");
				break;
			case 3:
				foeHp = mario.attack3(foeHp);
				break;
			case 4:
				foeHp = mario.attack4(foeHp);
				break;
			}
			foeAlive = foe.amIAlive(foeHp);
			if (foeHp <= 0) {
				System.out.println("\n" + foe.name + " falls to his knees and waves a white flag in submission.");
				System.out.println(mario.name + " jumps high into the sky blocking out the sun,");
				System.out.println("and comes down landing directly on " + foe.name + "'s head");
				System.out.println("causing a bloody fatal blow.");
				return playerHp;
			} else
				System.out.println(foe.name + "'s HP is now: " + foeHp + "\n");

			playerHp = foe.attack1(playerHp);
			if (playerHp <= 0) {
				System.out.println("Mario has been defeated.");
			} else
				System.out.println(mario.name + "'s HP is: " + playerHp + "\n");
			playerAlive = mario.amIAlive(playerHp);
		} while (foeAlive == true && playerAlive == true);

		return playerHp;
	}// end battle

	private static void introduction() {
		System.out.println("\t\t    *** Welcome Mario 1971 ***");
		System.out.print("Mario's story begins in a small town of Colorado's Mushroom Kingdom!\n"
				+ "While in a timeshare resort on Yoshi's Island, a sales rep comes by \nand hits Mario on the head with a mushroom.");

		System.out.println(
				"  Princess Peach is taken \nand is being held hostage by Sir Bowser in Bowsers castle. \n\n\t\t\tMario MUST save Her!\n");

	}// end introduction

	private static int choice(Scanner kb) { // choice TEST AND APPROVED
		int choice = 1;
		do {
			listOfUserBattleChoices();
			System.out.print("Enter Choice: ");
			choice = kb.nextInt();

			if (choice > 4 || choice < 1) {
				System.out.println("please only 1-4");
			}
		} while ((choice > 4) || (choice < 1));

		return choice;

	}// end choice

	private static void startGame() {
		System.out.println("Mario is running out of Mushroom Kingdom at Super Mario Star Speed");
		System.out.println("until Mario is confronted by Hammer Bro !!! ");
		System.out.println("\nMario Must Fight. The Princess Depends On It! ");

	}// end startGame

	private static void listOfUserBattleChoices() { // Prints the name of the
		System.out.println("\nMario's Attack options");
		System.out.println("\t(1) Toss a bouncing ball ");
		System.out.println("\t(2) Throw a red shell ");
		System.out.println("\t(3) Throw Boomerang Flower ");
		System.out.println("\t(4) Throw Bouncing Blue Shell ");

	}// end listOfUserBattleChoices

	private static boolean playAgain(Scanner kb) {

		System.out.print("Do you want to play again: Yes or No: ");
		String choice = kb.next();
		if (("YES".equalsIgnoreCase(choice)) || ("Y".equalsIgnoreCase(choice))) {

			return true;
		}

		return false;

	}// end playAgain

	private static void nextStoryBattle2() {
		System.out.println("Now that Mario has defeated Hammer Bro, \nMario begins running towards Bowser's Castle!"
				+ "\nAs Mario approaches the castle, he is greeted halfway by Luigi. \n");
		System.out.println("\tLUIGI:  Mario! Bowser Jr. is waiting for you at the \n\tentrance of the Castle!"
				+ "\n\n\tMARIO: OH NO!" + "\n\n\tLUIGI: You'll need this mushroom to fight Bowser JR!");

		System.out.println("\nLuigi gives Mario a mushroom.");
		System.out.println("\nMario has gained 50 HP!\n");
	}// end nextStoryBattle2

	private static void nextStoryBattle3() {
		System.out.println("\n\n\tBowser Jr: You may have deafeated me, Mario, but \n\tyou'll never defeat my father."
				+ "\n ugh...ah; Bowser Jr falls unconscious. \n\nMario begins enters Bowser's Castle!"
				+ "\nAs Mario walks up a long staircase, he hears \"Muh Ah Ah\" \n");
		System.out.println("\n\tTOAD:  Mario! Please go save the Princess!" + "\n\n\tMARIO: I WILL!"
				+ "\n\n\tTOAD: Here take these magic stars & mushrooms" + "\n\n\tMARIO: Here we go!");

		System.out.println("\n\nMario has gained 100 HP");
		System.out.println("Mario gained a new ability: Magic Stars");
	}

}// end class