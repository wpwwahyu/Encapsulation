/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kegiatan3;

import Modul3.Hewan;


/**
 *
 * @author ASUS
 */
public class Enkapsulasi1 extends Hewan{
    public String ciri1;
    private String ciri2;
    protected String ciri3;

    public String getCiri3() {
        return ciri3;
    }

    public void setCiri3(String ciri3) {
        this.ciri3 = ciri3;
    }

    public String getCiri2() {
        return ciri2;
    }

    public void setCiri2(String ciri2) {
        this.ciri2 = ciri2;
    }
    
    public Enkapsulasi1(){
        ciri1 = "Makan Daging";
        ciri2 = "Berbulu";
        ciri3 = "Bertaring";
    }
    public void Enkapsulasi1(String c1){
        ciri1 = c1;
    }
    public void Enkapsulasi(String c1, String c2){
        System.out.println("=================");
        ciri1 = c1;
        ciri2 = c2;
    }
    public void Enkpasulasi1(String c1, String c2, String c3){
        System.out.println("=================");
        ciri1 = c1;
        ciri2 = c2;
        ciri3 = c3;
    }
    
    public void Enkapsul(){
        Enkapsulasi1 www = new Enkapsulasi1();
        System.out.println("Ciri Pertama  : "+www.ciri1);
        System.out.println("Ciri Kedua    : "+www.ciri2);
        System.out.println("Ciri Ketiga   : "+www.ciri3);
        
        super.Hewan("Karnivora");
    }
}
