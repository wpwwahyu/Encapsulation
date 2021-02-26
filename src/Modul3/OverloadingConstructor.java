/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author ASUS
 */

public class OverloadingConstructor {
    public int a;
    public double b, d;
    public String c;
    public void OverloadingConstructor(){
        a = 12;
        b = 10.0;
        d = 43.4;
        c = "Hello World";
        System.out.println("=================");
        System.out.println("Pertama : "+a);
        System.out.println("Kedua : "+b);
        System.out.println("Ketiga : "+c);
        System.out.println("Keempat : "+d);
        
    }
    public void OverloadingConstructor(int a, double b){
        System.out.println("=================");
        System.out.println("Input Pertama   : "+a+" ; "+b);
        //a = AA;
        //b = AB;
    }
    
    public void OverloadingConstructor(String c, int a, double b){
        System.out.println("=================");
        System.out.println("Input Kedua     : "+c+" ; "+a+" ; "+b);
        //c = AC;
        //a = AA;
        //b = AB;
    }
    
    public void OverloadingConstructor(String c, double b, double d){
        System.out.println("=================");
        System.out.println("Input ketiga    : " +c+" ; "+b+" ; "+a);
        //c = AC;
        //b = AB;
        //d = AD;
    }
}