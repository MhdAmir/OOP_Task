/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author mamir
 */
public class Tugas2_hitungJumlahA {
    public static void main(String[] args) {
        char[] matKul = {'p','e','m','r','o','g','r','a','m','a','n','b','e','r','b','a','s','i','s','o','b','y','e','k'};
        char h_cari = 'a';
        int jumlah_huruf = 0;
        for(int i = 0; i < matKul.length; i++){
            if(h_cari == matKul[i]){
                jumlah_huruf++;
            }
        }
        System.out.println("jumlah huruf "+ h_cari + ", berjumlah : " + jumlah_huruf);
        
    }
}
