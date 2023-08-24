/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author mamir
 */
public class Percobaan7 {

    public static void main(String args[]) {
        int a, b;
        for (a = 0; a < 2; a++) {
            for (b = 0; b < 3; b++) {
                if (b == 1) {
                    continue;
                }
                System.out.println("a=" + a + " ; b=" + b);
            }
        }
    }

}
