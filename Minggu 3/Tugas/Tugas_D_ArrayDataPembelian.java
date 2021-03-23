package tugas_minggu3;

import java.util.Scanner;

/**
 *
 * @author Tony's PC
 */
public class Tugas_D_ArrayDataPembelian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pendeklarasian variabel dan inisialisasi dari sebuah variabel
        int[] harga = new int[5];
        int total = 0;
        String nama;
        
        //Membuat text
        System.out.println("---------------------------------------------------");
        System.out.println("|\t   Kharisma Agung Plaza < KAP >           |");
        System.out.println("|\t     Promo Belanja Berhadiah              |");
        System.out.println("|\t Khusus Pembelian 5 Barang Pertama        |");
        System.out.println("|\t  Dengan harga minimum RP 100000,00       |");
        System.out.println("---------------------------------------------------");

        //Menggunakan objek scanner dari class scanner untuk menginputkan sesuatu
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli : ");
        nama = input.nextLine();
        System.out.println("");

        //Perulangan for
        for (int data = 0; data < harga.length; data++) {
            System.out.print("Masukan harga barang ke-" + (data + 1) + "\t: ");
            harga[data] = input.nextInt();
            total += harga[data];

        }
        System.out.println("Total harga pembelian atas nama " + nama + " adalah " + "RP " + total);

        //Suatu kondisi yang mana jika total harga belanja diatas minimum 100.000 akan mendapatkan hadiah promo
        //jika total harga belanja dibawah minimum 100.000 maka tidak dapat hadiah promo
        if (total >= 100000) {
            System.out.println("\nSelamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        } else {
            System.out.println("\nBelanja kembali untuk dapat promo khusus...");
            System.out.println("Maaf Anda belum bisa dapat hadiah");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("|\t           Terima Kasih                   |");
        System.out.println("|    Anda sudah belanja di Kharisma Agung Plaza   |");
        System.out.println("---------------------------------------------------");
    }
}
