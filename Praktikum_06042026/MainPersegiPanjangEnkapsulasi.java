/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Aamee
 */
public class MainPersegiPanjangEnkapsulasi {

    public static void main(String[] args) {
        // objek 1 (pakai konstruktor default)
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar(5);

        // objek 2 (pakai konstruktor parameter)
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(8, 4);

        // output objek 1
        System.out.println("Objek 1=");
        System.out.println("Panjang= " + pp1.getPanjang());
        System.out.println("Lebar= " + pp1.getLebar());
        System.out.println("Luas= " + pp1.getLuas());
        System.out.println("Keliling= " + pp1.getKeliling());

        System.out.println();

        // output objek 2
        System.out.println("Objek 2=");
        System.out.println("Panjang= " + pp2.getPanjang());
        System.out.println("Lebar= " + pp2.getLebar());
        System.out.println("Luas= " + pp2.getLuas());
        System.out.println("Keliling= " + pp2.getKeliling());

        System.out.println();

        // jumlah objek
        System.out.println("Jumlah objek= " + PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
    
}
