/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu2;

/**
 *
 * @author Tony's PC
 */
import java.util.Scanner;
public class Latihan_D {

    /**
     * Belajar mengenai memberikan inputan dari keyboard 
       dengan menggunakan class scanner
     */
    public static void main(String[] args) {
        // Mendeklarasikan class scanner supaya suatu nilai yang terinput masuk kedalam variable tertentu
            Scanner scan = new Scanner(System.in);
            
        // Mengambil nilai dari inputan keyboard
            System.out.print("Masukkan nilai1 = ");
            int nilai_1 = scan.nextInt();
            System.out.print("Masukkan nilai2 = ");
            int nilai_2 = scan.nextInt();
            
        // Menjumlahkan dan menampilkan hasil output
            int jumlah = nilai_1 + nilai_2;
            System.out.println("Jumlah = " + jumlah);
            
    }
    
}
