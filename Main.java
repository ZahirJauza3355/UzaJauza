/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class Main {
    public static void main(String []argv){
Processor p = new Processor("intel P4",3,1.8);
Laptop I = new Laptop ("Toshiba",p);
I.tampilData();

//contoh lain membuat objek
Laptop I1 = new Laptop ("HP",new Processor("AMD Turion",2.2,1.6));
I1.tampilData();
    }
}
