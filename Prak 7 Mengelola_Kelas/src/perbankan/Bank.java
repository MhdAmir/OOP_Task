/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author mamir
 */
public class Bank {
    Nasabah[] nasabah;
    int jumlahNasabah;
    
    public Bank(){}
    
    public void tambahNasabah(String namaAwal, String namaAkhir){
        if(nasabah == null){
            nasabah = new Nasabah[100];
        }
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }
    public int getJumlahNasabah(){
        return jumlahNasabah;
    }
    public Nasabah getNasabah(int indeks){
        return nasabah[indeks];
    }
}
