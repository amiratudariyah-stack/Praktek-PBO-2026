/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

public class Mobil extends Kendaraan2 {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public Mobil() {
        super(4, "Putih");
        this.bahanBakar = "";
        this.kapasitasMesin = 0;
    }

    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda, warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Bahan Bakar     : " + bahanBakar);
        System.out.println("Kapasitas Mesin : " + kapasitasMesin + " cc");
    }
}

