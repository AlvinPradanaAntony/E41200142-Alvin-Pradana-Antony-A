/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orang;

/**
 *
 * @author Tony's PC
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;

    public Orang(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;

    }

    public String toString() {
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: " + berat);
    }
}
