/*
Program : Pesanan.Mengetik
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 3
 */
package tugas.dirumah;

import java.util.Scanner;
public class Kelipatan11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       System.out.print("Awal: ");
        int a = input.nextInt();
        System.out.print("Akhir: ");
        int b = input.nextInt();

        int jumlah = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 11 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
                jumlah += i;
                count++;
            }
        }

        System.out.println("\nJumlah: " + jumlah);
        System.out.println("Rata-rata: " + (count > 0 ? (double) jumlah / count : 0));
    } 
    
}
