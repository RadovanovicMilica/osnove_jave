package d18_08_2023;

import java.util.Scanner;

public class Zadatak_p10 {  public static void main(String[] args) {

//        Napisati program koji stampa 20 pozicija.
//                Za aktivnu poziciju stampa *
//                Za neaktivnu pozciju stampa _
//        Korisnik unosi granice za nekativni opseg, unoseci A i B.

    Scanner s = new Scanner(System.in);
             System.out.println("Unesite a:");
             int a= s.nextInt();
             System.out.println("Unesite b:");
             int b= s.nextInt();

             for (int i=1;i<=20; i++) {
                 if (i<=a) {
                     System.out.print("*");
                 } else if (i>b) {
                     System.out.print("*");
                 }else {
                     System.out.print("_");


                 }
             }}}

