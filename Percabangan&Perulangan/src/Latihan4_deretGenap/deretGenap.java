/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4_deretGenap;

import java.util.Scanner;

/**
 *
 * @author mamir
 */
public class deretGenap {
    public static void main(String[] args) {
        for(int i = 2; i <= 20; i+=2){
            if(i % 6 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
