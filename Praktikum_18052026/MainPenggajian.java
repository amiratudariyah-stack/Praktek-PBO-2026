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

public class MainPenggajian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("      INPUT DATA KARYAWAN TETAP");
        System.out.println("==========================================");
        System.out.print("ID Karyawan  : ");
        String idTetap = sc.nextLine();
        System.out.print("Nama         : ");
        String namaTetap = sc.nextLine();
        System.out.print("Jabatan      : ");
        String jabatanTetap = sc.nextLine();
        System.out.print("Gaji Bulanan : Rp ");
        double gaji = sc.nextDouble();
        sc.nextLine();

        KaryawanTetap kt = new KaryawanTetap(idTetap, namaTetap, jabatanTetap, gaji);

        System.out.println("\n==========================================");
        System.out.println("     INPUT DATA KARYAWAN KONTRAK");
        System.out.println("==========================================");
        System.out.print("ID Karyawan     : ");
        String idKontrak = sc.nextLine();
        System.out.print("Nama            : ");
        String namaKontrak = sc.nextLine();
        System.out.print("Jabatan         : ");
        String jabatanKontrak = sc.nextLine();
        System.out.print("Upah Per Jam    : Rp ");
        double upah = sc.nextDouble();
        System.out.print("Jam Kerja/Bulan : ");
        int jamKerja = sc.nextInt();
        sc.nextLine();

        KaryawanKontrak kk = new KaryawanKontrak(idKontrak, namaKontrak, jabatanKontrak, upah, jamKerja);

        System.out.println("\n\n========== SLIP GAJI ==========");
        kt.tampilkanInfo();
        System.out.println();
        kk.tampilkanInfo();

    }
}
        
       
   


