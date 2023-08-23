/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author mamir
 */
public class Tabungan {
    int saldo;
    public Tabungan(int initsaldo){
        saldo = initsaldo;
    }
    public int getSaldo(){
        return saldo;
    }
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah){
        if (jumlah < saldo) {
            saldo = saldo - jumlah;
            return true;
        } else {
            return false;
        }
    }
}
