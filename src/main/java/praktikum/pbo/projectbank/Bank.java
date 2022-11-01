/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.pbo.projectbank;

/**
 *
 * @author YASYKUR MF
 */

///VERSI 1
public class Bank {
    
    //atribut
    private long saldo;
    
    //constructor
    public Bank(long saldo) {
        
        this.saldo = saldo;
    }
    
    //method Simpan Uang
    public long simpanUang(long debit) {
        
        saldo = saldo + debit;
//        saldo += debit;
        
        return debit;
    }
    
    //method Ambil Uang
    public long ambilUang(long kredit) {
        
        saldo = saldo - kredit;
//        saldo -= kredit;
        
        return kredit;
    }
    
    //accessor (getter)
    public long getSaldo() {
        
        return saldo;
    }
}

///VERSI 2
//public class Bank {
//    
//    private long saldo;
//    
//    public Bank(long saldo) {
//        
//        this.saldo = saldo;
//    }
//    
//    public void simpanUang(long debit) {
//        
//        saldo = saldo + debit;
//        
//        System.out.println("Simpan uang   : Rp. " + debit);
//        System.out.println("Saldo saat ini: Rp. " + getSaldo());
//        System.out.println();
//    }
//    
//    public void ambilUang(long kredit) {
//        
//        saldo = saldo - kredit;
//        
//        System.out.println("Ambil uang    : Rp. " + kredit);
//        System.out.println("Saldo saat ini: Rp. " + getSaldo());
//    }
//    
//    public long getSaldo() {
//        
//        return saldo;
//    }
//}