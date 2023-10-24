/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testing;

/**
 *
 * @author mamir
 */
public class cobaStrMatch {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+"); // Uses a regular expression to match one or more digits
    }

    public static void main(String[] args) {
        String input = "13653";
        boolean isNumeric = isNumeric(input);
        System.out.println("Is numeric: " + isNumeric);
    }

}
