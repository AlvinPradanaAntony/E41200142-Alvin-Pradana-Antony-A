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
public class SelectionSort {

    static void SelectionSort(int[] arr) {
        System.out.println("");
        System.out.println("Proses Perbandingan dalam Selection Sort");
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            // Mencari data terkecil atau nilai minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; 
                }
            }
            // Melakukan pertukaran data pertama dengan data terkecil
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println("Iterasi " + (i + 1));
            cetakArray(arr);
//            System.out.println("Hasil pertukaran antara " + arr[min] + " dengan " + temp);
        }
        System.out.println("");
    }
    
        
    static void cetakArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {9, 14, 3, 43, 2};
        System.out.println("Sebelum Diurutkan dengan Selection Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        SelectionSort(arr);//sorting array using selection sort  

        System.out.println("Sesudah diurutkan dengan Selection Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}


