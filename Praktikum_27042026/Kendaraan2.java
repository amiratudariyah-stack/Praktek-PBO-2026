/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class Kendaraan2 {
    protected int jmlRoda;
    protected String warna;

    public Kendaraan2() {
        this.jmlRoda = 0;
        this.warna = "";
    }

    public Kendaraan2(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void cetak() {
        System.out.println("Jumlah Roda : " + jmlRoda);
        System.out.println("Warna       : " + warna);
    }
}
