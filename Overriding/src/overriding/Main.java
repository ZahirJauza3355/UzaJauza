/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author jauza
 */
public class Main {
    public static void main(String[]argv){
        Lingkaran l = new Lingkaran(14);
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilData();
        System.out.println("-----------");
        SegitigaSamaKaki sg = new SegitigaSamaKaki(8,3);
        sg.hitungLuas();
        sg.hitungkeliling();
        sg.tampilData();
        System.out.println("-----------");
        SegiEmpat se = new SegiEmpat(5,8);
        se.hitungLuas();
        se.hitungkeliling();
        se.hitungDiagonal();
        se.tampilData();
        
    }
}
