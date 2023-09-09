package p08_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {


        SmartAirConditioning kancelaijskaKlima = new SmartAirConditioning();
        kancelaijskaKlima.marka = "Tesla";
        kancelaijskaKlima.potrosnjaStrujeHladjenje= 3;
        kancelaijskaKlima.potrosnjaStrujeGrejanje = 1;
        kancelaijskaKlima.temperatura = 19;
        kancelaijskaKlima.mod= "hladi";

        kancelaijskaKlima.stampa();
        System.out.println("Mesecna potrosnja: " + kancelaijskaKlima.mesecnaPotrosja());
        System.out.println( "Mesecni racun: " + kancelaijskaKlima.mesecniRacun());
    }
}
