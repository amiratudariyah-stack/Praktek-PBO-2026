/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public abstract class Transportasi {
    protected String namaTransportasi;
    protected double tarifPerKm;

    public Transportasi(String namaTransportasi, double tarifPerKm) {
        this.namaTransportasi = namaTransportasi;
        this.tarifPerKm = tarifPerKm;
    }

    public abstract double hitungBiaya(double jarakKm);

    public String getNamaTransportasi() {
        return namaTransportasi;
    }

    public double getTarifPerKm() {
        return tarifPerKm;
    }

  
    public void tampilkanInfo(String namaPenumpang, String tujuan, double jarakKm) {
        System.out.println("==========================================");
        System.out.println("       INFORMASI PERJALANAN");
        System.out.println("==========================================");
        System.out.println("Nama Penumpang : " + namaPenumpang);
        System.out.println("Tujuan         : " + tujuan);
        System.out.println("Transportasi   : " + namaTransportasi);
        System.out.println("Jarak          : " + jarakKm + " km");
        System.out.printf("Biaya Perjalanan: Rp %.2f%n", hitungBiaya(jarakKm));
        System.out.println("==========================================");
    }
}

