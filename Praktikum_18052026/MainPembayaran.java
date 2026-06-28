/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_18052026;

import java.util.Scanner;


public class MainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // deklarasi variabel objek dengan inisialisasi nilai awal null
        Pembayaran pembayaran = null;
        
        System.out.println("-----Sistem Pembayaran Toko Online------");
        System.out.println("Masukkan ID transaksi = ");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan jumlah Bayar : ");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih metode Pembayaran : ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("4. Tunai");

        System.out.println("pilih metode Pembayaran Anda (1/2/3/4) : ");
        int pilihan=scanner.nextInt();
        scanner.nextLine();//buffer clear atau membersihkan variabel agar tidak kacau
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.println("MAsukkan nama Tujuan Bank = ");
                     String bank=scanner.nextLine();
                     pembayaran=new PembayaranTransfer(bank,jumlah,id);
                     break;
            case 2 : System.out.println("Metode Kartu Kredit Bank");
                     System.out.println("MAsukkan nomor Kartu Kredit = ");
                     String no=scanner.nextLine();
                     pembayaran=new PembayaranKredit(no,jumlah,id);
                    break;
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.println("MAsukkan label E-Wallet = ");
                     String wal=scanner.nextLine();
                     pembayaran=new PembayaranKredit(wal,jumlah,id);
                    break;
            case 4 : System.out.println("Metode pembayaran tunai");
                    double uang =scanner.nextDouble();
                    pembayaran = new PembayaranTunai(uang,jumlah,id);
                    
                   break;
        }
        System.out.println("===Konfirmasi Bukti Pembayaran");
        pembayaran.prosesPembayaran();
    }
    
}
