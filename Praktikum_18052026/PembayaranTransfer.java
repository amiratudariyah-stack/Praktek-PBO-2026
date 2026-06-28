/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class PembayaranTransfer extends Pembayaran {
    private String namaBank;

    public PembayaranTransfer(String NamaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String NamaBank) {
        this.namaBank = namaBank;
    }
    
    
    @Override
    public void prosesPembayaran(){
         System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Bank tujuan: " + namaBank);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jumlah BAyar: " + jumlahBayar);
    }
}
