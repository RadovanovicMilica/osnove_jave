package PrviJavaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napišite program koji vrši validaciju udaljenosti između dalekovoda kako bi se utvrdilo da li
//        udaljenosti ispunjavaju propisane standarde Evropske unije.
//
//       1. Korisnik unosi udaljenosti između dalekovoda,
//       3. a te informacije program smešta u niz brojeva.
//        2. Korisnik unosi N udaljenosti dalekovoda, gde je N unos korisnika.
//
//       4. Nakon unosa udaljenosti, program će prikazati grafički prikaz udaljenosti između svaka dva dalekovoda.
        //        | …60m… | … 66m… | …55m… | …105m… | …35m… |

//        Zatim, program proverava da li rastojanje između dva dalekovoda ispunjava standarde, pri čemu standardi za
//        udaljenosti između dalekovoda važe ako su udaljenosti unutar opsega od 50 do 100 metara.
//        Ukoliko neka udaljenost ne ispunjava ove standarde, korisniku će se prikazati poruka o neispravnoj udaljenosti.
//
//                Na kraju izvršenja programa, program će izračunati ukupnu dužinu kablova potrebnu za
//                celu dalekovodnu infrastrukturu. Dužina kabla između dva dalekovoda iznosi 1.5 puta udaljenost
//                između dalekovoda.


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite udaljenost dalekovoda: ");
        int n = s.nextInt();

        ArrayList<Integer> udaljenost = new ArrayList<>();
        String razdaljina = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite rastojanje: ");
            int rastojanje = s.nextInt();
            udaljenost.add(rastojanje);

            razdaljina = razdaljina + "| ..." + rastojanje + "m...  ";
        }

        System.out.println(razdaljina + " |");

        for (int i = 0; i< udaljenost.size(); i++) {
            if (udaljenost.get(i) < 50 || udaljenost.get(i) > 100){
                System.out.println("Rastojanje na poziciji " + i + " duzine " + udaljenost.get(i) + " nije po standardima EU");
            }
        }

double duzinaKablova= 0;

        for (int i= 0; i< udaljenost.size(); i++) {
            duzinaKablova = duzinaKablova + udaljenost.get(i);
        }

        System.out.println(duzinaKablova * 1.5);
    }
}