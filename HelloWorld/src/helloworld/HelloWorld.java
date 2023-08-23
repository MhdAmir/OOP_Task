/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.LinkedList;

import java.util.Scanner;

/** 
 *
 * @author mamir
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Decimal Converter to Hexa and Binary\n");
        Scanner decimal = new Scanner(System.in);
        System.out.print("Enter In Decimal : ");
        int input = decimal.nextInt();

        LinkedList<Integer> bit = new LinkedList<>();
        var temp_bit = input;
        while(temp_bit > 0){
          bit.push(temp_bit%2);
          temp_bit = temp_bit /2;
        }
        System.out.print("Bit :");
        for(Integer number :bit){
            System.out.print(number);
        }
        System.out.print("\n");
        
        LinkedList<Integer> hex = new LinkedList<>();
        var temp_hex = input;

        while(temp_hex > 0){
          hex.push(temp_hex%16);
          temp_hex = temp_hex/16;
        }
        System.out.print("Hex :");

        for(Integer number :hex){
            if(number == 10){
                System.out.print("A");
            }else if(number == 11){
                System.out.print("B");
            }else if(number == 12){
                System.out.print("C");
            }else if(number == 13){
                System.out.print("D");
            }else if(number == 14){
                System.out.print("E");
            }else if(number == 15){
                System.out.print("F");
            }else{
                System.out.print(number);            
            }
        }
        System.out.print("\n");

        
    }
    
}
