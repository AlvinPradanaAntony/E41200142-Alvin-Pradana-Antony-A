/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

import java.util.Scanner;

/**
 *
 * @author Tony's PC
 */
public class Tugas_A_CaseLoopFor {
    // Menampilkan bilangan genap dari kecil ke besar dengan menginputkan nilai awaln dan nilai akhirw
    // Menggunakan perulangan For
    public static void main(String[] args) {
        // Mendeklarasikan variabel
        int batas_awal;
        int batas_akhir;
        
        // Membuat inputan dengan Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Batas Awal\t: ");
        batas_awal = input.nextInt();
        System.out.print("Masukan Batas Akhir\t: ");
        batas_akhir = input.nextByte();
        System.out.println("=================================");
        System.out.print("Hasil Bilangan Genap : ");
        
        // Melakukan perulangan menggunakan perulangan For
        for (int i = batas_awal; i <= batas_akhir; i++) {
            // Mmebuat kondisi dimana terdapat operasi aritmatika yaitu 
            // modulus 2 yang tidak menghasilkan sisa pembagian atau 0 
            if (i % 2 == 0) {
                //Mencetak hasil output yaitu hasil bilangan genap 
                System.out.print(i);
                // Membuat kondisi dimana tanda koma akan berakhir sebelum berada di index terakhir
                if (i < (batas_akhir - 1)) {
                    System.out.print(",");
                }
            }
        }
        System.out.println("");
    }
}
