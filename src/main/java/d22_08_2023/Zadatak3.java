package d22_08_2023;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        	Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku vrednost
//        sve dok korisnik ne unese KRAJ..

        Scanner s= new Scanner(System.in);
boolean kraj= false;

        while (!kraj ) {
            System.out.println("Unesite rimski broj" );
           String rimskiBroj= s.next();

           if (rimskiBroj.equals("I")) {
                System.out.println("Arapski je: " + 1);
           }
           if  (rimskiBroj.equals ("X")) {
               System.out.println("Arapski je: " + 10);
           }
           if (rimskiBroj.equals ("C")) {
               System.out.println("Arapski je: " + 50);
           }
           if (rimskiBroj.equals ("D")) {
               System.out.println("Arapski je: " + 500);
           }
           if (rimskiBroj.equals ("M")) {
               System.out.println("Arapski je: " + 1000);
           }
           else if (rimskiBroj.equals("KRAJ")) {
               System.out.println("KRAJ");
               kraj= true;
           }
        }  // kraj while




                        } // main kraj
} // class kraj

