/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

/**
 *
 * @author STEFFANO
 */
public class StudiKasusSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputUser segi = new InputUser();
        segi.input();
        segi.hitung();
        
        System.out.println("==========================");
        System.out.println("Nilai Alas : "+segi.nilaialas()+" Cm");
        System.out.println("Nilai Tinggi : "+segi.nilaitinggi()+" Cm");
        System.out.println("Maka Luasnya adalah : 1/2 * Alas * Tinggi = "+segi.nilailuas()+" Cm^2");
    }
    
}
