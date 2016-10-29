/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1WhileLoop;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class Cubes {

    private static int number;
    private static long numberCube;

    public static void main(String[] args) {
        while (numberCube < 20000) {
            numberCube = number * number * number;
            System.out.println("Number: " + number);
            number++;
        }
        System.out.println("Largest integer cube < 20000: " + numberCube 
                + " is " + number);
    }
}
