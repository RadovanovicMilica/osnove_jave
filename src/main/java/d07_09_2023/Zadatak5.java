package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double). U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.

        Scanner s= new Scanner(System.in);

        Oprema kampovanje= new Oprema();
        kampovanje.marka = "";
        kampovanje.tip = "";
        kampovanje.cena= 0;

        Oprema kosarka= new Oprema();
        kosarka.marka = "";
        kosarka.tip = "";
        kosarka.cena = 0;

        Oprema fudbal = new Oprema();
        fudbal.marka = "";
        fudbal.tip = "";
        fudbal.cena = 0;

        System.out.println("Unesite naziv kamperske opreme: ");
        kampovanje.marka= s.next();
        System.out.println("Unesite tip kamperske opreme: ");
        kampovanje.tip = s.next();
        System.out.println("Unesite  cenu");
        kampovanje.cena= s.nextInt();

        System.out.println("Unesite naziv kosarkaske opreme: ");
        kosarka.marka= s.next();
        System.out.println("Unesite tip kosarkske opreme: ");
        kosarka.tip = s.next();
        System.out.println("Unesite  cenu");
        kosarka.cena= s.nextInt();

        System.out.println("Unesite naziv fudbalske opreme: ");
        fudbal.marka= s.next();
        System.out.println("Unesite tip fudbalske opreme: ");
        fudbal.tip = s.next();
        System.out.println("Unesite  cenu");
        fudbal.cena= s.nextInt();

        System.out.println(kampovanje.marka + " " + kampovanje.tip + " " + kampovanje.cena);
        System.out.println(kosarka.marka + " " + kosarka.tip + " " + kosarka.cena);
        System.out.println(fudbal.marka + " " + fudbal.tip +  " " + fudbal.cena);
    }
}
