/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Lenovo
 */
public class MainMahasiswaEnkapsulasi {
    public static void main(String[] args) {
        MahasiswaEnkapsulasi m1 = new MahasiswaEnkapsulasi();
        m1.setNama("Andi");
        m1.setNim("221001");
        m1.setJurusan("Informatika");
        m1.setUmur(20);
        m1.setIpk(3.2);
     
      MahasiswaEnkapsulasi m2 = new MahasiswaEnkapsulasi("Citra", "221003", "Teknik Komputer", 22, 1.8);
      
      
      System.out.println("=====MAHASISWA 1 =====");
      m1.tampilkanInfo();
      System.out.println("Status = "+m1.statusKelulusan());
      System.out.println("=====MAHASISWA 2 =====");
      m2.tampilkanInfo();
      System.out.println("Status = "+m2.statusKelulusan());
    }
    
}
