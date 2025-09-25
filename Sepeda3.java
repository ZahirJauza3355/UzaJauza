/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class Sepeda3 {
    public String kode;
    protected String merek;
    String jenis;
    private float kecepatan;
    private int gigi;

    // Atribut class
    public static int jumTotalSepeda;

    // Konstruktor default
    public Sepeda3() {
        System.out.println("Objek terbentuk menggunakan konstruktor default");
        kode = merek = jenis = "KOSONG";
        kecepatan = gigi = 0;
    }

    // Konstruktor dengan parameter
    public Sepeda3(int g) {
        gigi = g;
    }

    public Sepeda3(int g, float k) {
        gigi = g;
        kecepatan = k;
    }

    public void tambahKecepatan(float nilai) {
        kecepatan += nilai;
    }

    public void kurangiKecepatan(float nilai) {
        kecepatan -= nilai;
    }

    public void tampilData() {
        System.out.println("KODE = " + kode);
        System.out.println("MEREK = " + merek);
        System.out.println("JENIS = " + jenis);
        System.out.println("KECEPATAN = " + kecepatan);
        System.out.println("GIGI = " + gigi);
    }

    // Method class
    public static void tambahJumTotalSepeda() {
        jumTotalSepeda++;
    }

    // Main method
    public static void main(String[] args) {
        Sepeda3 s1 = new Sepeda3();
        Sepeda3.tambahJumTotalSepeda();

        s1.kode = "S001";
        s1.merek = "Polygon";
        s1.jenis = "XC";
        s1.kecepatan = 0;
        s1.gigi = 0;

        s1.tambahKecepatan(15);
        s1.kurangiKecepatan(3);
        s1.tampilData();

        Sepeda3 s2 = new Sepeda3(2);
        Sepeda3.tambahJumTotalSepeda();
        s2.tampilData();

        Sepeda3 s3 = new Sepeda3(4, 25);
        Sepeda3.tambahJumTotalSepeda();
        s3.tampilData();

        System.out.println("Jumlah total objek sepeda yang dibuat = " + Sepeda3.jumTotalSepeda);
    }
}
