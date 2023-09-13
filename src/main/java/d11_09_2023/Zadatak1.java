package d11_09_2023;

import p11_09_2023.Reziser;

public class Zadatak1 {
    public static void main(String[] args) {
//        Kreirati klasu Autor koja ima
//                -ime i prezime
//        -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu:
//        (ime autora) (prezime autora)
//
//        Kreirati klasu Knjiga koji ima:
//        -ISBN
//                -naziv
//                -godina izdanja
//                -autor
//                -konstuktore koje mislite da su vam potrebni
//        -gettere i settere za atribute
//        -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//        (ISBN)
//                (naziv) - (godina izdanja)
//        autor: (ime autora) (prezime autora)
//
//        U glavnom programu napraviti vise autora sa vise knjiga.

        Autor domaci = new Autor("Jovan", "Ducic");
        Knjiga domaca = new Knjiga();
        domaca.setISBN("123456789555");
        domaca.setNaziv("Blago Cara Radovana");
        domaca.setGodinaIzdanja(1932);
        domaca.setPisao(domaci);
        domaca.stampaj();

        System.out.println(" ");

        Autor strani = new Autor("Dzordz", "Orvel");
        Knjiga stanaNF = new Knjiga("987654321999", "Zivotinjska farma", 1945, strani);
        stanaNF.stampaj();

        System.out.println(" ");

        Autor englez = new Autor();
        englez.setIme("Alen");
        englez.setPrezime("Kar");
        Knjiga popularnaPsihologija = new Knjiga("555666999123", "Lak nacin da prestanete da pusite",1983, englez);
        popularnaPsihologija.stampaj();

    }
}
