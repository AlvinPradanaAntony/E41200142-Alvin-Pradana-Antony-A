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
public class Latihan_b2_ConditionalStatement {

    public static void main(String[] args) {
        // Pendeklarasian Variabel dan Scanner
        String lampu;
        Scanner input = new Scanner(System.in);

        //Mengambil input
        System.out.print("Inputkan nama warna\t: ");
        lampu = input.nextLine();

        //Kondisi menggunakan SwitchCase dan Menghasilkan Output
        switch (lampu) {
            case "merah":
                System.out.println("Status\t\t\t: " 
                        + "Lampu merah, Berhenti !!");
                break;
            case "kuning":
                System.out.println("Status\t\t\t: " 
                        + "Lampu kuning, Harap Hati-Hati !!");
                break;
            case "hijau":
                System.out.println("Status\t\t\t: " 
                        + "Lampu hijau, Silakan jalan !!");
                break;
            default:
                System.out.println("Status\t\t\t: " 
                        + "Warna lampu salah !!");

        }
    }

}
