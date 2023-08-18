package d17_08_2023;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

//        Napisati program koji ima informacije koje ucitava informacije sa tastature:
//        Ime
//                Prezime
//        godinu rodjenja
//        I stampa informaicije u formatu:
//[ime] [prezime] - [startost] god

        Scanner s= new Scanner(System.in);

        System.out.println("Unesite ime");
        String ime= s.next();
        System.out.println("Unesite prezime");
        String prezime= s.next();
        System.out.println("Unesite godinu rodjenja ");
        int godinaRodjenja= s.nextInt();

        int brojGodina= (2023 - godinaRodjenja);

        System.out.print(ime + " ");
        System.out.print(prezime + " ");
        System.out.println(brojGodina);


    }
}
