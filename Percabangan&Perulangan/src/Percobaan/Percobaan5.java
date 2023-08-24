/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author mamir
 */
public class Percobaan5 {
    public static void main(String[] args) {
        int count = 1;
        int i = 0;
        while(i < 9){
            int j = 0;
            while(j < i+1){
                System.out.println(count);
                j++;
            }
            count++;
            System.out.println();
            i++;
        }
    }
}
