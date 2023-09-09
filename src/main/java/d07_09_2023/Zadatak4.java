package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.

        Scanner s= new Scanner(System.in);

        Film ratni = new Film();
        ratni.naslov= "";
        ratni.godinaIzdanja= 0;
        ratni.reziser= "";

        System.out.println("Unesite naziv ratnog filma");
        ratni.naslov= s.next();
        System.out.println("Unesite godinu izdavanja ratnog filma " );
        ratni.godinaIzdanja= s.nextInt();
        System.out.println("Unesite ime rezisera: ");
        ratni.reziser= s.next();

        Film horor = new Film();
        horor.naslov= "";
        horor.godinaIzdanja= 0;
        horor.reziser= "";

        System.out.println("Unesite naziv horor filma");
        horor.naslov= s.next();
        System.out.println("Unesite godinu izdavanja horor filma " );
        horor.godinaIzdanja= s.nextInt();
        System.out.println("Unesite ime rezisera: ");
        horor.reziser= s.next();

        Film triler = new Film();
        triler.naslov= "";
        triler.godinaIzdanja= 0;
        triler.reziser= "";

        System.out.println("Unesite naziv triler filma");
        triler.naslov= s.next();
        System.out.println("Unesite godinu izdavanja triler filma " );
        triler.godinaIzdanja= s.nextInt();
        System.out.println("Unesite ime rezisera: ");
        triler.reziser= s.next();
    }

}
