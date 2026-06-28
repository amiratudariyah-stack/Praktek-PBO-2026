/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_27042026;

/**
 *
 * @author Lenovo
 */
public class Kucing  extends Hewan{
    public Kucing(String nama){
        super(nama); //mengakses propety super class
    }
    
    @Override
    public void bersuara(){
        super.bersuara();//mengakses method super class
        System.out.println(nama+"berkata Meong");
    }
    
}
