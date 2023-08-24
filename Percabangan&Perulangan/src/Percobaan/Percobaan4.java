/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author mamir
 */
public class Percobaan4 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < i+1; j++){
                System.out.println(count);
            }
            count ++;
            System.out.println();
        }
    }
}
