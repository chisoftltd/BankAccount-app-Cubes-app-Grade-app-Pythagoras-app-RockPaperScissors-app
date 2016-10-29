/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class RockPaperScissors2 {

    private static char userChoice;

    private static int ranValue;
    private static char compChoice;
    private static int tieCount;
    private static int userWin;
    private static int compWin;
    private static int userLoss;
    private static int compLoss;

    public static void main(String[] args) {

        do {
            System.out.println("'R' ROCK    'P' PAPER   'S' SCISSORS    (Q to Quit)");
            userChoice = Character.toUpperCase(new Scanner(System.in).next().charAt(0));

            Random rand = new Random();
            ranValue = rand.nextInt(2) + (-1);

            //ranValue = -1 + (int) (Math.random() * 1);
            System.out.println("Random Value : " + ranValue);

            switch (ranValue) {
                case -1:
                    compChoice = 'R';
                    System.out.println("Computer play ROCK");
                    break;
                case 0:
                    compChoice = 'P';
                    System.out.println("Computer play PAPER");
                    break;
                default:
                    compChoice = 'S';
                    System.out.println("Computer play SCISSORS");
                    break;
            }
            if (userChoice == compChoice) {
                System.out.println("It is a Tie");
                tieCount = tieCount + 1;
            } else if (userChoice == 'R' && compChoice == 'S') {
                System.out.println("You win");
                userWin = userWin + 1;
                compLoss = compLoss + 1;
            } else if (userChoice == 'S' && compChoice == 'P') {
                System.out.println("You win");
                userWin = userWin + 1;
                compLoss = compLoss + 1;
            } else if (userChoice == 'P' && compChoice == 'R') {
                System.out.println("You win");
                userWin = userWin + 1;
                compLoss = compLoss + 1;
            } else if (userChoice == 'S' && compChoice == 'R') {
                System.out.println("Computer win!");
                compWin = compWin + 1;
                userLoss = userLoss + 1;
            } else if (userChoice == 'P' && compChoice == 'S') {
                System.out.println("Computer win!");
                compWin = compWin + 1;
                userLoss = userLoss + 1;
            } else {
                System.out.println("Computer win!");
                compWin = compWin + 1;
                userLoss = userLoss + 1;
            }
        } while (userChoice != 'Q');

        System.out.println("Your Result : " + userWin + " WINS " + userLoss + " LOSSES "
                + tieCount + " TIES ");

        System.out.println("Computer Result : " + compWin + " WINS " + compLoss + " LOSSES "
                + tieCount + " TIES ");
    }
}
