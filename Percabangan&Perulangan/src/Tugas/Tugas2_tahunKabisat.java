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
public class Tugas2_tahunKabisat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        try {
            System.out.print("Masukkan tahun (1900-2005) :");
            n = (int) in.nextInt();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if(n > 2005){
            System.out.println("Maaf, tahun input diatas 2005");
        }else if(n < 1900){
            System.out.println("Maaf, tahun input dibawah 1900");
        }else{
            if(n % 4 == 0 || n % 400 == 0){
                System.out.println(n + " adalah tahun kabisat");
            }else {
                System.out.println(n + " bukan tahun kabisat");
            }
        }
    }
}
