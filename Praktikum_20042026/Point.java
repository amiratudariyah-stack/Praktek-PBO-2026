/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_20042026;

/**
 *
 * @author Lenovo
 */
public class Point {
    private int x;
    private int y;

    // Constructor default
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor dengan parameter
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method untuk menampilkan titik
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Menghitung jarak ke titik lain
    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
}