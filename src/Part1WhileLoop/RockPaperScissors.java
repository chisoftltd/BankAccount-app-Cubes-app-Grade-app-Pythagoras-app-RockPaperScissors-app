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
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Design and implement a Java application that plays the game Rock-Paper-Scissors.
 * The rules of the game are:
 * in each round of the game, two players make a simultaneous, independent choice of
 * Rock, or Paper, or Scissors
 * · if the choices are the same then the round is tied and no points are awarded
 * · if the choices are different then the winning player is awarded one point according to
 *      the decision criteria:
 * Rock beats Scissors, Scissors beats Paper, Paper beats Rock
 * The application should repeatedly play rounds of the game until the user wishes to stop.
 * The application should keep score and display the score at the end of each round.
 * Design the program logic before you do any coding.
 * 
 * Things to think about are:
 *  what is an appropriate method for storing the game data (scores and choices)
 *  what actions have to be done in each round
 *  in what order do those actions have to be done
 *  how can the computer generate a (random) choice of rock or paper or scissors
 */
public class RockPaperScissors {

    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    
     public RockPaperScissors() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    private enum Move {
        ROCK, PAPER, SCISSORS;

        /**
         * Compares this move with another move to determining a tie, a win, or
         * a loss.
         *
         * @param otherMove move to compare to
         * @return 1 if this move beats the other move, -1 if this move loses to
         * the other move, 0 if these moves tie
         */
        public int compareMoves(Move otherMove) {
            // Tie
            if (this == otherMove) {
                return 0;
            }

            switch (this) {
                case ROCK:
                    return (otherMove == SCISSORS ? 1 : -1);
                case PAPER:
                    return (otherMove == ROCK ? 1 : -1);
                case SCISSORS:
                    return (otherMove == PAPER ? 1 : -1);
            }

            // Should never reach here
            return 0;
        }
    }

    class User {

        private Scanner inputScanner;

        public User() {
            inputScanner = new Scanner(System.in);
        }

        public Move getMove() {
            // Prompt the user
            System.out.print("Rock, paper, or scissors? ");

            // Get the user input
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
                // User has entered a valid input
                switch (firstLetter) {
                    case 'R':
                        return Move.ROCK;
                    case 'P':
                        return Move.PAPER;
                    case 'S':
                        return Move.SCISSORS;
                }
            }

            // User has not entered a valid input. Prompt again.
            return getMove();
        }

        public boolean playAgain() {
            System.out.print("Do you want to play again? ");
            String userInput = inputScanner.nextLine();
            userInput = userInput.toUpperCase();
            return userInput.charAt(0) == 'Y';
        }

    }

    class Computer {

        public Move getMove() {
            Move[] moves = Move.values();
            Random random = new Random();
            int index = random.nextInt(moves.length);
            return moves[index];
        }

    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }

    private void startGame() {
        System.out.println("ROCK, PAPER, SCISSORS!");

        // Get moves
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYou played " + userMove + ".");
        System.out.println("Computer played " + computerMove + ".\n");

        // Compare moves and determine winner
        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0: // Tie
                System.out.println("Tie!");
                break;
            case 1: // User wins
                System.out.println(userMove + " beats " + computerMove + ". You won!");
                userScore++;
                break;
            case -1: // Computer wins
                System.out.println(computerMove + " beats " + userMove + ". You lost.");
                computerScore++;
                break;
        }
        numberOfGames++;

        // Ask the user to play again
        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }

    }

    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

        // Line
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        // Print titles
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

        // Line
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        // Print values
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        // Line
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}
