/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

import Kegiatan3.Enkapsulasi1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //kelas Constructor
            OverloadingConstructor oc = new OverloadingConstructor();
            oc.OverloadingConstructor();
            oc.OverloadingConstructor(12, 47.89);
            oc.OverloadingConstructor("Haloo", 12, 32.12);
            oc.OverloadingConstructor("World", 12.45, 32.12);
        
        //class Hewan
            Hewan bio= new Hewan();
            bio.Hewan();
            bio.Hewan("Karnivora");
            bio.Hewan("Karnivora", "Herbivora");
            bio.Hewan("Karnivora", "Herbivora", "Omnivora");
            
        //class Ekapsulasi
            Enkapsulasi1 wah = new Enkapsulasi1();
            wah.Enkapsul();
            
            /*Enkapsulasi1 wa = new Enkapsulasi1();
            System.out.println("Nama            : "+wa.ciri1);
            System.out.println("Umur            : "+wa.getCiri2());
            System.out.println("Tanggallahir    : "+wa.getCiri3());*/
    }
}
