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
 * 
 * Write a program that accepts a sequence of integer numbers terminated by the 
 * sentinel value -1.
 * 
 * The program should print:
 *      SORTED
 * if all values have been entered in ascending order (excluding the sentinel 
 * value),
 * otherwise the program should print:
 *      UNSORTED
 * 
 */
public class Sorted {

    private static int integer;
    private static int temp;
    private static String values = "";

    public static void main(String[] args) {
        System.out.print("Enter integer number (-1 to Quit): ");
        integer = new Scanner(System.in).nextInt();

        while (integer != -1) {
            temp = integer;
            if (temp >= integer) {
                if (values.isEmpty()) {
                    values = "SORTED";
                }

            } else if (values.isEmpty()) {
                values = "UNSORTED";
            }
            System.out.print("Enter integer number (-1 to Quit): ");
            integer = new Scanner(System.in).nextInt();
        }

        System.out.println("Numbers " + values);
    }
}
