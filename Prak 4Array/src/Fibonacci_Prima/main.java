/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci_Prima;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class main {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Masukkan bilangan? ");
            n = (int) in.nextInt();
            Fibonacci fib = new Fibonacci(n);
            fib.tampil();
            Prima prima = new Prima(n);
            prima.tampil();
        } 
        catch (InputMismatchException e){
            System.out.println("Salah input woyy!!");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
