/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 *
 * Write a program to explore how accurately Java double values are represented
 * in the computer in terms of the number of significant figures stored. Use a
 * while-statement to control a loop which performs successive tests of the
 * equality: number == 1.0 where number is a sum of 1.0 plus a variable called
 * fraction Initialise fraction as 0.1 and for each iteration of the loop divide
 * fraction by 10. i.e.we are aiming to compare 1.0 to the sequence 1.1 1.01,
 * 1.001, 1.0001, etc until the equality test "returns" the boolean test above
 * returns true.
 *
 */
public class DoubleAccuracy {

    private static double number;
    private static double fraction;

    public static void main(String[] args) {
        do {
            fraction = 0.1;
            number = 1.0 + fraction;
            fraction = fraction / 10;
            System.out.println("Fraction: " + fraction);
        } while (number == 1.0);
        System.out.println("Number: " + number);
    }

}
