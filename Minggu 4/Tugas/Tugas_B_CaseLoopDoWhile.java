/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu4;

/**
 *
 * @author Tony's PC
 */
public class Tugas_B_CaseLoopDoWhile {
    // Menampilkan bilangan kelipatan 2 antara 0 - 100
    public static void main(String[] args) {
        // Menginisialisasi sebuah variabel atau melakukan assignmen (penugasan)
        int bilangan = 1;
        
        // Mencetak sebuah teks
        System.out.println("\tDo__While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("=============================");
        
        // Melakukannperulangan menggunakan perulanga Do-While
        do {
            //Memberi pernytaan atau statement dan mencetak hasil output
            System.out.print(bilangan + " ");
            bilangan *= 2;
        } while (bilangan <= 100);
        System.out.println("");
    }
}
