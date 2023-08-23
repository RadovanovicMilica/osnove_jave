package d22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji proverava uparenost zagrada. Korisnik unosi matematicku formulu sve
//        dok ne unese znak =. Korisnik unosi svaki karakter jednacine posebno i na kraju programa se ispisuje
//        da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je: (2 * ( 1 + 3))=
//                Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)



        Scanner s= new Scanner(System.in);
        int otvoreneZagrade = 0;
        int zatvoreneZagrade = 0;
        boolean uneteZagrade = false;

        while (!uneteZagrade) {
            System.out.println("Unesite karakter:");
            String karakter = s.next();

            if (karakter.equals("(")) {
                otvoreneZagrade++;
            } else if (karakter.equals(")")) {
                zatvoreneZagrade++;
            } else if (karakter.equals("=")) {
                uneteZagrade = true;
            }

            if (otvoreneZagrade == zatvoreneZagrade) {
                System.out.println("jednako");
            } else {
                System.out.println("nisu jednake");
            }
        } // kraj while
    } // kraj main
} // kraj klase

