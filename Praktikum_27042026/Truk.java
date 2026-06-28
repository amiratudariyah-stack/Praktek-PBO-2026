/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Truk extends Mobil {
    protected int muatanMaks;

    public Truk() {
        super(6, "Merah", "Solar", 5000);
        this.muatanMaks = 0;
    }

    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }

    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public int getMuatanMaks() {
        return muatanMaks;
    }

    @Override
    public void cetak() {
        System.out.println("=== DATA TRUK ===");
        super.cetak();
        System.out.println("Muatan Maks     : " + muatanMaks + " ton");
    }
}
