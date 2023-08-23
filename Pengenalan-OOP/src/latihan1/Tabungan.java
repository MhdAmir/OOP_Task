/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author mamir
 */
public class Tabungan {

    int saldo;

    public Tabungan(int initSaldo) {
        saldo = initSaldo;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo > 0 && jumlah < saldo) {
            saldo = saldo - jumlah;
            return true;
        } else {
            return false;
        }
    }
}
