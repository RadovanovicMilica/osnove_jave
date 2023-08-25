package p24_08_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg
//        elementa tog niza.

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);


        int x1 = broj.get(0);
        int x2 = broj.get(1);
        int x3 = broj.get(2);
        int x4 = broj.get(3);
        int x5 = broj.get(4);

        int suma = broj.get(0) + broj.get(4);
        System.out.println("Suma" + suma);








    }
}
