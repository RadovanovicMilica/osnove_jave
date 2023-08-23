package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        4.	Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//                Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)

        Scanner s= new Scanner(System.in);
        boolean ponovljenBroj= false;
        int brojJedan=0;
        int brojDva=0;

        while (!ponovljenBroj) {
            System.out.println("Unesite broj:");
            int broj= s.nextInt();
            if(broj == 1) {
                brojJedan++;
            } else if(broj == 2) {
                brojDva++; }
            if (brojJedan > 2 || brojDva > 1){
                ponovljenBroj= true;
            }
        } // kraj while

        System.out.println("Kraj programa!");
    } //kraj main
} // kraj class
