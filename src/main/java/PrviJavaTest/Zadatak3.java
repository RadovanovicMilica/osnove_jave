package PrviJavaTest;

import java.util.Random;
import java.util.Scanner;
//
public class Zadatak3 {
    public static void main(String[] args) {
////        Napišite program koji simulira popularnu igricu "Veće-Manje".
////        Cilj igre je da korisnik pogodi tajni broj u što manje pokušaja.

////        1. Program će automatski izabrati nasumičan broj u opsegu od 1 do 50, (ovde verovatno treba random)
//          2. a korisniku će biti dozvoljeno da pokuša da pogodi taj broj najviše 5 puta.
//          3. Nakon svakog pokušaja,korisnik će dobiti povratnu informaciju da li je uneti broj manji ili veći od tajnog broja.
////        4. Igra će trajati sve dok korisnik ne pogodi tajni broj ili dok ne iskoristi sve pokušaje. (ovo su uslovi)
////        Evo primera izvršenja programa za oba scenarija, prema vašem opisu:
////
////        Primer izvršenja kada je tajni broj 37:
////        Tajni broj je spreman, pokušajte da pogodite broj.
////                Unesite broj: 5 (ovde mi treba skener i da cuvam u nekoj varijabli)
////        Tajni broj je veći. (ovo mi je sout...)
////        Unesite broj: 20
////        Tajni broj je veći.
////        Unesite broj: 35
////        Tajni broj je veći.
////        Unesite broj: 37
////        Čestitamo, pogodili ste tajni broj!
//
        Scanner s= new Scanner(System.in);
        Random random = new Random();
        int tajniBroj= random.nextInt( 1,51);
        System.out.println(tajniBroj);
        int brojPokusaja= 0;
        boolean pogodatk= false;

        while (brojPokusaja < 5 && pogodatk == false) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojPokusaja = brojPokusaja + 1;

            if (broj == tajniBroj) {
                pogodatk = true;
                System.out.println("Cestitamo!");
            } else if (brojPokusaja == 5) {
                System.out.println("GAME OVER!");
            } else if (broj < tajniBroj) {
                System.out.println("Tajni broj je veci!");
            } else if (broj > tajniBroj) {
                System.out.println("Tajni broj je manji!");
            }




        }

    }
}
