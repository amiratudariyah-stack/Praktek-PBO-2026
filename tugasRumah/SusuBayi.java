/*
Program : Pesanan.Mengetik
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 2
 */
package tugas.dirumah;

import java.util.Scanner;
public class SusuBayi {

   
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("1.X ");
        System.out.println("2.Y ");
        System.out.println("3.Z ");
        System.out.print("Masukkan Pilihan= ");
        
        int pilihan= input.nextInt();
        System.out.print("Jumlah beli= ");
        int jumlah=input.nextInt();
        
        int harga=0;
        double diskon=0;
        
        switch(pilihan){
            case 1: 
                harga=40000;
                if(jumlah >= 3){
                    diskon=0.12;
                }break;
            case 2:
                harga=50000;
                if(jumlah>3){
                    diskon=0.12;
                }break;
            case 3:
                harga=60000;{
                }break;
            default:
         System.out.println("Pilihan tidk valid!");
                  return;
        }  
        int total=harga*jumlah;
        if(pilihan == 3 && jumlah > 1){
            total -=(jumlah - 1)*(harga*0.15);
        }else{
            total -= total*diskon;
        }
        System.out.println("Total bayar= "+total);
   
    }
    
}
