/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import static Tugas.Tugas1_DeretFibonnaci.fibonacci;
import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class Tugas1_DeretFibonnaciFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int i1 = 0;
        int i2 = 1;
        int hasil = 1;

        try {
            System.out.println("Masukkan berapa deret Fibonacci? ");
            n = (int) in.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.print(n + "deret Fibonacci = ");
        for (int i = 1; i <= n; i++) {
            int temp1, temp2;
            if (i == 1) {
                System.out.print(i1 + " ");
            } else if (i == 2) {
                System.out.print(i2 + " ");
            } else {
                temp1 = i1;
                temp2 = i2;
                i1 = i2;
                hasil = temp1 + temp2;
                i2 = hasil;

                System.out.print(hasil + " ");
            }
        }
        System.out.println();

    }
}
