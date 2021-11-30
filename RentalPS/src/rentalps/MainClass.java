/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.util.Scanner;

/**
 *
 * @author Maulia
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        System.out.println("----- SELAMAT DATANG, SILAHKAN MENGISI SESUAI FORMAT YANG DIMINTA-! -----");
        
        member mem = new member();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        mem.member = input.nextLine();
        
        
        int n = mem.indexmember();
        if(n < 0){
            System.out.println("");
            System.out.println("ID member tidak ditemukan");
            System.exit(0);
        }
        
        
        tanggal tgl = new tanggal();
        tgl.inputtanggal();

        System.out.println("\n\n----- HASIL OUTPUT -----");
        System.out.println("");

        
        int x = mem.jenismember();
        switch (x){
            case 1:
                silver sil = new silver();
                sil.disc = 1;
                sil.sewa = 25000;
                sil.poin = 1;
                sil.banyakhari = tgl.banyakhari();
                
 
                System.out.println("");
                tgl.outputtanggal();
                System.out.println("");
                
               
                System.out.println("Total Sewa	: " + sil.totalsewa());
                System.out.println("Jumlah Poin	: " + sil.poin());
                break;
                
            case 2:
                gold go = new gold();
                go.disc = 2;
                go.sewa = 30000;
                go.poin = 5;
                go.cashback = 5000;
                go.banyakhari = tgl.banyakhari();
                System.out.println(go.sewa);
                
              
                System.out.println("");
                tgl.outputtanggal();
                System.out.println("");
                
             
                System.out.println("Total Sewa	: " + go.totalsewa());
                System.out.println("Jumlah Poin	: " + go.poin());
                System.out.println("Jumlah Cashback : " + go.cashback());
                break;
                
            case 3:
                platinum pl = new platinum();
                pl.disc = 3;
                pl.sewa = 45000;
                pl.poin = 10;
                pl.cashback = 10000;
                pl.pulsa = 5000;
                pl.banyakhari = tgl.banyakhari();
                
             
                System.out.println("");
                tgl.outputtanggal();
                System.out.println("");
                
         
                System.out.println("Total Sewa	: " + pl.totalsewa());
                System.out.println("Jumlah Poin	: " + pl.poin());
                System.out.println("Jumlah Cashback : " + pl.cashback());
                System.out.println("Bonus Pulsa     : " + pl.pulsa());
                break; 
        }
    }
}
