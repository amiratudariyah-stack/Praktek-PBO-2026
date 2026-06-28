/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class Kendaraan {
    private String nama;
    private int tahunProduksi;

    public Kendaraan() {
        this.nama = "";
        this.tahunProduksi = 0;
    }

    public Kendaraan(String nama, int tahunProduksi) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getTahunProduksi() { return tahunProduksi; }
    public void setTahunProduksi(int tahunProduksi) { this.tahunProduksi = tahunProduksi; }

    public void cetak() {
        System.out.println("Nama       : " + nama);
        System.out.println("Tahun Prod : " + tahunProduksi);
    }
}