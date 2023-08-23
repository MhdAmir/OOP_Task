/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author mamir
 */
public class TesLatihan1 {

    public static void main(String args[]) {
        //        Tabungan tabungan = new Tabungan(5000);
//        System.out.println("Saldo awal : " + tabungan.saldo);
//        if(tabungan.ambilUang(6000)){
//            System.out.println("Jumlah uang yang diambil : 2300");
//        }else{
//            System.out.println("Saldo sekarang Kurang");
//        }
//        System.out.println("Saldo sekarang : " + tabungan.saldo);
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : " + tabungan.saldo);
    }
}
