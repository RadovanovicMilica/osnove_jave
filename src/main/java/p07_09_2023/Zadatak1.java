package p07_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);


        Racun posiljalac= new Racun();
        posiljalac.broj="123456-789";
        posiljalac.imeIPrezime= "Micke Radovanovic";
        posiljalac.stanje= 5000;

        Racun primalac= new Racun();
        primalac.broj= "564789-521";
        primalac.imeIPrezime= "Hana Radovanovic";
        primalac.stanje= 1000;

        System.out.println("Broj racuna: " + posiljalac.broj);
        System.out.println("Ime i prezime klijenta: " + posiljalac.imeIPrezime);
        System.out.println("Stanje na racunu: " + posiljalac.stanje);

        System.out.println("Broj racuna: " + primalac.broj);
        System.out.println("Ime i prezime klijenta: " + primalac.imeIPrezime);
        System.out.println("Stanje na racunu: " + primalac.stanje);

        System.out.println("Unesite sumu za transakciju: ");
        int suma= s.nextInt();

        posiljalac.stanje= posiljalac.stanje - suma;
        primalac.stanje= primalac.stanje + suma;

        System.out.println("Stanje na racunu: " + posiljalac.stanje);
        System.out.println("Stanje na racunu: " + primalac.stanje);

//
//double novoStanjePrvog= posiljalac.stanje - 500;
//double novoStanjeDrugog= primalac.stanje + 500;
//        System.out.println("Stanje na racunu: " + novoStanjePrvog);
//        System.out.println("Stanje na racunu: " + novoStanjeDrugog);


    }
}


