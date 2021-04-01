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
public class Tugas_B2_CaseKelipatan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menginisialisasi sebuah variabel atau melakukan assignmen (penugasan)
        int bilangan = 0;
        int total = 0;
        
        // Mencetak sebuah teks
        System.out.println("\tDo__While");
        System.out.println("Bilangan Keliapatan 2 (0-100)");
        System.out.println("=============================");
        
        // Melakukannperulangan menggunakan perulanga Do-While
        do {
            total = bilangan * 2; //-----> Menghitung kelipatan 2
            bilangan++;
            // Sebuah kondisi dimana menentukan batas bilangan yang tercetak
            if (total < 100) {
                System.out.print(total + " ");
            }
            if (total == 100) {
                System.out.print(total + " ");
            }
        } while (total <= 100);
        System.out.println("");
    }
}
