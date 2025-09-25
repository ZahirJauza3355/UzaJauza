/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
// File: Sepeda.java
public class Sepeda {
    public String kode;
    protected String merek;
    String jenis;
    private float kecepatan;
    private int gigi;

    public void start() {
        gigi = 1;
        kecepatan = 0;
    }

    private void tambahGigi() {
        gigi++;
    }

    private void kurangiGigi() {
        gigi--;
    }

    public void tambahKecepatan(float v) {
        kecepatan += v;
        if (v > 10) {
            tambahGigi();
        }
    }

    public void kurangiKecepatan(float v) {
        kecepatan -= v;
        if (v > 5.5) {
            kurangiGigi();
        }
    }

    public void stop() {
        kecepatan = 0;
        gigi = 0;
    }

    public void tampilData() {
        System.out.println("KODE       = " + kode);
        System.out.println("MEREK      = " + merek);
        System.out.println("JENIS      = " + jenis);
        System.out.println("KECEPATAN  = " + kecepatan);
        System.out.println("GIGI       = " + gigi);
   
    }
}