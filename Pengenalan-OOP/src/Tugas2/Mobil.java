/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author mamir
 */
public class Mobil {

    String merk;
    String warna;
    String tipe;
    int harga;
    int jumlah;

    public Mobil(String merk, String warna, String tipe, int harga, int jumlah) {
        this.merk = merk;
        this.warna = warna;
        this.tipe = tipe;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void infoMobil() {
        System.out.println("Merk : " + merk);
        System.out.println("warna : " + warna);
        System.out.println("tipe : " + tipe);
        System.out.println("harga : " + harga);
        System.out.println("jumlah : " + jumlah + "\n\n");
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
}
