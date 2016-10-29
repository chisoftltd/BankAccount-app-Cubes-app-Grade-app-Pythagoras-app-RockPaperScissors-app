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
 * Write a Java application to keep track of the balance of a simple bank 
 * account. Prompt the user for the opening balance of the bank account
 * Then create a loop in which
 *  o The user is prompted for the type of transaction:
 *       'c' credit
 *       'd' debit
 *       'q' quit the program
 *  o The amount of transaction (as a double value) if it is a credit or debit
 *  o The new balance after the transaction is applied.
 * 
 * When the user selects 'q' (to quit), the program should display the closing balance.
 */
public class BankAccount {

    private static String txn;

    private static double openAmt;
    private static double balance;
    private static double txnAmt;

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
            } else if (txn.equals("d")) {
                System.out.print("Enter debit amount:");
                txnAmt = new Scanner(System.in).nextDouble();
                balance = openAmt - txnAmt;
            } else {
                break;
            }
        }

        System.out.println("Closing balance: " + balance);
    }
}
