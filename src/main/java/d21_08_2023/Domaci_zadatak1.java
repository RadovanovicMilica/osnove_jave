package d21_08_2023;

import java.util.Scanner;

public class Domaci_zadatak1 {
    public static void main(String[] args) {


//        1.	Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
//                Na kraju programa prikazati sumu
//
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite broj N: ");
        int n= s.nextInt();

        int rezultat= 0;

        for (int i=1; i<=n; i++) {
            System.out.println("Unesi broj");
            int unetiBroj= s.nextInt();
            if (unetiBroj%2==0) {
                rezultat= rezultat + unetiBroj;

            }
        }
        System.out.println("Broj " + rezultat);
    } //zatvaram main
} //zatvaram  klasu
