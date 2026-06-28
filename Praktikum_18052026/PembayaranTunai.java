/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
public class PembayaranTunai extends Pembayaran {
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui E-Wallet: ");
        System.out.println("Jumlah Uang : Rp. "+uang);
        if(uang>=jumlahBayar){
            double kembalian = uang-jumlahBayar;
            System.out.println("Uang kembalian = Rp. "+kembalian);
        }
        else{
            double kekurangan = jumlahBayar-uang;
            System.out.println("Pembayaran Gagal, uang anda kurang!!");
            System.out.println("Kekurangan sebesar = Rp. "+kekurangan);
        }
    }
    public void CetakStruuk(){
        System.out.println("\n---BUKTI PEMBAYARAN TUNAI---");
        System.out.println("ID Transaksi = "+idTransaksi);
        System.out.println("Jumlah pembayaran = Rp. "+jumlahBayar);
        System.out.println("Pembayaran dilakukan secara cash");
    }
    
}
