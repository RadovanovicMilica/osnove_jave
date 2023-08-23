package p22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati pogram koji vrsi korkeciju zvuka. Korisnik unosi akcije “pojacaj” ili “smanji” ili “play”.
//        Program radi dok korisnik ne unese play. Inicijalna jacina zvuka je 75.
//        Pojacaj - akcije koja povecava jacinu zvuka za 10
//        smanji - akcija koja smajnjuje jacinu zvuka za 10.
//        Zvuk nakon nijedne akcije ne sme da spadne ispod nule ili da ode preko 100.
//        Na kraju programa odstampati jacinu zvuka.
//
//        Primer izvrsenja:
//        Unesite akciju: pojacaj (iz 75 u 85)
//        Unesite akciju: pojacaj ( iz 85 u 95)
//        Unesite akciju: pojacaj (iz 95 u 100)
//        Unesite akciju: smanji (iz 100 u 90)
//        Unesite akciju: smanji (iz 90 u 80)
//        Unesite akciju: play
//        Jacina zvuka je 80.

        Scanner s= new Scanner(System.in);

        int jacinaZvuka=75;
        boolean play = false;

        while (!play) {
            System.out.println("Unesi pojacaj, smanji ili play");
            String korisnikUneo = s.next();

            if (korisnikUneo.equals("pojacaj") ) {
                jacinaZvuka = jacinaZvuka + 10;
              if (jacinaZvuka > 100) {
                  jacinaZvuka=100;
              }

            } else if(korisnikUneo.equals("smanji")) {
                jacinaZvuka = jacinaZvuka - 10;
                if (jacinaZvuka < 0) {
                    jacinaZvuka=0;
                }

            } else if (korisnikUneo.equals("play") ) {
                play = true;
            }



        } // kraj loopa

        System.out.println("Jacina zvuka je: " + jacinaZvuka);


    } // kraj main
} // kraj class
