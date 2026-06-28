/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_25052026;

/**
 *
 * @author Lenovo
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;

    public Keyboard(String nama, String jenis, boolean dayaTersambung) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama + "dimatikan");
    }

    @Override
    public void stem() {
        System.out.println("Keyboards "+nama+ "distem secara digital");
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+ " dinyalakan");
        }else{
            System.out.println(nama+ " tidak bisa dinyalakan");
        }
    }

    @Override
    public void matikan() {
        System.out.println(nama + "dimainkan dengan menekan tuts");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }

}
    
    
    

