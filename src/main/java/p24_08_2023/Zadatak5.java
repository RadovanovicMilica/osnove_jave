package p24_08_2023;

import java.util.ArrayList;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji u sebi ima definisan niz od 5 broja (brojevi su proizvoljni) i
//        racuna i stampa sumu svih brojeva niza.
//        Primer: Ako je niz 1,2,4,5,7
//        Stampa se, suma = 19

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);

        int suma= 0;

        for (int i=0; i < broj.size(); i++) {
           suma= suma+ broj.get(i);



        } //kraj petlje

        System.out.println("Suma" + suma);

    }
}
