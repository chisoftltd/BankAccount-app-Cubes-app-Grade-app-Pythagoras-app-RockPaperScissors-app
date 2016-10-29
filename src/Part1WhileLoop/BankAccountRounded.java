/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class BankAccountRounded {

    private static double openAmt;
    private static String txn;
    private static double txnAmt;
    private static double balance;
    private static final double intRate = 3.63;
    private static final DecimalFormat to2DP = new DecimalFormat();
    public static void main(String[] args) {
        System.out.print("Enter opening balance: ");
        openAmt = new Scanner(System.in).nextDouble();
        while (true) {
            System.out.println("Enter:\n'c' credit\n'd' debit\n'q' quit the program");
            txn = new Scanner(System.in).next();

            if (txn.equals("c")) {
                System.out.print("Enter credit amount:");
                txnAmt = new Scanner(System.in).nextDouble();
                balance = openAmt + txnAmt;
                balance = balance*intRate;
            } else if (txn.equals("d")) {
                System.out.print("Enter debit amount:");
                txnAmt = new Scanner(System.in).nextDouble();
                balance = openAmt - txnAmt;
                balance = balance*intRate;
            } else {
                break;
            }
        }

        System.out.println("Closing balance: " + to2DP.format(balance));
    
    }
}
