/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author mamir
 */
public class Percobaan3 {

    public static void main(String args[]) {
        int x[][][][] = new int[2][][][];
        x[0] = new int[1][][];
        x[0][0] = new int[2][];
        x[0][0][0] = new int[3];
        x[0][0][1] = new int[2];
        x[1] = new int[2][][];
        x[1][0] = new int[1][];
        x[1][0][0] = new int[2];
        x[1][1] = new int[2][];
        x[1][1][0] = new int[1];
        x[1][1][1] = new int[3];
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[0][0].length);
        System.out.println(x[0][0][0].length);
        System.out.println(x[0][0][1].length);
        System.out.println();
        System.out.println(x[1].length);
        System.out.println(x[1][0].length);
        System.out.println(x[1][0][0].length);
        System.out.println(x[1][1].length);
        System.out.println(x[1][1][0].length);
        System.out.println(x[1][1][1].length);
    }
}
