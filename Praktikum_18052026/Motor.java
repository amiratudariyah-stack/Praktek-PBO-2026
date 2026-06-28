/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class Motor extends Transportasi {

    public Motor() {
        super("Motor", 2500);
    }

    @Override
    public double hitungBiaya(double jarakKm) {
        return tarifPerKm * jarakKm;
    }
}
