/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3;

/**
 *
 * @author mamir
 */
public class Truk {

    double muatan, muatanMaks;

    public Truk(double beratMaks) {
        muatanMaks = beratMaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanMaks() {
        return muatanMaks;
    }

    public void tambahMuatan(double berat) {
        if (muatan + berat < muatanMaks) {
            muatan = muatan + berat;
        }
    }
}
