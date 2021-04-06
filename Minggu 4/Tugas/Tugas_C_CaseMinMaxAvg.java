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
public class Tugas_C_CaseMinMaxAvg {
    // Membuat program menampilkan minimimum, maximum, dan rata-rata
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi sebuah variabel
        Scanner input = new Scanner(System.in);
        int banyak_data;
        int jumlah = 0;
        
        // Membuat inputan data array
        System.out.print("Masukan banyaknya data nilai = ");
        banyak_data = input.nextInt();
        int[] data_nilai = new int[banyak_data];

        // Menggunakan perulangan For dan memberi inputan
        for (int i = 0; i < banyak_data; i++) {
            System.out.print("Masukan data nilai ke-" + (i + 1) + " = ");
            data_nilai[i] = input.nextInt();
            jumlah += data_nilai[i];
        }
        System.out.println("");
        
        // Menginisialisasi variabel minimum dan maximum
        int min = data_nilai[0];
        int max = data_nilai[0];
        for (int i = 0; i < banyak_data; i++) {
            // Membuat suatu kondisi dimana mecari data terkecil didalam array
            if (data_nilai[i] < min) {
                min = data_nilai[i];
            }
            // Membuat suatu kondisi dimana mecari data terbesar didalam array
            if (data_nilai[i] > max) {
                max = data_nilai[i];
            }
        }
        // Output
        System.out.println("Nilai minimum = " + min);
        System.out.println("Nilai maximum = " + max);
        System.out.println("NIlai rata-rata adalah = " + jumlah / banyak_data);
    }
}
