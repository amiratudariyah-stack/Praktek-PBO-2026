/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_18052026;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class MainTransportasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("    SISTEM PEMESANAN TRANSPORTASI");
        System.out.println("==========================================");


        System.out.print("Masukkan Nama Penumpang : ");
        String namaPenumpang = sc.nextLine();

        System.out.print("Masukkan Tujuan         : ");
        String tujuan = sc.nextLine();

        System.out.print("Masukkan Jarak (km)     : ");
        double jarak = sc.nextDouble();

        System.out.println("\nPilih Jenis Transportasi:");
        System.out.println("1. Mobil   (Rp 5.000/km)");
        System.out.println("2. Motor   (Rp 2.500/km)");
        System.out.println("3. Bis     (Rp 3.000/km + Rp 5.000 admin)");
        System.out.println("4. Kereta");
        System.out.print("Pilihan (1-4): ");
        int pilihan = sc.nextInt();

        Transportasi transport = null;

        switch (pilihan) {
            case 1:
                transport = new Mobil();
                break;
            case 2:
                transport = new Motor();
                break;
            case 3:
                transport = new Bis();
                break;
            case 4:
                System.out.println("\nPilih Kelas Kereta:");
                System.out.println("1. Ekonomi   (tarif normal)");
                System.out.println("2. Bisnis    (tarif x1.5)");
                System.out.println("3. Eksekutif (tarif x2.0)");
                System.out.print("Pilihan kelas (1-3): ");
                int pilihKelas = sc.nextInt();
                String kelas;
                switch (pilihKelas) {
                    case 1: kelas = "Ekonomi"; break;
                    case 2: kelas = "Bisnis"; break;
                    case 3: kelas = "Eksekutif"; break;
                    default: kelas = "Ekonomi";
                }
                transport = new Kereta(kelas);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        System.out.println();
        transport.tampilkanInfo(namaPenumpang, tujuan, jarak);

        sc.close();
    }
}

