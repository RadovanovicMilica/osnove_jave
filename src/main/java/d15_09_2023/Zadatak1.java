package d15_09_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
      Igrac golman= new Igrac("Nidza P." , "2104013", 2013, 01,  "Golman", false);
      Igrac stoper= new Igrac("Vuk R.", "2806015", 2015, 05, "Stoper,", true);

      Trener glavni= new Trener("Miodrag Pantelic", "0409973", 1973, 25, "Glavni trener");
      Trener pomocni = new Trener("Nenad Miljkovic", "0407793", 1973, 23, "Pomocni trener");
   golman.stampaj();
   stoper.stampaj();
   glavni.stampaj();
   pomocni.stampaj();

        ArrayList <Igrac> spisakIgraca = new ArrayList<>();
int duzinaNiza=3;
        for (int i=0; i<duzinaNiza; i++) {
            System.out.println("Unesite ime igraca:");
            String ime = s.next();
            Igrac igrac= new Igrac();
           igrac.setPunoIme(ime);
           spisakIgraca.add(igrac);
        }
        System.out.println("Spisak igraca:");
        for (int i=0; i<spisakIgraca.size(); i++){
            Igrac aktivniIgrac= spisakIgraca.get(i);
        System.out.println(aktivniIgrac.getPunoIme());
        }

        ArrayList <Trener> spisakTrenera= new ArrayList<>();
        for (int i=0; i< duzinaNiza; i++){
            System.out.println("Unesite ime trenera: ");
            String imeTrenera= s.next();

            Trener trener= new Trener();
            trener.setPunoIme(imeTrenera);
            spisakTrenera.add(trener);
        }
        System.out.println("Sipsak aktuelnih trenera: ");
        for (int i=0; i<spisakTrenera.size(); i++){
            Trener aktuelniTrener = spisakTrenera.get(i);
            System.out.println(aktuelniTrener.getPunoIme());
        }
    }
}
