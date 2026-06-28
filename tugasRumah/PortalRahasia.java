/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 5
 */
package tugas.dirumah;

import java.util.Scanner;
public class PortalRahasia {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Awal: ");
        int a= input.nextInt();
        System.out.print("Akhir: ");
        int b= input.nextInt();
        
        for(int i=a; i<=b; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i+" ");
            }
        }
            
    }
    
}
