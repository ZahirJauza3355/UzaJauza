/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class MainFotokopi {
    public static void main(String[] args) {
        // Membuat objek pertama: 100 lembar, berwarna, member
        Fotokopi f1 = new Fotokopi(100, true, true);
        
        // Membuat objek kedua: 50 lembar, tidak berwarna, bukan member
        Fotokopi f2 = new Fotokopi(50, false, false);

        // Tampilkan data masing-masing objek
        System.out.println("Data Fotokopi 1:");
        f1.tampilData();

        System.out.println("Data Fotokopi 2:");
        f2.tampilData();
    }
}