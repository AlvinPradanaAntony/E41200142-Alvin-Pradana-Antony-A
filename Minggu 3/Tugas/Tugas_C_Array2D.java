package tugas_minggu3;
/**
 *
 * @author Tony's PC
 */
public class Tugas_C_Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] angka = {{5, 6, 1, 6}, {8, 1, 2, 9}, {5, 4, 7, 1}, {8, 3, 7, 5}};
        for (int kolom = 0; kolom < 4; kolom++) {
            for (int baris = 0; baris < 4; baris++) {
                System.out.print(angka[kolom][baris] + "  ");
            }
            System.out.println("");
        }
    }

} 
