package p17_08_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String ime= s.next();
        System.out.println("Unesite prezime: ");
        String prezime= s.next();
        System.out.println("Unesite broj telefona: ");
        String brojTelefona= s.next();
        System.out.println("Unesite email: ");
        String email= s.next();
        System.out.println("Unesite jmbg: ");
        String jmbg= s.next();

        System.out.println(ime);
        System.out.println(prezime);
        System.out.println(brojTelefona);
        System.out.println(email);
        System.out.println(jmbg);


    }
}
