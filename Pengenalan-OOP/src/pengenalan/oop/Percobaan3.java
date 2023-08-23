/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengenalan.oop;

/**
 *
 * @author mamir
 */
public class Percobaan3 {
     public static class Siswa {
        int nrp;
        
        public Siswa(int i){
            nrp = i;
        }
        public void setNrp(int i){
            nrp = i;
        }
        public int getNrp(){
            return nrp;
        }
    }
    public static void main(String[] args) {
        Siswa anak = new Siswa(20);
        System.out.println(anak.getNrp());
        
        anak.setNrp(10);
        System.out.println(anak.getNrp());
    }
}
