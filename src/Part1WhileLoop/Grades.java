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
public class Grades {

    private static int mark;
    private static int numberA;
    private static int numberB;
    private static int numberC;
    private static int numberD;
    private static int ans;

    public static void main(String[] args) {
        do {
            System.out.print("Enter students mark 0 ... 100 (enter -1 to Exit): ");
            mark = new Scanner(System.in).nextInt();
            if (mark < 0 || mark > 100) {
                System.out.print("Students mark is between 0 ... 100 (enter -1 to Exit): ");
                mark = new Scanner(System.in).nextInt();
            }
            if (mark > 79) {
                numberA = numberA + 1;
            } else if (mark > 59) {
                numberB = +numberB + 1;
            } else if (mark > 39) {
                numberC = +numberC + 1;
            } else {
                numberD = numberD + 1;
            }

//            System.out.print("More marks? (enter -1 to Exit): ");
//            ans = new Scanner(System.in).nextInt();
            if (mark == -1 && mark == (int) mark) {
                break;
            } else {
                continue;
            }
        } while (true);

        System.out.println("Grade A: " + numberA + "\nGrade B: " + numberB
                + "\nGrade C: " + numberC + "\nGrade D: " + numberD);
    }
}
