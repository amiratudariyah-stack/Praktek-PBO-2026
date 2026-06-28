/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Transportasi {

    private int kapasitasPenumpang;

    public Mobil() {
        super("Mobil", 5000); 
        this.kapasitasPenumpang = 4;
    }

    @Override
    public double hitungBiaya(double jarakKm) {
        return tarifPerKm * jarakKm;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }
}
