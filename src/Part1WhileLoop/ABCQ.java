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
public class ABCQ {

    private static char charAns;

    public static void main(String[] args) {
        do {
            System.out.println("Enter: \n'A', \n'B', \n'C', \n'Q'");
            charAns = Character.toUpperCase(new Scanner(System.in).next().charAt(0));
            switch (charAns) {
                case 'A':
                    System.out.println(charAns + " Great!");
                    break;
                case 'B':
                    System.out.println(charAns + " Great!");
                    break;
                case 'C':
                    System.out.println(charAns + " Great!");
                    break;
                case 'Q':
                    System.out.println(charAns + " Great!");
                    break;
                default:
                    System.out.println("Enter ONLY: \n'A', \n'B', \n'C', \n'Q'");
                    charAns = new Scanner(System.in).next().charAt(0);
                    break;
            }
        } while (charAns != 'A' && charAns != 'B' && charAns != 'C' && charAns != 'Q');
    }
}
