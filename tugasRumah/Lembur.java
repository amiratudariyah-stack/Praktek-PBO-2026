/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 7
 */
package tugas.dirumah;

import java.util.Scanner;
public class Lembur {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Jam lembur= ");
        int jam= input.nextInt();
        
        if(jam >50) jam = 50;
        
        int upah;
        if(jam <= 20){
            upah = jam * 2000;
        }else{
            upah = jam * 3000;
        }
        System.out.println("Total upah= "+ upah);
      
    }
    
}
