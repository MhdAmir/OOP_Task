/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author mamir
 */
public class Latihan1_NilaiSiswa {

    public static void main(String[] args) {
        int nilai[][] = new int[4][3];
        float jumlah = 0;
        float ratarata;
        
        nilai[0][0] = 81;
        nilai[0][1] = 90;
        nilai[0][2] = 62;
        nilai[1][0] = 50;
        nilai[1][1] = 83;
        nilai[1][2] = 87;
        nilai[2][0] = 89;
        nilai[2][1] = 55;
        nilai[2][2] = 65;
        nilai[3][0] = 77;
        nilai[3][1] = 70;
        nilai[3][2] = 92;
        
        System.out.println("NRP\tRata-rata");
        for (int i = 0; i < 4; i++) {
            jumlah = 0;
            for(int j = 0; j < 3; j++){
                jumlah += nilai[i][j];
            }
            ratarata = jumlah/3;
            System.out.println(i+1 + "\t" + ratarata);
        }
    }

}
