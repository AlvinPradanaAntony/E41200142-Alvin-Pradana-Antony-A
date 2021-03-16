/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_minggu2;
/**
 *
 * @author Tony's PC
 * Belajar mengenai class, object, dan method
 */
class buku {
    String judul;
    int harga;
    int halaman;   
    public void InfoBuku(String judul, int harga, int halaman) {  
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;       
    }
    public void outputInfoBuku() {
        
        System.out.println("Informasi Buku");
        System.out.println("Judul Buku = " + judul);
        System.out.println("Harga buku : " + harga);
        System.out.println("Jumlah halaman : " + halaman);     
    }   
}
public class Latihan_C {
    public static void main(String[] args) {
        
        buku buku_java = new buku();
        buku_java.InfoBuku("buku java", 60000, 120);
        buku_java.outputInfoBuku();        
    }
}
