/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author mamir
 */
public class no4 {

    public static void main(String[] args) {

        bangunReal[] bgn_dtr = new bangunReal[501];
        System.out.println("\tL\tKel");

        for (int i = 1; i < bgn_dtr.length; i++) {
            bgn_dtr[i] = new bangunReal(i);
            System.out.println("persegi ke-" + i + " luas = " + bgn_dtr[i].luas_persegi() + " & keliling = " + bgn_dtr[i].keliling_persegi());
            System.out.println("segitiga ke-" + i + " luas = " + bgn_dtr[i].luas_seg() + " & keliling = " + bgn_dtr[i].kel_seg());
            System.out.println("lingkaran ke-" + i + " luas = " + bgn_dtr[i].luas_ling() + " & keliling = " + bgn_dtr[i].kel_ling());
            System.out.println("jajargenjang ke-" + i + " luas = " + bgn_dtr[i].luas_jg() + " & keliling = " + bgn_dtr[i].kel_jg());
            System.out.println("Kubus ke-" + i + " luas alas= " + bgn_dtr[i].l_a_kubus() + " & volume = " + bgn_dtr[i].volume_kubus());
            System.out.println("balok ke-" + i + " luas alas= " + bgn_dtr[i].l_a_balok() + " & volume = " + bgn_dtr[i].volume_balok());

        }

    }
}
