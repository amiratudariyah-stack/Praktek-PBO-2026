/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public abstract class Karyawan {
    protected String id;
    protected String nama;
    protected String jabatan;

    public Karyawan(String id, String nama, String jabatan) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public abstract double hitungTotalGaji();
    public abstract void tampilkanDetailGaji();

    public String getId(){
        return id; 
    }   
    public String getNama(){ 
        return nama; 
    }
    public String getJabatan(){ 
        return jabatan; 
    }

    public void tampilkanInfo() {
        System.out.println("==========================================");
        System.out.println("        SLIP GAJI KARYAWAN");
        System.out.println("==========================================");
        System.out.println("ID Karyawan  : " + id);
        System.out.println("Nama         : " + nama);
        System.out.println("Jabatan      : " + jabatan);
        System.out.println("------------------------------------------");
        tampilkanDetailGaji(); 
        System.out.println("------------------------------------------");
        System.out.printf("TOTAL GAJI   : Rp %.2f%n", hitungTotalGaji());
        System.out.println("==========================================");
    }
}