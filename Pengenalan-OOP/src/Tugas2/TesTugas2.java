/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author mamir
 */
public class TesTugas2 {

    public static void main(String args[]) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "minibus", 2000, 7);
        mobil1.infoMobil();
        
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "pickup", 1500, 2);
        mobil2.infoMobil();

        Mobil mobil3 = new Mobil("Suzuki", "Silver", "suv", 1800, 5);
        mobil3.infoMobil();

        Mobil mobil4 = new Mobil("Honda", "Merah", "sedan", 1300, 5);
        mobil4.infoMobil();

    }
}
