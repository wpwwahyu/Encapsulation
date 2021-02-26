package Modul3;

public class Hewan {
    public String hewan1,hewan3;
    protected String hewan2;
    
    public void Hewan(){
        hewan1 = "Karnivora";
        hewan2 = "Herbivora";
        hewan3 = "Omnivora";
        System.out.println("=================");
        System.out.println("Jenis1   : "+hewan1);
        System.out.println("Jenis2    : "+hewan2);
        System.out.println("jenis3    : "+hewan3);
    }
    public void Hewan(String hewan1){
        System.out.println("=================");
        System.out.println("Jenis   : "+hewan1);
    }
    public void Hewan(String hewan1, String hewan2){
        System.out.println("=================");
        System.out.println("jenis1   : "+hewan1);
        System.out.println("jenis2    : "+hewan2);
    }
    public void Hewan(String hewan1, String hewan2, String hewan3){
        System.out.println("=================");
        System.out.println("jenis1   : "+hewan1);
        System.out.println("jenis2    : "+hewan2);
        System.out.println("jenis3    : "+hewan3);
    }      
}