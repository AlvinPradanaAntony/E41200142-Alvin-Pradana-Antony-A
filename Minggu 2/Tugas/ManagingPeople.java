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
class person {

    String getName;
    int getAge;

    public person(String getName, int getAge) {
        this.getName = getName;
        this.getAge = getAge;
    }

    public String getName() {
        return getName;
    }

    public int getAge() {
        return getAge;
    }
}

public class ManagingPeople {

    public static void main(String[] args) {

        person p1 = new person("Arial ", 37);
        person p2 = new person("Joseph ", 15);

        if (p1.getAge() == p2.getAge()) 
        {
            System.out.println(p1.getName() + "is the same age as " + p2.getName());
        } else 
        {
            System.out.println(p1.getName() + "is NOT the same age as " + p2.getName());
        }
    }
}