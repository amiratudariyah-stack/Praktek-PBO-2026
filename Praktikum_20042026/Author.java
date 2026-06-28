/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum_20042026;

/**
 *
 * @author Lenovo
 */
public class Author {
    //private intance variabels
    private final String name;
    private String email;
    private final char gender; //'m' or 'f'
    
    //construktor a author intance with the given inputs
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    
    //setter
    public void setEmail(String email){
        this.email=email;
    }
    
    //returns a self-descriptive String
    public String toString(){
        return name + " (" + gender +") at" + email;
    }
    
            
    
}
