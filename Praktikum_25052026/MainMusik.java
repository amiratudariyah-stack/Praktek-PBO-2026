/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_25052026;

public class MainMusik {
    public static void main(String[] args) {
        //membuat objek statis
        Gitar gitar= new Gitar("klasik","petik",6);
        Keyboard keyboard = new Keyboard("Yamaha","Elektronik",true);
        
        System .out.println("\n Akat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("\n---Info Alat Musik Keyboard---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
    
}
