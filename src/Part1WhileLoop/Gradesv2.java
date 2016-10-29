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
public class Gradesv2 {

    private static int mark;
    private static String numberA = "";
    private static String numberB = "";
    private static String numberC = "";
    private static String numberD = "";

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter students mark 0 ... 100 (enter -1 to Exit): ");
            mark = new Scanner(System.in).nextInt();
            if (mark < 0 || mark > 100) {
                if (mark == -1 && mark == (int) mark) {
                break;
            } 
                System.out.print("Students mark is between 0 ... 100 (enter -1 to Exit): ");
                mark = new Scanner(System.in).nextInt();
            }
            if (mark > 79) {
                numberA = numberA + "*";
            } else if (mark > 59) {
                numberB = numberB + "*";
            } else if (mark > 39) {
                numberC = numberC + "*";
            } else {
                numberD = numberD + "*";
            }

//            System.out.print("More marks? (enter -1 to Exit): ");
//            ans = new Scanner(System.in).nextInt();
            if (mark == -1 && mark == (int) mark) {
                break;
            } else {
                continue;
            }

        }
        System.out.println("Grade A: " + numberA + "\nGrade B: " + numberB
                + "\nGrade C: " + numberC + "\nGrade D: " + numberD);
    }

}
