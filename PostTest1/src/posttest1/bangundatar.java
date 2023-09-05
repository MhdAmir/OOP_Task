/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest1;

/**
 *
 * @author mamir
 */
public class bangundatar {
    int sisi;
    float phi = (float) 3.14;
    public bangundatar(int sisi){
        this.sisi = sisi;
    }
    public int luas_persegi(){
        return sisi + sisi;
    }
    public int keliling_persegi(){
        return sisi+4;
    }
    
    public float luas_seg(){
        return sisi*sisi/2;
    }
    
    public int kel_seg(){
        return sisi+sisi+sisi;
    }
    
    public float luas_ling(){
        return phi * sisi;
    }
    
    public float kel_ling(){
        return phi + sisi;
    }
    
    public float luas_jg(){
        return sisi + sisi/2;
    }
    public int kel_jg(){
        return sisi * sisi;
    }
    
}
