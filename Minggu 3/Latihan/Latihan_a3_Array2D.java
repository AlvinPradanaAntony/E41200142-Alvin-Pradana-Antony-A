/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu3;

/**
 *
 * @author Tony's PC
 */
public class Latihan_a3_Array2D {

    //Belajar Array 2 Dimensi
    public static void main(String[] args) {
        //Pendeklarasian Variabel Array
        int[][] angka = {{5, 3, 2, 1, 5}, {9, 6, 5, 7, 8}, {5, 2, 1, 5, 10}};
        for (int baris = 0; baris < 3; baris++){
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(angka[baris][kolom] + "  ");
            }
        System.out.println("  ");
        }
    }
}
