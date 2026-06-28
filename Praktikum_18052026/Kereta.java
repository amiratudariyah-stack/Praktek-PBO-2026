/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class Kereta extends Transportasi {

    private String kelas;
    private double pilihKelas;

    public Kereta(String kelas) {
        super("Kereta (" + kelas + ")", 4000); // Tarif dasar Rp 4.000 per km
        this.kelas = kelas;

        // Multiplier berdasarkan kelas
        switch (kelas.toLowerCase()) {
            case "ekonomi":
                this.pilihKelas = 1.0;
                break;
            case "bisnis":
                this.pilihKelas = 1.5;
                break;
            case "eksekutif":
                this.pilihKelas = 2.0;
                break;
            default:
                this.pilihKelas = 1.0;
        }
    }

    // Override - Polymorphism
    @Override
    public double hitungBiaya(double jarakKm) {
        return tarifPerKm * jarakKm * pilihKelas;
    }

    public String getKelas() {
        return kelas;
    }
}

