/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum.pbo.projectbank;

/**
 *
 * @author YASYKUR MF
 */

///VERSI 1
public class BankBeraksi {

    public static void main(String[] args) {     
        
        Bank ABC = new Bank(100000);
        
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + ABC.getSaldo());
        System.out.println();
        System.out.println("Simpan uang   : Rp. " + ABC.simpanUang(500000));
        System.out.println("Saldo saat ini: Rp. " + ABC.getSaldo());
        System.out.println();
        System.out.println("Ambil uang    : Rp. " + ABC.ambilUang(150000));
        System.out.println("Saldo saat ini: Rp. " + ABC.getSaldo());
    }
}

/// VERSI 2
//public class BankBeraksi {
//
//    public static void main(String[] args) {
//        
//        Bank ABC = new Bank(100000);
//        
//        System.out.println("Selamat Datang di Bank ABC");
//        System.out.println("Saldo saat ini: Rp. " + ABC.getSaldo());
//        System.out.println();
//        
//        ABC.simpanUang(500000);
//        ABC.ambilUang(150000);
//    }
//}