/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author jauza
 */
public class Lingkaran extends BangunDatar{
   
    public double jariJari;
    
    
    public void hitungLuas(){
        luas = 3.14*jariJari*jariJari;
    }
    public void hitungLuas(double jariJari){
        this.jariJari = jariJari;
        luas = 3.14*jariJari*jariJari;
    }
    public void hitungKeliling(){
        keliling = 2*3.14*jariJari;
    }
    public void hitungKeliling(double jariJari){
        this.jariJari = jariJari;
        keliling = 2*3.14*jariJari;
    }
    public void tampilData(){
        System.out.println("JARI-JARI = "+jariJari);
        super.tampilData();
    } 
}

