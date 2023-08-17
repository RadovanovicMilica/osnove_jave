package p17_08_2023;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {
//        Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan. Potez je ispravan ukoliko se
//        karta na stolu i odigrana karta poklapaju po znaku ili broju.
//        Znakovi karata: srce, kocka, list, detelina
//        Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi znak karte koja je na stolu");
        String znakNaStolu= s.next();
        System.out.println("Unesi broj karte koja je na stolu ");
        String brojNaStolu= s.next();
        System.out.println("Unesi znak kate koju zelis da bacis");
        String znakZaBacanje= s.next();
        System.out.println("Unesi broj karte koju zelis da bacis");
        String brojZaBacanje= s.next();

        if (znakNaStolu.equals(znakZaBacanje) || brojNaStolu.equals(brojZaBacanje)  ) {
            System.out.println("Potez je ispravan"); }
            else{
                System.out.println("Potez nije ispravan");
            }




    }
}
