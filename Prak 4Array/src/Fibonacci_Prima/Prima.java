/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci_Prima;

import static java.lang.Math.sqrt;

/**
 *
 * @author mamir
 */
public class Prima {
    int banyak;
    public Prima(int banyak){
        this.banyak = banyak;
    }
    public boolean isPrime(int nilai){
        for(int i = 2; i <= sqrt(nilai); i++){
            if(nilai % i == 0){
                return false;
            }
        }
        return true;
    }
    public void tampil(){
        int nilai = 2;
        int i = 0;
        System.out.print(banyak + " deret prima = ");
        while(i < banyak){
            if(isPrime(nilai)){
                System.out.print(nilai + " ");
                i++;
            }
            nilai++;
        }
        System.out.println();
    }
}
