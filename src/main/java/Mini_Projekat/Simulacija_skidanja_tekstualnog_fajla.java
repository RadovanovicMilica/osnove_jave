package Mini_Projekat;

import java.util.Scanner;

public class Simulacija_skidanja_tekstualnog_fajla {
    public static void main(String[] args) {
//        Napišite program koji simulira proces skidanja tekstualnog fajla. Skidanje fajla se
//       obavlja u paketima od po 5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//
//●	Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//●	Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//●	Korisnik će biti upitan za podatke svakog paketa kroz for petlju. Nakon unosa svakog paketa,
//program treba da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//●	Na kraju programa, ispišite sadržaj celog fajla.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite velicinu fajla (u bajtovima): ");
        int velicinaFajla = s.nextInt();

        double skinuto = 0;
        String sadrzajFajla = "";

        double brojPaketa = velicinaFajla / 5.0;
        for (int i = 0; i < brojPaketa; i++) {

            int brojKaraktera = 5;
            // ovaj if ce da mi radi samo u poslednjonj iteraciji
            if( i+1 > brojPaketa) {
                brojKaraktera = velicinaFajla % 5;

            }
//
            System.out.println("Unesite paket od  " + brojKaraktera + " bajta: ");
            String nazivPaketa = s.next();
            int skinutoBajtova= velicinaFajla - brojKaraktera;
            double procenatSkinutogFile = (brojKaraktera * 100.0) / velicinaFajla;
            skinuto = skinuto + procenatSkinutogFile;
            System.out.println("Skinuto je: " + skinuto + " %");

            sadrzajFajla= sadrzajFajla + nazivPaketa;

        }
        System.out.println("Sardrzaj fajla je: " + sadrzajFajla );



    }
}
