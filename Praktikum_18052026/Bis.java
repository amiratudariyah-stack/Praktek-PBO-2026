/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class Bis extends Transportasi{
    private double biayaAdmin;

    public Bis() {
        super("Bis", 3000); 
        this.biayaAdmin = 5000; 
    }

    @Override
    public double hitungBiaya(double jarakKm) {
        return (tarifPerKm * jarakKm) + biayaAdmin;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }
}

    

