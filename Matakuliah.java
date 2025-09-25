/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class Matakuliah {
    public String namaMK;
    public int sks;
    public Matakuliah(){
    }
    public Matakuliah(String na,int sk){
        namaMK = na;
        sks = sk;
    }
    public void tampilData(){
        System.out.println("Nama MK = "+namaMK);
        System.out.println("SKS="+sks);
    }
}
