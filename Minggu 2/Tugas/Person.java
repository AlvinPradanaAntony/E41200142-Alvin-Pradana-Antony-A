/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_minggu2;

/**
 *
 * @author Tony's PC
 */
public class Person {

    String fName, lName, stuStatus;
    int stuId;
    public Person(String fName, String lName, int stuId, String stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Lisa", "Palambo", 123456789, "Active");

        System.out.println("Student Name\t: " + person1.fName + " " + person1.lName);
        System.out.println("Student ID\t: " + person1.stuId);
        System.out.println("Student Status\t: " + person1.stuStatus);

    }
}
