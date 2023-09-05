/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fibonacci_Prima;

/**
 *
 * @author mamir
 */
public class Fibonacci {
    int n0 = 0;
    int n1 = 1;
    int hasil;
    int banyak;
    
    public Fibonacci(int banyak){
        this.banyak = banyak;
    }
    
    public long fibonacci_recursive(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
    }
    public void tampil(){
        int i1 = 0;
        int i2 = 1;
        int hasil = 1;

        System.out.print(banyak + " deret Fibonacci = ");
        for (int i = 1; i <= banyak; i++) {
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
//        System.out.print(banyak + " deret Fibonacci = ");
//        for(int i = 1; i <= banyak; i++){
//            System.out.print(fibonacci_recursive(i) + " ");
//        }
//        System.out.println();
//    }
}
