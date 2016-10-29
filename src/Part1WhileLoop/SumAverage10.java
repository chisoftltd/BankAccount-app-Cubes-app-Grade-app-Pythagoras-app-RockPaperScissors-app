/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

import java.util.Scanner;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class SumAverage10 {

    private static double number;
    private static double total;
    private static int counter;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        while (true) {
            System.out.println("Enter positive double values:");
            number = new Scanner(System.in).nextDouble();
            total = total + number;
            counter = counter + 1;

            if (number < 0.0 || counter > 10) {
                break;
            }
        }

        System.out.println("Sum = " + total + " Average = " + (total / counter));
    }

}
