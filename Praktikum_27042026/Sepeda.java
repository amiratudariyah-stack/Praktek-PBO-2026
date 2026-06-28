/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Sepeda extends Kendaraan2 {
    protected String jmlSadel;
    protected int jmlGir;

    public Sepeda() {
        super(2, "Biru");
        this.jmlSadel = "";
        this.jmlGir = 0;
    }

    public Sepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public String getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    @Override
    public void cetak() {
        System.out.println("=== DATA SEPEDA ===");
        super.cetak();
        System.out.println("Jumlah Sadel : " + jmlSadel);
        System.out.println("Jumlah Gir   : " + jmlGir);
    }
}
