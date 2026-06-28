/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class Hewan {
    protected String nama;
    
    public Hewan(String nama){
        this.nama=nama;
    }
    public void bersuara(){
        System.out.println("Hewan Bersuara...");
    }
    public void tampilkanNama(){
        System.out.println("Nama hewan "+nama);
    }
}

