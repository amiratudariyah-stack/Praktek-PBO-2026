/*
Program : Pesanan.Mengetik
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 1
 */
package tugas.dirumah;

import java.util.Scanner;
public class PesananMengetik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=50;
        int harga=15000;
        
        System.out.print("Masukkan halaman selesai= ");
        int x=input.nextInt();
        int uang = x*harga;
        int sisa = (total-x)*harga;
        
        System.out.println("Uang diterima= "+uang);
        System.out.println("Jika sudah selesai semua= "+(uang+sisa));
        
  
    }
    
}
