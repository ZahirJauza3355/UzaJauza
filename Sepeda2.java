/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Dell 5300
 */
public class Sepeda2 {
    public String kode;
    protected String merek;
    String jenis;
    private float kecepatan;
    private int gigi;
  public Sepeda2(){
    System.out.println("objek terbentuk menggunakan konstruktor default");
      kode= merek = jenis = "kosong";
      kecepatan = gigi = 0;
  }
       public Sepeda2(int g){
    System.out.println("objek terbentuk menggunakan konstruktor berparameter 1");
      kode= merek = jenis = "kosong";
      kecepatan = gigi = 0;
       }
      public Sepeda2(int g,float v){
    System.out.println("objek terbentuk menggunakan konstruktor berparameter 1");
      kode= merek = jenis = "kosong";
      kecepatan = v; gigi = 0;
      }
      public void start(){
          gigi = 1; kecepatan = 0 ;
          }
      private void kurangiGigi(){
      }   
    public void tampilData() {
        System.out.println("KODE       = " + kode);
        System.out.println("MEREK      = " + merek);
        System.out.println("JENIS      = " + jenis);
        System.out.println("KECEPATAN  = " + kecepatan);
        System.out.println("GIGI       = " + gigi);
      
    }
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda();
        s1.kode = "S001";
        s1.merek = "Polygon";
        s1.jenis = "XC";

        s1.start();                    // Mulai sepeda: gigi = 1, kecepatan = 0
        s1.tambahKecepatan(15);       // Tambah kecepatan 15 (akan nambah gigi)
        s1.kurangiKecepatan(3);       // Kurangi kecepatan 3 (tidak kurangi gigi)
        s1.tampilData();              // Tampilkan data sepeda
  Sepeda2 s2 = new Sepeda2 (2);
  s2.tampilData(); 
  Sepeda2 s3 = new Sepeda2 (4,25);
   s3.tampilData(); 
    
  
    }
}

