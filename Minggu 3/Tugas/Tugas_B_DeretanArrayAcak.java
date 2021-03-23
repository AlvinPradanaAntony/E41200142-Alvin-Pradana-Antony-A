package tugas_minggu3;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Tony's PC
 */
public class Tugas_B_DeretanArrayAcak {

    public static void main(String[] args) {
        //Pendeklarasian dan inisialisasi dari objek scanner
        int JumlahDeretArray;
        Scanner input = new Scanner(System.in);

        //Membuat inputan untuk jumlah deretan atau panjang Array sesuai keinginan
        System.out.print("Maukkan Panjang Array Anda\t: ");
        JumlahDeretArray = input.nextInt();

        //Inisialisasi
        int[] array = new int[JumlahDeretArray];

        //Perulangan untuk mendapatkan suatu array sesuai dengan jumlah deret yang di tentukan
        for (int i = 0; i < JumlahDeretArray; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        
        //Output
        System.out.println("Hasil Array Acak\t\t: " + Arrays.toString(array));

    }
}
