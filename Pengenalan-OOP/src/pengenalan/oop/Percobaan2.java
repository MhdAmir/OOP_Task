/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengenalan.oop;

/**
 *
 * @author mamir
 */



public class Percobaan2 {
    /**
     */
    public static class Siswa {
        int nrp;
        String nama;
        
        public void setNrp(int i) {
            nrp = i;
        }
        
        public void setNama(String i){
            nama = i;
        }
    }
    public static void main(String[] args) {
        Siswa anak = new Siswa();
        anak.setNrp(5);
        anak.setNama("Amir");
        System.out.println(anak.nrp);
        System.out.println(anak.nama);
    }
    
}
