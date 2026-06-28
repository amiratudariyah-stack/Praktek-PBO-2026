/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi() {
        super(4, "Kuning", "Bensin", 1500);
        this.tarifAwal = 0;
        this.tarifPerKm = 0;
    }

    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin,
                 int tarifAwal, int tarifPerKm) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }

    public int hitungTarif(int km) {
        return tarifAwal + (tarifPerKm * km);
    }

    @Override
    public void cetak() {
        System.out.println("=== DATA TAKSI ===");
        super.cetak();
        System.out.println("Tarif Awal      : Rp " + tarifAwal);
        System.out.println("Tarif Per Km    : Rp " + tarifPerKm);
    }
}
