package p24_08_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i koji zamenjuje
//        vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//        Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//        Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.

        ArrayList<Integer> broj = new ArrayList<>();
        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);

       int last= broj.get (broj.size() - 1);
        int first= broj.get(0);
        broj.set(0,last);
        broj.set (broj.size()-1, first);

        System.out.println(broj);
    }
}
