/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author mamir
 */
public class Tugas1_mencariPosisiArray {
    public static void main(String[] args) {
//        int arr[][] = new int[3][3];
        int[][] arr ={ { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 }};
        int n_cari = 12;
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == n_cari){
                    System.out.println("Found " + n_cari + " at " + i + ", "+ j);
                }
            }
        }
    }
}
