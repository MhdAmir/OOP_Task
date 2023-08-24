/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2_bilFaktorial;

import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class bilFaktorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        try {
            System.out.print("Masukkan bilangan faktorial: ");
            n = (int) in.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("n\tn!");
        System.out.println("----------------------");
        for(int i = 1; i <= n ;i++){
            System.out.println(i + "\t" + faktorial(i));
        }
    }
    
    public static int faktorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}


