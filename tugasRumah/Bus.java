/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 10
 */
package tugas.dirumah;

import java.util.Scanner;
public class Bus {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         int[][] harga = {
            {70000,40000,10000},
            {80000,50000,20000},
            {90000,60000,30000}
        };

        System.out.print("Tujuan (1-3)= ");
        int tujuan = input.nextInt();
        System.out.print("Kelas (1-3)= ");
        int kelas = input.nextInt();
        System.out.print("Jumlah tiket= ");
        int jumlah = input.nextInt();

        int h = harga[tujuan-1][kelas-1];
        int total = h * jumlah;
        double diskon = 0;

        if ((tujuan == 3 && kelas == 1 && jumlah >= 4) ||
            (tujuan == 2 && kelas == 3 && jumlah >= 4)) {
            diskon = 0.1;
        }

        double bayar= total-(total*diskon);

        System.out.println("Harga= " + h);
        System.out.println("Total= " + total);
        System.out.println("Diskon= " + (diskon * 100) + "%");
        System.out.println("Bayar=  " + bayar);
    }
    
}
