/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class RelasiMahasiswaMain {//agregasi
  public static void main(String[]argv){
      Matakuliah mk1 = new Matakuliah("OOP",7);
      Matakuliah mk2 = new Matakuliah("Basis Data",6);
      Matakuliah mk3 = new Matakuliah("Bahasa Inggris",3);
   Matakuliah mkArr[]={mk1,mk2,mk3};
Mahasiswa mhs = new Mahasiswa ("Raisa",mkArr);
mhs.tampilData();
}
}
