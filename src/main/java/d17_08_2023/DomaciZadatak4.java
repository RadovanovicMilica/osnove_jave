package d17_08_2023;

import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {

//        Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//        Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s= new Scanner(System.in);

        System.out.println("Unesite x za T1");
        int xT1= s.nextInt();
        System.out.println("Unesite y za T1");
        int yT1= s.nextInt();

        System.out.println("Unesite x za T2");
        int xT2= s.nextInt();
        System.out.println("Unesite y za T2");
        int yT2= s.nextInt();

        System.out.println("Unesite x za M");
        int xM= s.nextInt();
        System.out.println("Unesite y za M");
        int yM= s.nextInt();

        if ((xM > xT1 && xM < xT2) && (yM > yT1 && xM < yT2)) {
            System.out.println("Kliknuto je u okviru login forme za veb stranicu");
        }
        else {
            System.out.println("Nije kliknuto unutar forme za web stranicu");
        }


//





    }
}
