/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor_Super;

/**
 *
 * @author Tony's PC
 */
public class B extends A {
    B(){ // super(); Tambahan kode secara otomatis oleh Java untuk memanggil
         //          Konstruktor dari SuperClassnya
        super("test"); 
        System.out.println("Konstruktor class B dieksekusi ...");
    }
}