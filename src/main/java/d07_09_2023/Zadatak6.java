package d07_09_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Vozilo vozniPark = new Vozilo();
        vozniPark.marka= "";
        vozniPark.model = "";
        vozniPark.brojRegistracije = "";
        vozniPark.godinaProizbodnje = 0;

        Vozaci spisakRadnika= new Vozaci();
        spisakRadnika.ime= "";
        spisakRadnika.prezime= "";
        spisakRadnika.jmbg = "";
        spisakRadnika.brojVozacke = "";
        spisakRadnika.datumIstekaVozacke= "";

        Ruta marsuta= new Ruta();
        marsuta.polaznaTacka= "";
        marsuta.odrediste = "";
        marsuta.duzinaRute = 0;
        marsuta.vremePutovanja= 0;

        Scanner s= new Scanner(System.in);

        System.out.println("Unesite marku vozila: ");
        vozniPark.marka = s.next();
        System.out.println("Unesite model vozila: ");
        vozniPark.model= s.next();
        System.out.println("Unesite registarski broj: ");
        vozniPark.brojRegistracije= s.next();
        System.out.println("Unesite godinu proizvodnje: ");
        vozniPark.godinaProizbodnje= s.nextInt();

        System.out.println("Unesite ime vozaca: ");
        spisakRadnika.ime = s.next();
        System.out.println("Unesite prezime vozaca: ");
        spisakRadnika.prezime= s.next();
        System.out.println("Unesite JMBG: ");
        spisakRadnika.jmbg= s.next();
        System.out.println("Unesite broj vozacke dozvole: ");
        spisakRadnika.brojVozacke= s.next();
        System.out.println("Unesite datum isteka vozacke dozvole: ");
        spisakRadnika.datumIstekaVozacke = s.next();

        System.out.println("Unesite polaznu tacku: ");
        marsuta.polaznaTacka = s.next();
        System.out.println("Unesite odrediste: ");
        marsuta.odrediste = s.next();
        System.out.println("Unesite duzinu rute: ");
        marsuta.duzinaRute = s.nextInt();
        System.out.println("Unesite vreme putovanja: ");
        marsuta.vremePutovanja = s.nextDouble();




    }
}
