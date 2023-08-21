package d21_08_2023;

import java.util.Scanner;

public class Domaci_zadatak2 {
    public static void main(String[] args) {
//        2.	Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.

        Scanner s= new Scanner(System.in);
        System.out.println("Unesite N:" );
        int n= s.nextInt();

        int sum=0;

        for ( int i=1; i<=n; i++) {
            System.out.println("Unesite broj: ");
            int unetiBroj= s.nextInt();
            if (unetiBroj >=100 && unetiBroj < 1000) {
                sum= sum + unetiBroj;
            } // kraj grananja
        } //kraj petlje

        System.out.println("Sum " + sum);


    } // zatvaram main
}     // zatvaram klasu
