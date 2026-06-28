/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_27042026;

public class MainLingkaran {
    public static void main(String[] args) {

        // ==============================
        // Object Lingkaran
        // ==============================
        System.out.println("====== LINGKARAN ======");
        Lingkaran l = new Lingkaran(7);
        System.out.println(l.toString());
        System.out.println();

        // ==============================
        // Object Kerucut
        // ==============================
        System.out.println("====== KERUCUT ======");
        Kerucut kerucut = new Kerucut(5, 12);
        System.out.println(kerucut.toString());
        System.out.println();

        // ==============================
        // Object Silinder
        // ==============================
        System.out.println("====== SILINDER ======");
        Silinder silinder = new Silinder(4, 10);
        System.out.println(silinder.toString());
        System.out.println();

        // ==============================
        // Polimorfisme - array Lingkaran
        // ==============================
        System.out.println("====== POLIMORFISME ======");
        Lingkaran[] bentuk = {
            new Lingkaran(3),
            new Kerucut(3, 8),
            new Silinder(3, 8)
        };

        for (int i = 0; i < bentuk.length; i++) {
            System.out.println("--- Bentuk ke-" + (i + 1) + " ---");
            System.out.println(bentuk[i].toString());
            System.out.println();
        }
    }
}
