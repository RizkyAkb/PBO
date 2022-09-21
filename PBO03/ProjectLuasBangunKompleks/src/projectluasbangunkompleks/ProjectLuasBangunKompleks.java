/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author CoolFace
 */
public class ProjectLuasBangunKompleks {
    public static void main(String[] args) {
       Persegi s = new Persegi();
       s.sisi = 42;
       
       Lingkaran r = new Lingkaran();
       r.jariJari = s.sisi / 2;
       
       double totalLuasP1 = s.hitungLuas() + r.hitungLuas();
       System.out.println("Luas bangun datar Project 1 adalah " + totalLuasP1);
        
       Lingkaran rBesar = new Lingkaran() ;
       rBesar.jariJari = 14;
       
       Lingkaran rKecil = new Lingkaran() ;
       rKecil.jariJari = rBesar.jariJari / 2;
       
       double totalLuasP2 = (rBesar.hitungLuas() / 2) - rKecil.hitungLuas();
        System.out.println("Luas bangun data Project 2 adalah " + totalLuasP2);
    }
    
}
