/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu3;

import java.util.Scanner;

/**
 *
 * @author Tony's PC
 */
public class Latihan_b1_ConditionalStatement {
    //Belajar Conditional Statement pada Array
    public static void main(String[] args) {
        //Pendeklarasian variabel dan scanner
        int nilai;
        String grade;
        Scanner input = new Scanner (System.in);
        
        //Mengambil input
        System.out.print("Inputkan Nilai\t: ");
        nilai = input.nextInt();
                
        //Kondisi menghitung grade
        if (nilai >= 90) {
            grade = "A";
        }
        else if (nilai >= 80) {
            grade = "B+";
        }
        else if (nilai >= 70) {
            grade = "B";
        }
        else if (nilai >= 60) {
            grade = "C+";
        }
        else if (nilai >= 50) {
            grade = "C";
        }
        else if (nilai >= 40) {
            grade = "D";
        }
        else {
            grade = "E";
        }
        
        //Cetak Hasilnya / Output
        System.out.println("Grade\t\t: " + grade);
    }
    
}
