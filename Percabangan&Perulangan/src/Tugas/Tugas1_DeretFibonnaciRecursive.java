/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class Tugas1_DeretFibonnaciRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        try {
            System.out.println("Masukkan berapa deret Fibonacci? ");
            n = (int) in.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.print(n + "deret Fibonacci = ");
        for(int i = 1; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
