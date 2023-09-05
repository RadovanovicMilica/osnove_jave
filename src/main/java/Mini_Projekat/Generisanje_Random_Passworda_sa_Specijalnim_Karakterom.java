package Mini_Projekat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Generisanje_Random_Passworda_sa_Specijalnim_Karakterom {
    public static void main(String[] args) {

//        Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//●	generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//●	generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//                Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//                Glavni program:
//        - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//                - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.


        Scanner s= new Scanner(System.in);
        System.out.println("Molimo unesite zeljenu duzinu passworda");
        int duzinaPassworda= s.nextInt();
        System.out.println("Ako zelite specijalni karakter upisite true, a ako ne zelite upisite false. ");
        boolean specijalniKarakter= s.nextBoolean();


            generisiPassword(duzinaPassworda, specijalniKarakter);

    }

public static void generisiPassword (Integer duzinapass, boolean specijalniKarakter){
String password= "";

    if(specijalniKarakter == true) {
//        treba mi password sa specijalnim karakterom
        for (int i= 1; i< duzinapass; i++) {
            password= password + generisiRandomKarakter() ;
        }
        password = password + generisiRandomSpecijalneKaraktere();
    } else if(specijalniKarakter == false) {
//        password bez specijalnog karaktera
        for (int i= 0; i< duzinapass; i++) {
            password= password + generisiRandomKarakter() ;
        }
    }
    System.out.println(password);

}
public static String generisiRandomKarakter (){
        ArrayList<String> karakteri= new ArrayList<>();
         karakteri.add("A");
         karakteri.add("B");
         karakteri.add("C");
         karakteri.add("D");
         karakteri.add("E");
         karakteri.add("F");
         karakteri.add("G");
         karakteri.add("H");
         karakteri.add("I");
         karakteri.add("J");
         karakteri.add("K");
         karakteri.add("l");
         karakteri.add("m");
         karakteri.add("n");
         karakteri.add("o");
         karakteri.add("p");
         karakteri.add("r");
         karakteri.add("s");
         karakteri.add("t");
         karakteri.add("u");
         karakteri.add("v");
         karakteri.add("z");


        Random random= new Random();
        int randomBroj= random.nextInt(0, karakteri.size());
        return karakteri.get(randomBroj);

}
public static String generisiRandomSpecijalneKaraktere (){
        ArrayList <String> specijalniKarakteri= new ArrayList<>();
        specijalniKarakteri.add("!");
        specijalniKarakteri.add ("*");
        specijalniKarakteri.add ("#");
        specijalniKarakteri.add ("@");
        specijalniKarakteri.add ("&");

        Random random= new Random();
        int randomBrojKaraktera= random.nextInt(0, specijalniKarakteri.size());
        return specijalniKarakteri.get(randomBrojKaraktera);
}


}
