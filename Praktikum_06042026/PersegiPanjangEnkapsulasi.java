/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_06042026;

/**
 *
 * @author Aamee
 */
public class PersegiPanjangEnkapsulasi{
    private int panjang;
    private int lebar;
    private static int jumlahObjek=0;
    
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
        
    }
    public PersegiPanjangEnkapsulasi(int panjang, int lebar){
        this.panjang= panjang;
        this.lebar=lebar;
        jumlahObjek++;
    }
    public void setPanjang(int panjangBaru){
        panjang=panjangBaru;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setLebar(int lebarBaru){
        lebar=lebarBaru;
    }
    public int getLebar(){
        return lebar;
    }
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    public int getLuas(){
        return panjang*lebar;
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
