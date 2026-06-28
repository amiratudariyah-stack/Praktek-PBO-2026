/*
Pembuat : Amiratu Dariyah
Tanggal : 26 Maret 2026
tugas no 8
 */
package tugas.dirumah;

import java.util.Scanner;
public class Xo {
    public static void main(String[] args) {
        int n=5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1) {
                    System.out.print("0 ");
                } else {
                    if (i == j) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("x ");
                    }
                }

            }
            System.out.println();
        }

    }
}
