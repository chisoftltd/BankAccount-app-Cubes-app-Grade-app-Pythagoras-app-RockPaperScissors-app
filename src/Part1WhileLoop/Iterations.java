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
public class Iterations {

    public static void main(String[] args) {
        /*
        int x = 1;
        while (x < 20) {
            if (x % 3 == 0) {
                System.out.println(x + " ");
            }
        }
        */

        int y = 1;
        while (y < 20) {
            if (y % 3 == 0) {
                System.out.println(y + " ");
            }
            y++;
        }
        int z = 1;
        while (z < 20) {
            if (z++ % 3 == 0) {
                System.out.println(z++ + " ");
            }
            z++;
        }
    }
}
