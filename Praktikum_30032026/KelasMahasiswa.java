/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_30032026;

/**
 *
 * @author Aamee
 */
public class KelasMahasiswa {
    String nim;
    String nama;
    double tugas;
    double uts;
    double uas;
    
    KelasMahasiswa(){
        
    }
    
    KelasMahasiswa(String a,String b, double c, double d , double e){
        nim= a;
        nama = b;
        tugas = c;
        uts= d;
        uas = e;
                
    }
    public double hitungNilaiAkhir() {
        return (0.25 * tugas) + (0.35 * uts) + (0.40 * uas);
    }

    public void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Tugas : " + tugas);
        System.out.println("UTS   : " + uts);
        System.out.println("UAS   : " + uas);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        
    }
    
}
