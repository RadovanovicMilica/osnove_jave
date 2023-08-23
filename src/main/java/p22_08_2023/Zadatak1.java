package p22_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji validira unos input polja za broj.
//                Polje za unos prima samo brojeve u opsegu
//    od 10 do 50.Korisnik unosi vrednosti dok ne unese
//        validan  broj.
//        Primer izvrsenja:
//        Unesite broj: 5
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: -1
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: 51
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: 40

        Scanner s= new Scanner(System.in);

        int broj= 0;
        while (broj>50 || broj<10) {
            System.out.println("Unesite broj");
            broj=s.nextInt();
if (broj <10 || broj > 50) {
    System.out.println("Greska! Broj koji ste uneli nije u opsegu od 10 do 50");
} else
            System.out.println("The end");
        } // kraj petlje
    } // kraj main
} // kraj klasa
