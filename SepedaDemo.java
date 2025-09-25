/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class SepedaDemo {
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda();
        s1.kode = "S001";
        s1.merek = "Polygon";
        s1.jenis = "XC";

        s1.start();                    // Mulai sepeda: gigi = 1, kecepatan = 0
        s1.tambahKecepatan(15);       // Tambah kecepatan 15 (akan nambah gigi)
        s1.kurangiKecepatan(3);       // Kurangi kecepatan 3 (tidak kurangi gigi)
        s1.tampilData();              // Tampilkan data sepeda
    }
}