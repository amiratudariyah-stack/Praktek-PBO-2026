/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 6
 */
package tugas.dirumah;

import java.util.Scanner;
public class UltahPnp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Umur PNP= ");
        int umur= input.nextInt();
        if(umur % 10 == 0){
            System.out.println("Dekade ke "+(umur/10));
        }else{
            System.out.println("Dies Natalis ke "+umur);
        }
  
    }
    
}
