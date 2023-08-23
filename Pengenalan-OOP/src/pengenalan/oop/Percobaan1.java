/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pengenalan.oop;

/**
 *
 * @author mamir
 */
public class Percobaan1 {
    public static class Siswa {
        int nrp;
        public void setNrp(int i) {
        nrp=i;
        }
    }
    public static class Test {
        public static void main(String args[]) {
            Siswa anak=new Siswa();
            anak.setNrp(5);
            System.out.println(anak.nrp);
        }
    }

}
