package p24_08_2023;

import java.util.ArrayList;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati program koji simulira digitalni meni za pasta bar. Program ima dva niza informacija paste i cene. Program stampa meni u formatu
//        naziv paste ………………………….cena rsd
//        Informacije su uparene po poziciji, to znaci da je:
//        pasta na poziciji 0, sa cenom sa pozicije 0
//        pasta na poziciji 1, sa cenom sa pozicije 1
//…..
//
//        Primer izvrsenja:
//        AGLIO E OLIO ………………… 500 rsd
//        PRIMAVERA…………………340 rsd
//        ARRABBIATA ………………….420 rsd
//        NAPOLITANA ………………….440 rsd
//        POLLO E SPINACI ………………….550 rsd


        ArrayList<String> pasta = new ArrayList<>();
        pasta.add("Agilo e olio");
        pasta.add("Primavera");
        pasta.add("Arrabbitata");
        pasta.add("Napolitana");
        pasta.add("Polo e spinaci");


        ArrayList<Integer> cene = new ArrayList<>();
        cene.add (500);
        cene.add (340);
        cene.add (420);
        cene.add (440);
        cene.add (550);


        for (int i= 0 ; i< pasta.size(); i++) {
           int cena = cene.get (i);
           cena = 80 * cena / 100;
            System.out.println(pasta.get(i) + "........" + cene.get(i));
        }




    }
}
