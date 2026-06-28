/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_20042026;

/**
 *
 * @author Lenovo
 */
public class MainLine {
     public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        Line garis = new Line(p1, p2);

        System.out.println(garis);
        System.out.println("Panjang garis: " + garis.getLength());
    }
    
    
}
