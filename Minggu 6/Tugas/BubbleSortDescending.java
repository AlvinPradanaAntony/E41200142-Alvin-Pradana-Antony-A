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
public class BubbleSortDescending {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int perbandingan = 0;
        int iterasi = 0;

//        System.out.println("");
//        System.out.println("Proses Perbandingan dalam Bubble Sorting");
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n; j++) {
//                System.out.println("A : " + arr[j - 1] + " < B : " + arr[j]);
                if (arr[j - 1] < arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
//              perbandingan ++;
            }
//            iterasi ++;
        }
//        System.out.println("Total Perbandingan : " + perbandingan);
//        System.out.println("Total Iterasi : " + iterasi);
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr[] = {3, 60, 2, 45, 15};

        System.out.println("Array Before Buuble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        bubbleSort(arr); //sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
