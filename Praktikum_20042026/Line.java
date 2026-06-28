/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_20042026;

/**
 *
 * @author Lenovo
 */
public class Line {
    private Point begin;
    private Point end;

    // Constructor default
    public Line() {
        begin = new Point(0, 0);
        end = new Point(0, 0);
    }

    // Constructor dengan parameter
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter & Setter
    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Menghitung panjang garis
    public double getLength() {
        return begin.distance(end);
    }

    // Menampilkan garis
    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
}