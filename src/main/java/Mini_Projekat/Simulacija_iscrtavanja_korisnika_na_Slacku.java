package Mini_Projekat;

import java.util.ArrayList;

public class Simulacija_iscrtavanja_korisnika_na_Slacku {
    public static void main(String[] args) {
//        Napišite program koji simulira prikazivanje korisnika na Slacku. Prikaz korisnika treba da se izvede
//        tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//●	Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//●	Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan. Informacije o aktivnostima biće
// čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
// Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu. To znači da će se za korisnika na
// poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//                Program će ispisivati informacije za svakog korisnika na sledeći način:
//●	Za aktivne korisnike:
//  | slika |o Ime Prezime
//●	Za neaktivne korisnike:
//  | slika |x Ime Prezime

        ArrayList<String> nizKorisnika = new ArrayList<>();
        nizKorisnika.add("Pera Peric");
        nizKorisnika.add("Darko Darkovic");
        nizKorisnika.add("Marko Markovic");
        nizKorisnika.add("Stefan Stefanovic");
        nizKorisnika.add("Uros Urosevic");
        nizKorisnika.add("Milan Milanovic");

        ArrayList<Boolean> aktivnostKorisnika = new ArrayList<>();
        aktivnostKorisnika.add(true);
        aktivnostKorisnika.add(false);
        aktivnostKorisnika.add(true);
        aktivnostKorisnika.add(true);
        aktivnostKorisnika.add(false);
        aktivnostKorisnika.add(true);

        ArrayList<String> listaAktivnihKorisnika = new ArrayList<>();
        ArrayList<String> listaNeaktivnihkorisnika = new ArrayList<>();


        for (int i = 0; i < nizKorisnika.size(); i++) {

            boolean aktivnost = aktivnostKorisnika.get(i); // true ili false
            String korisnik = nizKorisnika.get(i);

            if (aktivnost == true) {
                listaAktivnihKorisnika.add(korisnik);
            } else {
                listaNeaktivnihkorisnika.add(korisnik);
            }
        }

        for (int i=0; i< listaAktivnihKorisnika.size(); i++) {
            System.out.println ("| slika |o  " + listaAktivnihKorisnika.get(i));
        }

        for (int i=0; i< listaNeaktivnihkorisnika.size(); i++) {
            System.out.println("| slika |x  " + listaNeaktivnihkorisnika.get(i));
        }



    }
}





// niz korisnika
// niz aktivnosti
