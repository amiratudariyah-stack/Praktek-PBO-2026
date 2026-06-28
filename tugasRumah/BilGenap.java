/*
Program : Pesanan.Mengetik
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 4
 */
package tugas.dirumah;

import java.util.Scanner;
public class BilGenap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka;
        
        do{
            System.out.print("Masukkan angka genap= ");
            angka= input.nextInt();
        }while(angka % 2 != 0);
        
        angka += 1;
        System.out.println("Hasil:"+angka);
  
    }
    
}
