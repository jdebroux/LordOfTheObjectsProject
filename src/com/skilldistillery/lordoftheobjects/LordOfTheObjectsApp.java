package com.skilldistillery.lordoftheobjects;

public class LordOfTheObjectsApp {

    public static void main(String[] args) {

        boolean winOrLose = false;

        Introduction();
        
/*do{
        do {
            StartGame();

            if (!firstBattle()) {
                winOrLose = false; // player lost must repeat
                continue;
            }
            
            SearchesForRewards();

            if (!SecondBattle()) {
                winOrLose = false;
                continue;// player lost must repeat
            }

            SearchesForRewards();

            if (!thirdBattle()) {
                winOrLose = false;
                continue;// player lost must repeat
            }

            System.out.println(Victory());

        } while (!WinorLose);
        
}while(playAgain());

*/
    }

private static void Introduction() {
        System.out.println("\t\t\tWelcome Mario 1971");
        System.out.println("Mario's story began in a smalltown of Colorado's Mushroom Kingdom!\n"
                + "While in a timeshare resort in Yoshi's Island, a sales rep came \nand hit him on the head with a mushroom.\n");
                
        System.out.println("\n\n\n\t There the princess Peach was taken and being held hostage. \n\n\t\t\tYou Must save Her!");
        
    }

}