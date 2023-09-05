/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class Latihan3_Prima {

    public static void main(String[] args) {
        int n = 0;
        boolean not_prime = false;
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan? ");
            n = (int) in.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        for(int i = 2; i <= sqrt(n); i++){
            if(n % i == 0){
                not_prime = true;
            }
        }
        
        if(not_prime){
            System.out.println(n+" bukan termasuk bilangan prima");
        }else {
            System.out.println(n+" adalah bilangan prima");
        }

    }

}
