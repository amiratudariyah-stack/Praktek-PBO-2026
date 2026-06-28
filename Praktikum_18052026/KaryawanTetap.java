/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class KaryawanTetap extends Karyawan {

    private double gajiBulanan;
    private static final double persen= 0.025; 

    public KaryawanTetap(String id, String nama, String jabatan, double gajiBulanan) {
        super(id, nama, jabatan); 
        this.gajiBulanan = gajiBulanan;
    }

    public double getTunjangan() {
        return gajiBulanan * persen;
    }

    
    @Override
    public double hitungTotalGaji() {
        return gajiBulanan + getTunjangan();
    }

   
    @Override
    public void tampilkanDetailGaji() {
        System.out.println("Tipe Karyawan: KARYAWAN TETAP");
        System.out.printf("Gaji Pokok   : Rp %.2f%n", gajiBulanan);
        System.out.printf("Tunjangan    : Rp %.2f (2.5%% dari gaji pokok)%n", getTunjangan());
    }

    public double getGajiBulanan(){
        return gajiBulanan; 
    }
}
