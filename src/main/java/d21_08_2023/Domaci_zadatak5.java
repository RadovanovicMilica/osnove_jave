package d21_08_2023;

import java.util.Random;
import java.util.Scanner;

public class Domaci_zadatak5 {
    public static void main(String[] args) {

//     	Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju
//        dva random broja koja treba da sabere i poruka o tacnosti resenja.
//        (Program generise random brojeve u opsegu od 0 do 50, ne unosi ih korisnik)

        Scanner s = new Scanner(System.in);

        int tacanOdgovor = 0;
        int brojTacnihOdgovora = 0;
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            int x = random.nextInt(50);
            int y = random.nextInt(50);

            tacanOdgovor = x + y;
            System.out.println("Koliko je " + x + "+" + y + "?");

            int realniOdgovor = s.nextInt();

            if (tacanOdgovor == realniOdgovor) {
                System.out.println("Cestitamo!");
                brojTacnihOdgovora++;
            } else if (tacanOdgovor != realniOdgovor) {
                System.out.println("Greska!");
            }

        } // zatvaram petlju


        System.out.println("Broj tacnih odgovora je: " + brojTacnihOdgovora + "/5");
    } // zatvaram metodu

} //zatvaram klasu
