package d22_08_2023;
//	Napisati program koji sabira brojeve koje korisnik unosi, pritom da suma ne predje 100.
//            Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
int zbir=0;


        while (zbir< 100) {
            System.out.println("Unesite broj: ");
            int unetiBroj= s.nextInt();
            zbir= zbir + unetiBroj;

            if (zbir> 100) {
                System.out.println("Resenje je: "  + (zbir - unetiBroj) );
            }




        }





    } // kraj main
} // kraj klase
