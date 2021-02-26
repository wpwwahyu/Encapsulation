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
public class Enkapsulasi {
    public String nama;
    protected int umur;
    private String tanggallahir;

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }
    
    public Enkapsulasi(){
        nama = "Wahyu";
        umur = 19;
        tanggallahir = "27032000";
    }
    public Enkapsulasi(String nm, int um){
        nama = nm;
        umur = um;
    }
    public Enkapsulasi(String nm, int um, String tl){
        nama = nm;
        umur = um;
        tanggallahir = tl;
    }
    
    void Enkapsula(){
        Enkapsulasi eks = new Enkapsulasi();
        System.out.println("Nama            : "+eks.nama);
        System.out.println("Umur            : "+eks.umur);
        System.out.println("Tanggal Lahir   : "+eks.tanggallahir);
    }
}