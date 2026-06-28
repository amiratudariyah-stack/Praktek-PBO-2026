/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class PembayaranKredit extends Pembayaran{
    private String nomorKartu;

    public PembayaranKredit(String nomorKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.nomorKartu = nomorKartu;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    public void prosesPemebayaran(){
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("NO. Kartu Kredit" + nomorKartu);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jumlah BAyar: " + jumlahBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui E-Wallet:");
        System.out.println("Kartu Kredit: " + nomorKartu);
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Jumlah BAyar: " + jumlahBayar);    }
    
}
