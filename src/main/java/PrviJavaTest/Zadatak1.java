package PrviJavaTest;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napišite program koji simulira softver za upoznavanje stvoren posebno za žene,
//        pružajući im priliku da upoznaju muškarca svojih snova. U prvoj verziji programa, ženama
//        je ponuđeno pet faktora prema kojima mogu odabrati svog idealnog muškarca. Ovi faktori uključuju:
//        Visina muškarca u određenom rasponu.
//                Grad iz kojeg bi trebao biti muškarac.
//        Starost muškarca u određenom rasponu.
//                Boja kose muškarca.
//        Prisustvo brade kod muškarca.
//
//        Program na početku traži od korisnica da unesu kriterijume koje žele kod svog idealnog partnera,
//        a zatim i informacije o muškarcu kojeg žele upoznati. Na kraju, program će izbaciti rezultat da li su
//        dvoje kompatibilni ili ne. Dvoje se smatraju kompatibilnima ako muškarac zadovoljava barem tri od pet
//        faktora koje su žene definisale.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite minimalnu zeljenu visinu: ");
        int visinaMin = s.nextInt();
        System.out.println("Unesite maksimalnu zeljenu visinu: ");
        int visinaMax = s.nextInt();
        System.out.println("Unesite grad iz kog zelite da bude Vas muskarac: ");
        String grad = s.next();
        System.out.println("Unesite minimalan broj godina Vaseg muskarca iz snova: ");
        int godineMin = s.nextInt();
        System.out.println("Unesite maksimalan broj godina Vaseg muskarca iz snova: ");
        int godineMax = s.nextInt();
        System.out.println("Unesite zeljenu boju kose: ");
        String zeljenaBojaKose= s.next();
        System.out.println("Da li zelite da Vas muskarac ima bradu? ");
        boolean brada= s.nextBoolean();


        System.out.println("Visina muskarca: ");
        int visinaMuskarca = s.nextInt();
        System.out.println("Vas grad: ");
        String gradMuskarca = s.next();
        System.out.println("Broj godina: ");
        int brojGodina = s.nextInt();
        System.out.println("Boja kose: ");
        String bojaKose = s.next();
        System.out.println("Da li imate bradu?");
        boolean bradatiCovek= s.nextBoolean();

        int kriterijum = 0;
        if (visinaMuskarca >= visinaMin && visinaMuskarca < visinaMax) {
            kriterijum = kriterijum + 1;
        } else {
            kriterijum = 0;
        } if (gradMuskarca.equals(grad)) {
            kriterijum = kriterijum + 1;
        } else {
            kriterijum = kriterijum - 1;
        } if (brojGodina >= godineMin && brojGodina <= godineMax) {
            kriterijum = kriterijum + 1;
        }else {
            kriterijum = kriterijum - 1;
        } if (bojaKose.equals(zeljenaBojaKose)) {
            kriterijum = kriterijum + 1;
        } else {
            kriterijum = kriterijum - 1;
        } if (bradatiCovek == brada) {
            kriterijum = kriterijum + 1;
        } else {
            kriterijum = kriterijum - 1;
        }
     if (kriterijum >= 3) {
         System.out.println("Pronasli ste coveka svojih snova!");
     } else {
         System.out.println(" Ovaj muskarac ne ispunjava Vase zahteve!");
     }

    }
}
