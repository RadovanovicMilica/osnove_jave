package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Proizvod sladoled= new Proizvod();
        sladoled.naziv = "Bolero";
        sladoled.cena = 300;
        sladoled.tezinaProizvodaUGramima = 180;


        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Simka";
        cokolada.cena = 130;
        cokolada.tezinaProizvodaUGramima = 90;



        sladoled.stampaj();
        sladoled.povecajCenu( 60);
        System.out.println(sladoled.cena);

        System.out.println("Popust je: " + sladoled.cenaSaPopustom (12.0) + " RSD");

        System.out.println("Postarina je: " + sladoled.racunajPostarinu());

        System.out.println("");

        cokolada.stampaj();
        cokolada.povecajCenu( 50);
        System.out.println(cokolada.cena);

        System.out.println("Popust je: " + cokolada.cenaSaPopustom (10.0) + "RSD");

        System.out.println("Postarina je: " + cokolada.racunajPostarinu());


    }

}
