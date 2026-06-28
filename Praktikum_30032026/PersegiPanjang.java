/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_30032026;

/**
 *
 * @author Aamee
 */
public class PersegiPanjang {
    int panjang; //atribut
    int lebar;//atribut
    
    //konstruktor
    public PersegiPanjang(){
        
    }
    
   public PersegiPanjang(int a, int b){
        panjang = a;
        lebar = b;
    }
   //GETTER
    
    //method
    int hitungLuas(){
       return (panjang*lebar);
    }
    int hitungKeliling(){
        return(2*(panjang*lebar));
    }
}
