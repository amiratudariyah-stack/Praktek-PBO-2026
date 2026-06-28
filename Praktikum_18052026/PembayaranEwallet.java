/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public  class PembayaranEwallet extends Pembayaran{
    private String namaEwallet;

    public PembayaranEwallet(String namaEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEwallet = namaEwallet;
    }

    public String getNamaEwallet() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }
   
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("E-Wallet: " + namaEwallet);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jumlah BAyar: " + jumlahBayar);
    }
}
