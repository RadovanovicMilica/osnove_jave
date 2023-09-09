package d08_09_2023;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

        FaceBookPost prvaObjava = new FaceBookPost();
        prvaObjava.imeIPrezimeObjavljivaca = "Radovanovic Micke";
        prvaObjava.prezimeIImeKorisnikaProfila = "Ivana Vujovic";
        prvaObjava.textObjave = "Welcome to Facebook! :)";
        prvaObjava.brojLajkova = 0;
        prvaObjava.brojDeljenja= 0;


        FaceBookPost drugaObjava= new FaceBookPost();
        drugaObjava.imeIPrezimeObjavljivaca = "Vujovic Ivana";
        drugaObjava.prezimeIImeKorisnikaProfila = "Micke Radovanovic";
        drugaObjava.textObjave = "Pozdrav sa vrha Durmitora!";
        drugaObjava.brojLajkova = 0;
        drugaObjava.brojDeljenja= 0;

        prvaObjava.print();
        prvaObjava.like();
        prvaObjava.like();
        prvaObjava.dislike();
        prvaObjava.share();
        prvaObjava.print();

        System.out.println("");

        drugaObjava.print();
        drugaObjava.share();
        drugaObjava.like();
        drugaObjava.share();
        drugaObjava.dislike();
        drugaObjava.like();
        drugaObjava.like();
        drugaObjava.print();


    } // kraj main
}
