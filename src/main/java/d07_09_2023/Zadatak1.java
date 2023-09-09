package d07_09_2023;

import p07_09_2023.Racun;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

        Student prvi= new Student();
        prvi.ime= "Radovanovic Milica";
        prvi.brojIndexa= 50;
        prvi.fakultet= "Geografski fakultet";


        Student drugi= new Student();
        drugi.ime= "Jovanovic Ivana";
        drugi.brojIndexa= 42;
        drugi.fakultet= "Filozofski fakultet";

        Student treci= new Student();
        treci.ime= "Vujovic Ivana";
        treci.brojIndexa= 39;
        treci.fakultet= "FTN";

        System.out.println("Ime i prezime studenta: " + prvi.ime);
        System.out.println("Broj indeksa: " + prvi.brojIndexa);
        System.out.println("Naziv vise skole ili fakulteta: " + prvi.fakultet);

        System.out.println();

        System.out.println("Ime i prezime studenta: " + drugi.ime);
        System.out.println("Broj indeksa: " + drugi.brojIndexa);
        System.out.println("Naziv vise skole ili fakulteta: " + drugi.fakultet);

        System.out.println();

        System.out.println("Ime i prezime studenta: " + treci.ime);
        System.out.println("Broj indeksa: " + treci.brojIndexa);
        System.out.println("Naziv vise skole ili fakulteta: " + treci.fakultet);
    }
}
