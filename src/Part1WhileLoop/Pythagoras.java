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
 * Write a program using two nested for loops that searches for Pythagorean triples amongst
 * the integers up to 100.
 * A Pythagorean triple is a set of integers (, , ) such that 	 + 	 = 	
 * e.g. 3	 + 4	 = 5	 or 5	 + 12	 = 13	
 * 
 */
public class Pythagoras {

    public static void main(String[] args) {
        for (int x = 0; x < 100; x++) {
            for (int y = 100; y > 0; y--) {
                for (int z = 0; z < 100; z++) {
                    if ((z * z) == (x * x + y * y)) {
                        System.out.print("  x * x " + (x * x));
                        System.out.print("  y * y : " + (y * y));
                        System.out.println("    (z * z) == (x * x + y * y) : " + (z * z));
                    }
                }
            }
        }
    }
}
