package d25_08_2023;

import java.util.Scanner;

public class Domaci3 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.



         licniPodaci( "0501989", "Milica", "Radovanovic", "1989", true);


//


    }
    public static void   licniPodaci (String jmbg, String ime, String prezime, String godinaRodjenja, boolean aktivan) {
        System.out.println("JMBG " + jmbg);
        System.out.println("Ime " + ime);
        System.out.println("Prezime " + prezime);
        System.out.println("Godina rodjenja " + godinaRodjenja);


        if (aktivan) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
