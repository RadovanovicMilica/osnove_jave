package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {

//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su
//        veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//
//        Brojevi veci od nule u nizu A su: 1, 3, 9,


        ArrayList<Integer> nizA= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n= s.nextInt();

         for (int i=0; i <n; i++) {
             System.out.println("Unesite broj: ");
             int unetiBroj = s.nextInt();
             nizA.add(unetiBroj);

             } // kraj petlje
String rezultat="";
        for (int i=0; i<n; i++) {
            if (nizA.get(i) > 0) {
                rezultat= rezultat + nizA.get(i) + "," ;
            }
        }
        System.out.println("Brojevi veci od nule u nizu A su: " + rezultat );

    }
}
