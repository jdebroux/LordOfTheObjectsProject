package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		Player1 mario = new Player1();
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
		bigBow.attack1 = 25;
		bigBow.hp = 200;
		bigBow.name = "Sir Bowser";

		do {
			mario.hp = 100;
			introduction();
			startGame();
			mario.attack1 = 15;
			mario.attack2 = 20;
			mario.attack3 = 25;
			mario.attack4 = 30;
			mario.hp = hammerBroBattle(kb, mario.hp, hammer.hp, mario, hammer);

			if (!(mario.hp > 0)) {
				continue;
			}

			nextStoryBattle2();

			mario.hp += 50;
			System.out.println("Mario's HP: " + mario.hp);
			mario.attack1 = 35;
			mario.attack2 = 20;
			mario.attack3 = 15;
			mario.attack4 = 10;

			beginBattle2();

			mario.hp = bowserJrBattle(kb, mario.hp, bowserJ.hp, mario, bowserJ);

			if (!(mario.hp > 0)) {
				continue;
			}

			nextStoryBattle3();

			System.out.println(mario.name + " uses Magic Stars and powers an attack!");

			mario.hp += 100;
			System.out.println("Mario's HP: " + mario.hp);
			mario.attack1 = 5;
			mario.attack2 = 25;
			mario.attack3 = 50;
			mario.attack4 = 30;

			beginBattle3();
			mario.hp = sirBowserBattle(kb, mario.hp, bigBow.hp, mario, bigBow);

			if (!(mario.hp > 0)) {
				continue;
			}
			endGameStory();

		} while (playAgain(kb));

	}// end main

	private static int sirBowserBattle(Scanner kb, int playerHp, int foeHp, Player1 mario, SirBowser foe) {
		boolean playerAlive = true;
		boolean foeAlive = true;
		do {
			int userInput = choice(kb);
			switch (userInput) {
			case 1:
				foeHp = mario.attack1(foeHp);
				System.out.println(mario.name + " tosses a bouncing ball at " + foe.name + ".  \nThe ball hits "
						+ foe.name + " in the" + " gut.  \nThis causes: " + mario.attack1 + " damage.");
				break;
			case 2:
				foeHp = mario.attack2(foeHp);
				System.out.println(mario.name + " throws a red shell at " + foe.name + ".  \nThe shell hits " + foe.name
						+ " in the" + " legs and knocks " + foe.name + " down.  \nThis causes: " + mario.attack2
						+ " damage.");
				break;
			case 3:
				foeHp = mario.attack3(foeHp);
				System.out.println(mario.name + " flings a boomerang flower at " + foe.name + ".  \nThe flower hits "
						+ foe.name + " in the neck.\nThis causes: " + mario.attack3 + " damage.");
				break;
			case 4:
				foeHp = mario.attack4(foeHp);
				System.out.println(mario.name + " hurls a big blue shell at " + foe.name + ".  \n" + foe.name
						+ " tries " + "to dodge the blue shell, \nbut it locks on to " + foe.name + ", hits " + foe.name
						+ " \nand explodes.\nThis causes: " + mario.attack4 + " damage.");
				break;
			}
			foeAlive = foe.amIAlive(foeHp);
			if (foeHp <= 0) {
				System.out.println("\nIn a last resort, Bowser fires a massive cannon at Mario.");
				System.out.println("Mario runs and jumps directly at the cannon ball.  At the last");
				System.out.println("second Mario pulls out a green shell and rockets it into the cannon");
				System.out.println("ball which flys back at Bowser.  Caught off guard, Bowser gets hit ");
				System.out.println("and gets sent flying out into outerspace.");
				return playerHp;
			} else
				System.out.println("Sir Bowser's HP is now: " + foeHp + "\n");

			playerHp = foe.attack1(playerHp);
			if (playerHp <= 0) {
				System.out.println("Mario has been defeated.");
			} else
				System.out.println("Mario's HP is: " + playerHp + "\n");
			playerAlive = mario.amIAlive(playerHp);
		} while (foeAlive == true && playerAlive == true);

		return playerHp;
	}// end hammerBroBattle

	private static int bowserJrBattle(Scanner kb, int playerHp, int foeHp, Player1 mario, BowserJr foe) {
		boolean playerAlive = true;
		boolean foeAlive = true;
		do {
			int userInput = choice(kb);
			switch (userInput) {
			case 1:
				foeHp = mario.attack1(foeHp);
				System.out.println(mario.name + " tosses a bouncing ball at " + foe.name + ".  \nThe ball hits "
						+ foe.name + " in the" + " gut.  \nThis causes: " + mario.attack1 + " damage.");
				break;
			case 2:
				foeHp = mario.attack2(foeHp);
				System.out.println(mario.name + " throws a red shell at " + foe.name + ".  \nThe shell hits " + foe.name
						+ " in the legs and knocks " + foe.name + " down.  \nThis causes: " + mario.attack2
						+ " damage.");
				break;
			case 3:
				foeHp = mario.attack3(foeHp);
				System.out.println(mario.name + " flings a boomerang flower at " + foe.name + ".  \nThe flower hits "
						+ foe.name + " in the neck.\nThis causes: " + mario.attack3 + " damage.");
				break;
			case 4:
				foeHp = mario.attack4(foeHp);
				System.out.println(mario.name + " hurls a big blue shell at " + foe.name + ".  \n" + foe.name
						+ " tries " + "to dodge the blue shell, \nbut it locks on to " + foe.name + ", hits " + foe.name
						+ " \nand explodes.\nThis causes: " + mario.attack4 + " damage.");
				break;
			}
			foeAlive = foe.amIAlive(foeHp);
			if (foeHp <= 0) {
				System.out.println("\nBowser JR. jumps and tucks into his shell to try to hide.");
				System.out.println("Mario sprints at Bowser Jr. at blazing speed,");
				System.out.println("and kicks Bowser JR. into the castle wall.  Bowser JR's ");
				System.out.println("shell breaks and crumbles around him moving him from a ");
				System.out.println("private state to a public one. ");
				return playerHp;
			} else
				System.out.println("Bowser JR's HP is now: " + foeHp + "\n");

			playerHp = foe.attack1(playerHp);
			if (playerHp <= 0) {
				System.out.println("Mario has been defeated.");
			} else
				System.out.println("Mario's HP is: " + playerHp + "\n");
			playerAlive = mario.amIAlive(playerHp);
		} while (foeAlive == true && playerAlive == true);

		return playerHp;
	}// end hammerBroBattle

	private static int hammerBroBattle(Scanner kb, int playerHp, int foeHp, Player1 mario, HammerBro foe) {
		boolean playerAlive = true;
		boolean foeAlive = true;
		do {

			int userInput = choice(kb);
			switch (userInput) {
			case 1:
				foeHp = mario.attack1(foeHp);
				System.out.println(mario.name + " tosses a bouncing ball at " + foe.name + ".  \nThe ball hits "
						+ foe.name + " in the" + " gut.  \nThis causes: " + mario.attack1 + " damage.");
				break;
			case 2:
				foeHp = mario.attack2(foeHp);
				System.out.println(mario.name + " throws a red shell at " + foe.name + ".  \nThe shell hits " + foe.name
						+ " in the" + " legs and knocks " + foe.name + " down.  \nThis causes: " + mario.attack2
						+ " damage.");
				break;
			case 3:
				foeHp = mario.attack3(foeHp);
				System.out.println(mario.name + " flings a boomerang flower at " + foe.name + ".  \nThe flower hits "
						+ foe.name + " in the neck.\nThis causes: " + mario.attack3 + " damage.");
				break;
			case 4:
				foeHp = mario.attack4(foeHp);
				System.out.println(mario.name + " hurls a big blue shell at " + foe.name + ".  \n" + foe.name
						+ " tries " + "to dodge the blue shell, \nbut it locks on to " + foe.name + ", hits " + foe.name
						+ " \nand explodes.\nThis causes: " + mario.attack4 + " damage.");
				break;
			}
			foeAlive = foe.amIAlive(foeHp);
			if (foeHp <= 0) {
				System.out.println("\nHammer Bro falls to his knees and waves a white flag in submission.");
				System.out.println("Mario jumps high into the sky blocking out the sun,");
				System.out.println("and comes down landing directly on Hammer Bro's head");
				System.out.println("causing a bloody fatal blow.");
				return playerHp;
			} else
				System.out.println("Hammer Bro's HP is now: " + foeHp + "\n");

			playerHp = foe.attack1(playerHp);
			if (playerHp <= 0) {
				System.out.println(mario.name + " has been defeated.");
			} else
				System.out.println("Mario's HP is: " + playerHp + "\n");
			playerAlive = mario.amIAlive(playerHp);
		} while (foeAlive == true && playerAlive == true);

		return playerHp;
	}// end hammerBroBattle

	private static void introduction() {
		System.out.println("\t\t    *** Welcome Mario 1981 ***");
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
		System.out.println("\nMario Must Fight. The Princess Depends On It!\n");
		System.out.println("*** Keep in mind, attacks affect each opponent differently. ***\n");
		System.out.println("Battle 1 has begun!\n");

	}// end startGame

	private static void listOfUserBattleChoices() { // Prints the name of the
		System.out.println("Mario's Attack options");
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
		System.out.println("\nNow that Mario has defeated Hammer Bro, \nMario begins running towards Bowser's Castle!"
				+ "\nAs Mario approaches the castle, he is greeted by Luigi. \n");
		System.out.println("\tLUIGI:  Mario! Bowser Jr. is waiting for you at the \n\tentrance of the Castle!"
				+ "\n\n\tMARIO: OH NO!" + "\n\n\tLUIGI: You'll need this mushroom to fight Bowser Jr!");

		System.out.println("\nLuigi gives Mario a mushroom.");
		System.out.println("\nMario has gained 50 HP!\n");
	}// end nextStoryBattle2

	private static void nextStoryBattle3() {
		System.out.println("\n\n\tBOWSER JR: You may have deafeated me, Mario, but \n\tyou'll never defeat my father."
				+ "\n\t ugh...ah; Bowser Jr falls unconscious. \n\nMario enters Bowser's Castle!"
				+ "\nAs Mario walks up a long staircase, he hears \"Muh Ah Ah\" \n");
		System.out.println("\n\tTOAD:  Mario! Please go save the Princess!" + "\n\n\tMARIO: I WILL!"
				+ "\n\n\tTOAD: Here take these magic stars & mushrooms" + "\n\n\tMARIO: Here we go!");

		System.out.println("\n\nMario has gained 100 HP");
		System.out.println("Mario gained a new item: Magic Stars\n");
	}

	private static void beginBattle2() {
		System.out.println("\nBOWSER JR. is blocking the entrance.\n"
				+ "\n\tBOWSER JR: I know why you've come! You'll never get the Princess!"
				+ "\n\n\tMARIO: I think I hear someone calling. YOUR MOM! <Mario Charges>"
				+ "\n\n\tBOWSER JR: Bring it on...\n");
		System.out.println("Battle 2 begins!\n");
	}

	private static void beginBattle3() {
		System.out.println("\nMario enters the top level and opens the giant wooden doors."
				+ "\nBowser has the Princess chained upside down over evil rainbows. \n"
				+ "\n\tBOWSER: Look who it is?! You'll never defeat me! \n\tI'm going to take over the world, after I defeat you!"
				+ "\n\n\tMARIO: Yahoohoo! <Mario leaps at Bowser>" + "\n\n\tBOWSER:Scoopa Koopas...\n");
		System.out.println("Boss battle begins!\n");
	}

	private static void endGameStory() { // test approved.
		System.out.println("Upon defeating Bowser, Mario rescues Princess Peach!"
				+ "\nThe whole Magic Kingdom throws a huge mushroom party... for Mario." + "\n\n\t\tThe End.");
		System.out.println("\nMario has gained 500,000 Experience points, and one coin!");
	}

}// end class