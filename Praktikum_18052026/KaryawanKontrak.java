/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class KaryawanKontrak extends Karyawan {

    private double upahPerJam;
    private int jumlahJamKerja; 

    public KaryawanKontrak(String id, String nama, String jabatan,
                           double upahPerJam, int jumlahJamKerja) {
        super(id, nama, jabatan); 
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }
     public double getUpahPerJam(){ 
        return upahPerJam; 
    }
    public int getJumlahJamKerja(){ 
        return jumlahJamKerja; 
    }

    @Override
    public double hitungTotalGaji() {
        return upahPerJam * jumlahJamKerja;
    }

    @Override
    public void tampilkanDetailGaji() {
        System.out.println("Tipe Karyawan: KARYAWAN KONTRAK");
        System.out.printf("Upah Per Jam  : Rp %.2f%n", upahPerJam);
        System.out.println("Jam Kerja/Bln : " + jumlahJamKerja + " jam");
        System.out.printf("Total Gaji    : Rp %.2f x %d jam%n", upahPerJam, jumlahJamKerja);
    }

   
}
