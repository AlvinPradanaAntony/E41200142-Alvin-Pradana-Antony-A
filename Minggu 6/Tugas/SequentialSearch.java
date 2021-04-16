/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu6;

/**
 *
 * @author Tony's PC
 */
public class SequentialSearch {
    public static void main(String[] args) {
                          // index  0, 1, 2, 3, 4, 5, 6, 7, 8
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        System.out.println("Data yang dicari : " + target);
        sequentialSearch(exampleVariableOne, target);
    }

    public static void sequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        // Mencari data yang dinginkan pada setiap index array sampai index terakhir
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                // jika data yang di cari ditemukan maka posisi index (i) pada tersebut
                // akan disimpan pada variabel index dan perulangan akan berhenti
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Data yang dicari tidak ditemukan pada array");
        } else {
            System.out.println("Data yang dicari ditemukan pada index " + index + " dari suatu array");
        }
    }
}
