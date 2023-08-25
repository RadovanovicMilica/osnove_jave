package p24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> broj = new ArrayList<>();
//        Napisati program koji u sebi ima definisan niz od
//        5 broja (brojevi su proizvoljni) i koji prikazuje
//        element na poziciji K. K unosi korisnik i smatrajte
//        da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite K: ");
        int k= s.nextInt();

        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);
        System.out.println("Unesite poyiciju od 0 do 4: ");
        int poyicija= s.nextInt();

        if (poyicija < 0 && poyicija < broj.size()) {
           int vrednost= broj.get (poyicija);
            System.out.println("Na poziciji " + poyicija + " je vrednost " + vrednost);
        }



    }
}
