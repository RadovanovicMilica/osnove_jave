package p18_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati porogram koji od korisnika ucitava dva broja M i N i stampa sve brojeve izmedju M i N.
//        Smatrajte da je M manje od N.
//                Primer izvrsenja:
//        Unesite M: 10
//        Unesite N: 15
//        10, 11, 12, 13, 14, 15,
//                Print da vam bude u jednom redu i sa zarezima!
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite M");
        int m= s.nextInt();
        System.out.println("Unesite N");
        int n= s.nextInt();

        int i=m;
        int i1=n;
        for (i=m; i<n; i++) {
            System.out.print(i + ",");



    }
} }