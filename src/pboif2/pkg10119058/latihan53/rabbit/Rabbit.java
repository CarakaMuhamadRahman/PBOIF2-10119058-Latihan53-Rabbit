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
public class Rabbit extends Animal {
    private String color;
    private String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg,food,legs);
        this.name = name;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
}
