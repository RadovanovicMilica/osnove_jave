package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz A duzine N i broj X. Nakon unosa treba ispisati
//        indekse onih clanova niza koji su jednaki broju X.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3

        ArrayList<Integer> nizA= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        System.out.println("Unesite X: ");
        int x= s.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Unesite broj: ");
            int unetiBroj = s.nextInt();
            nizA.add(unetiBroj);
        }
        for (int i=0; i< nizA.size(); i++) {
            int broj= nizA.get(i);
            if (broj == x) {
                System.out.println("Elemnet niza A koji je jednak broju x ima indeks: "  + i);
            }


        } // kraj fora


    } // kraj main

}
