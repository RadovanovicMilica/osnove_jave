package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

//        /        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i
//        koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> broj= new ArrayList<>();

        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);
        broj.add (30);
        broj.add (35);
        broj.add (40);
        broj.add (45);
        broj.add (50);

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite poziciju K od 0 do 9");
        int k= s.nextInt();
        System.out.println("Unesite vrednost: ");
        int vrednost= s.nextInt();

        broj.set(k, vrednost);
        System.out.println( "Brojevi" + broj);

    }
}
