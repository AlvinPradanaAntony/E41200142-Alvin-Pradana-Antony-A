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
public class Latihan_a2_Array1D {

    //Belajar Array 1 Dimensi
    public static void main(String[] args) {
        //Pendeklarasisan Variabel Array
        int[] angka = {5, 10, 17, 20, 1};
        String[] teks = {"Saya", "sedang", "belajar", "OOP", "Java"};

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        for (int j = 0; j < teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }
    }
}
