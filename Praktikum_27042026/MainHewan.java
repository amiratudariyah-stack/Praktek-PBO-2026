/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class MainHewan {
    public static void main(String[] args) {
        //pembuatan objek
        Hewan hewanku=new Hewan("Makhluk Hidup");
        Kucing kucingku=new Kucing("Martin ");
        Anjing anjingku=new Anjing("Keonho ");
        //mengakses super class
        System.out.println("Tampilkan akses super class Hewan");
        hewanku.tampilkanNama();
        hewanku.bersuara();
        
        //mengakses sub class kucing
        System.out.println("\nTampilkan akses super class kucing");
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        //mengakses sub class anjing
        System.out.println("\nTampilkan akses super class anjing");
        anjingku.tampilkanNama();
        anjingku.bersuara();
    }
    
}
