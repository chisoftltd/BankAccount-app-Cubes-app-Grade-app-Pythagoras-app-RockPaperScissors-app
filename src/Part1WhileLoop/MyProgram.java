/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

/**
 *
 * @author 1609963
 */
public class MyProgram {

    public static void main(String[] args) {
        int total = 0, count = 0;
        while (count <= 100) {
            total = total + count;
            count++;
        }
        System.out.println("Total = " + total);
    }
}
