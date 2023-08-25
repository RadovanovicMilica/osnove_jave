package p25_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za
//        dva prosledjena broja. Brojevi su ulazni parametri funkcije.
//                U gravnom programu pozvati nekoliko puta funkciju sa
//        razlicitim prosledjenim vrednostima.

       racunica(10 , 5);




    } // kraj main
public static void racunica ( int broj_1, int broj_2) {
   int suma= broj_1 + broj_2;
   int razlika= broj_1 - broj_2;
   int proizvod= broj_1 * broj_2;
   int kolicnik= broj_1 / broj_2;

    System.out.println("Zbir je" + suma);
    System.out.println("Raylika je: " + razlika);
    System.out.println("Proizvod je: " + proizvod);
    System.out.println("Kolicnik je: " + kolicnik);


}


}
