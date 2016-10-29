/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class ABCQ2 {

    private static char charAns;
    private static int qty;
    private static double totalCost;

    public static void main(String[] args) {
        do {
            System.out.println("Product Code:       'A'             'B'             'C'\n"
                    + "Unit Cost:           5.67 pounds     6.78 pounds     7.89 pounds");
            System.out.print("Enter product code (Q - exit):");
            charAns = Character.toUpperCase(new Scanner(System.in).next().charAt(0));
            if (charAns == 'Q') {
                System.out.println("Thanks for using our software!");
                break;
            }
            System.out.print("Enter Quantity purchased:");
            qty = new Scanner(System.in).nextInt();
            switch (charAns) {
                case 'A':
                    totalCost = qty * 5.67;
                    System.out.println(qty + " quantity of product A cost " + totalCost);
                    break;
                case 'B':
                    totalCost = qty * 6.78;
                    System.out.println(qty + " quantity of product B cost " + totalCost);
                    break;
                case 'C':
                    totalCost = qty * 7.89;
                    System.out.println(qty + " quantity of product C cost " + totalCost);
                    break;
                case 'Q':
                    System.out.println("Thanks for using our software!");
                    break;
                default:
                    System.out.println("Enter ONLY: \n'A', \n'B', \n'C', \n'Q'");
                    charAns = new Scanner(System.in).next().charAt(0);
                    break;
            }
        } while (charAns != 'Q');

    }
}
