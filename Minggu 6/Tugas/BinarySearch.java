/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu6;
import java.util.Scanner;
/**
 *
 * @author Tony's PC
 */
public class BinarySearch {
    static void BinarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        
        while (last >= first) {
            System.out.println("Posisi pencarian nilai tengah/mid : index " + mid + " dengan nilai " + arr[mid]);
            if (arr[mid] > key) {
                last = mid - 1;
            } else if (arr[mid] == key) {
                System.out.println("");
                System.out.println("Elemen data ditemukan pada index ke : " + mid);
                break;
            } else {
                first = mid + 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Elemen data tidak ditemukan!");
        }
    }

    static void sorting(int[] arr) {
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("");
    }

    static void cetakArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;
        int[] arr = {9, 14, 3, 43, 2};

        // Menampilkan data yang ada dalam array
        System.out.print("Data pada array : ");
        cetakArray(arr);

        // Proses sorting dan menampilkan data yang sudah di sorting
        System.out.print("Data di sorting : ");
        sorting(arr);
        cetakArray(arr);
        
        // Input data yang ingin dicari
        System.out.print("Data yang dicari : ");
        key = input.nextInt();
        
        // Menampilkan hasil dari pencarian data dengan binary search 
        System.out.println("");
        BinarySearch(arr, key); 
    }
}
