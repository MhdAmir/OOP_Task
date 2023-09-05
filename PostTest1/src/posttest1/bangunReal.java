/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

import static java.lang.Math.sqrt;

/**
 *
 * @author mamir
 */
public class bangunReal {

    int sisi;
    float phi = (float) 3.14;

    public bangunReal(int sisi) {
        this.sisi = sisi;
    }

    public int luas_persegi() {
        return sisi * sisi;
    }

    public int keliling_persegi() {
        return sisi * 4;
    }

    public float luas_seg() {
        return (float) ((sisi * sisi * sqrt(3)) / 4);
    }

    public int kel_seg() {
        return sisi * 3;
    }

    public float luas_ling() {
        return phi * sisi * sisi;
    }

    public float kel_ling() {
        return phi * 2 * sisi;
    }

    public float luas_jg() {
        return 2 * sisi * sisi / 2;
    }

    public int kel_jg() {
        return 4 * sisi;
    }

    public int l_a_kubus() {
        return 6 * sisi * sisi;
    }

    public int l_a_balok() {
        return 2 * (((2 * sisi) * sisi) + (sisi * sisi) + (sisi * sisi));

    }

    public int volume_kubus() {
        return sisi * sisi * sisi;
    }

    public int volume_balok() {
        return sisi * 2 * sisi * sisi;
    }
}
