/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author STEFFANO
 */
public class InputUser {
    Double alas, tinggi, Luas;
    
    void input (){
        Scanner segitiga = new Scanner (System.in);
        System.out.println("================PENGHITUNG LUAS SEGITIGA================");
        System. out.print("Masukkan Nilai Alas : ");
        alas = segitiga.nextDouble();
        System. out.print("Masukkan Nilai Tinggi : ");
        tinggi = segitiga.nextDouble();
    }
    
    void hitung(){
        Luas =alas * tinggi / 2;
    }
    Double nilaialas(){
        return alas;
    }
    Double nilaitinggi(){
        return tinggi;
    }
    
    Double nilailuas(){
        return Luas;
    }
}

