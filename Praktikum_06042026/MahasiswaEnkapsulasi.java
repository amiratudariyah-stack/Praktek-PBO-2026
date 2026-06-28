/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Lenovo
 */
public class MahasiswaEnkapsulasi {
    private String  nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;
    
    public MahasiswaEnkapsulasi(){
        
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }   
    
   //getter
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public int getUmur(){
        return umur;
    }
    public double getIpk(){
        return ipk;
    }
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    
    //tampil info
    public void tampilkanInfo(){
        System.out.println("NAMA    = "+nama);
        System.out.println("NIM     = "+nim);
        System.out.println("JURUSAN = "+jurusan);
        System.out.println("UMUR    = "+umur);
        System.out.println("IPK     = "+ipk);
    }
    
    public String statusKelulusan(){
        if(ipk >= 2.75){
            return("LULUS!");
        }else{
            return ("TIDAK LULUS!");
            
        }
            
    }
 
}
