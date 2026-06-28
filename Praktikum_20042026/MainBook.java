/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum_20042026;

/**
 *
 * @author Lenovo
 */
public class MainBook {
    public static void main(String[] args) {
        //we nee an author instance to create a book instance
        Author Rin = new Author("Rinaldi Munir","rinaldi@gmail.com",'m');
        System.out.println(Rin);//Author' to String
        //Rinaldi Munis (m) at rinaldi@gmail.com
        
        //test book's construtor and toString
        Book dummyBook = new Book("algoritma dan pemograman",Rin,98000,99);
        System.out.println(dummyBook);//books to String()
        //'Algoritma dan Pemograman' by Rinaldi Munir (m) at rinaldi@gmail.com
        
        //test Setters and Getters
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        //name is: Algoritma dan Pemograman
        System.out.println("Price is: " + dummyBook.getPrice());
        //price is: 120000
        System.out.println("qty is: "+ dummyBook.getQty());
        System.out.println("author is: " +dummyBook.getAuthor());
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
        
        //Using an anonymous Author instance to create a book intance
        Book moreDummyBook = new Book ("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'),19.99,8);
        System.out.println(moreDummyBook);//Book's toString
              
    }
    
}
