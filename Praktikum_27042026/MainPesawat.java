/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class MainPesawat {
    public static void main(String[] args) {
        System.out.println("======KENDARAAN======");
        Kendaraan k=new Kendaraan("Motor",2020);
        k.cetak();
        System.out.println();
        
        System.out.println("======UDARA=======");
        Udara u=new Udara("Helikopter",2018, true);
        u.cetak();
        System.out.println();
        
        System.out.println("=======PESAWAT=======");
        Pesawat p1=new Pesawat("Garuda",2021,true,100);
        p1.cetak();
        System.out.println();
        
        System.out.println("=======PESAWAT======");
        Pesawat p2=new Pesawat("Pelita Air",2022,true,70);
        p2.cetak();
        System.out.println();
        
        System.out.println("======POLIMORFISME======");
        Kendaraan[]arr = new Kendaraan[3];
        arr[1] = new Kendaraan("Mobil",2022);
        arr[2] = new Udara("Drone",2021,false);
        arr[3] = new Pesawat("Boeing 737",2010, true,160);
        
        for(int i= 0; i < arr.length; i++){
            System.out.println("--- Kendaraan ke-" + (i + 1) + " ---");
            arr[i].cetak();
            System.out.println();
         }
    }
    
}
