/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan profile Peter
 *                     si kelinci.
 */
public class PBOIF210119058Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
       
       System.out.println("Hello, His name is " + rabbit.getName());
       System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
       System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
       System.out.println(rabbit.getName() + " has " + rabbit.getNoLegs() + " legs. ");
       System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}
