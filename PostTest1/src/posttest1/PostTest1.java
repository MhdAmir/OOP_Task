/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

/**
 *
 * @author mamir
 */
public class PostTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        bangundatar[] bgn_dtr = new bangundatar[501];
        System.out.println("\tL\tKel");

        for (int i = 1; i < bgn_dtr.length; i++) {
            bgn_dtr[i] = new bangundatar(i);
            System.out.println("persegi ke-" + i + " luas = " + bgn_dtr[i].luas_persegi() + " & keliling = " + bgn_dtr[i].keliling_persegi());
            System.out.println("segitiga ke-" + i + " luas = " + bgn_dtr[i].luas_seg() + " & keliling = " + bgn_dtr[i].kel_seg());
            System.out.println("lingkaran ke-" + i + " luas = " + bgn_dtr[i].luas_ling() + " & keliling = " + bgn_dtr[i].kel_ling());
            System.out.println("jajargenjang ke-" + i + " luas = " + bgn_dtr[i].luas_jg() + " & keliling = " + bgn_dtr[i].kel_jg());
            

        }

    }

}
