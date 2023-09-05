/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

import static java.lang.Math.abs;

/**
 *
 * @author mamir
 */
public class Shape {
    public double length;
    public double width;
    public double height;
    public double volume;
    
    public Shape(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
        calculateVolume();
    }
    public double compareTo(Shape shape){
        return abs(this.volume - shape.volume);
    }
    
    private void calculateVolume(){
        this.volume = length * width * height;
    }
    public void cetak(){
        System.out.println("Panjangxlebarxtinggi = " + length + "x" + width + "x"
        + height);
        System.out.println("Volume = " + volume);
    }
}
