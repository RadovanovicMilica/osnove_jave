package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak7_vezbanje {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se
//        prva 3 elementa niza a kopiraju u niz b,
//                a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1

        ArrayList<Integer> nizA= new ArrayList<>();

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n= s.nextInt();





        for (int i=0; i<n; i++){
            System.out.println("Unesite broj");
            int unetiBroj= s.nextInt();
nizA.add(unetiBroj);
        }


        
        ArrayList<Integer> noviNiz= new ArrayList<>();
        for (int i=0; i<n; i++) {
            if (i < 3) {
                noviNiz.add(nizA.get(i));
            } else {
                noviNiz.add(1);
            }
        }  System.out.println("Niz A: " + nizA);
            System.out.println("Niz B: " + noviNiz);


    } // kraj main
}
