package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {

//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je
//        parnih brojeva uneto. brojeve unosi korisnik.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        ArrayList<Integer> number= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int brojElemenataUListi= s.nextInt();

        for (int i=0; i< brojElemenataUListi; i++) {
            System.out.println("Unesi broj: ");
            int broj = s.nextInt();
            number.add(broj);
        }

        int parniBrojevi = 0;
        for (int i = 0; i < brojElemenataUListi; i++) {
            if (number.get(i) % 2==0) {
                parniBrojevi++;
            }
        }
        System.out.println("uneto je  " + parniBrojevi + " parnih brojeva");
    } // kraj main
} // kraj class


