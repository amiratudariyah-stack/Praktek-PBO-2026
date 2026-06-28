/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 9
 */
package tugas.dirumah;

import java.util.Scanner;
public class BasKom {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukkan angka = ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

    }
}