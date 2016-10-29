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
 * Design and implement a Java application that:
 * (A) generates a random whole number called target in the range 1 to 100
 * (B) repeatedly asks the user to guess the target number and then
 *      displays a message saying the target is higher than the guess if guess < number
 *      displays a message saying the target is lower than the guess if guess > number
 *      until guess=number after which is displays a message saying “number found”
 * 
 * (C) The application should then ask the user if they want to play again
 * (D) The application should repeat steps (A) – (C) until the user no longer wishes
 * to play the game.
 * 
 */
public class HigherLower {

    private static int guess;
    private static int numRan;

    public static void main(String[] args) {

        System.out.print("Guess number (-1 to Quit): ");
        guess = new Scanner(System.in).nextInt();
        while (guess != -1) {
            numRan = 1 + (int) (Math.random() * 100);
            if (guess < numRan) {
                System.out.println("Target higher : " + numRan + " > " + guess);
            } else if (guess > numRan) {
                System.out.println("Target lower : " + numRan + " < " + guess);
            } else {
                System.out.println("Number found " + guess + " = " + numRan);
            }
            System.out.print("Guess number (-1 to Quit): ");
            guess = new Scanner(System.in).nextInt();
        }
    }
}
