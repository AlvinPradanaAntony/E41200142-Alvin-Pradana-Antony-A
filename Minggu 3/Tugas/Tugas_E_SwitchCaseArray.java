package tugas_minggu3;

import java.util.Scanner;

/**
 *
 * @author Tony's PC
 */
public class Tugas_E_SwitchCaseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pendeklarasian Variabel dan Scanner
        String nama;
        int menu;
        Scanner input = new Scanner(System.in);

        //Membuat text 
        System.out.println("===============================================");
        System.out.println("\t\t CAFE CERIA");
        System.out.println("\t\tANEKA MINUMAN");
        System.out.println("===============================================");
        System.out.println("\t\tSPECIAL MENU : ");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nestcafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        System.out.println("===============================================");

        System.out.print("Masukan nama pembeli : ");
        nama = input.nextLine();

        System.out.print("\nSilakan masukkan pilihan Anda: ");
        menu = input.nextInt();

        //Membuat sebuah kondisi menggunakan switch case
        switch (menu) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah " + "Soft Drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah " + "Mix Juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah " + "Nestcafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah " + "Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah " + "Tea");
                break;
            default:
                System.out.println("Minuman yang anda pesan adalah " + "Tidak ada menu");
        }
        System.out.println("Pesanan akan segera kami antar\n" + "Terima Kasih "
                + nama + " telah berkunjung di CAFE CERIA");

    }
}
