package PrviJavaTest;

import java.util.Random;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napišite metode koje omogućavaju pakovanje teksta u HTML elemente. Prva metoda,
//        kao parametre, prima tekst i tip, a vraća HTML element (String) s prosleđenim tekstom.
//        Metoda podržava sledeće tipove:
//
//        - "bold": Metoda pakuje tekst u <b>prosleđeni tekst</b>.
//        - "italic": Metoda pakuje tekst u <em>prosleđeni tekst</em>.
//        - "paragraph": Metoda pakuje tekst u <p>prosleđeni tekst</p>.
//
//        Ako se prosledi tip koji nije podržan, vraća se neupakovan tekst, tj.
//        vraća se takav kakav je bio prosleđen metodi.
//
//                Druga metoda služi za kreiranje HTML anchor taga. Metoda kao parametre prima
//                link i tekst koji treba da bude linkovan. Metoda vraća tekst u formatu
//                <a href=prosleđeniLink>Prosleđeni tekst</a>.
//
//        U glavnom programu, koristeći kreirane metode, napišite program koji prikazuje sledeći tekst:
//<a href=google.com>Welcome to Google</a>
//<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//<p>Naravno samo je falio paragraf</p>

        System.out.println (htmlAnchorTag("google.com" , "Welcome to Google"));
        System.out.println  (textITip("ovo je bold" , "bold"));
        System.out.println(textITip("Naravno samo je paragraf falio" , "paragraph"));


    } // kraj main

    public static String textITip (String text, String tip ) {

        String rezultat = "";

        if (tip.contains("bold")) {
            rezultat = "<b>" + text + "</b>";
        } else if (tip.contains("italic")) {
            rezultat = "<em>" + text + "</em>";
        } else if (tip.contains("paragraph")) {
            rezultat = "<p>" + text + "</p>";
        } else {
            rezultat =  text;
        }

        return  rezultat;

    } // kraj metode textITip

    public static String htmlAnchorTag (String link, String tekst) {

   String formatirano = "<a href=" + link+ ">" +  tekst +  "</a>";

    return formatirano;
    } // kraj html

} // kraj class