/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBO_30032026;

/**
 *
 * @author Aamee
 */
import java.util.Scanner;
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan NIM   = ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama  = ");
        String nama = input.nextLine();

        System.out.print("Nilai Tugas = ");
        double tugas = input.nextDouble();

        System.out.print("Nilai UTS   = ");
        double uts = input.nextDouble();

        System.out.print("Nilai UAS   = ");
        double uas = input.nextDouble();

        // Membuat objek
        KelasMahasiswa mhs = new KelasMahasiswa(nim, nama, tugas, uts, uas);

        // Menampilkan hasil
        System.out.println("\n=== DATA MAHASISWA ===");
        mhs.tampilData();
    }
}

    

