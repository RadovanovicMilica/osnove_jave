package d18_08_2023;

import java.util.Scanner;

public class Domaci6 {
    public static void main(String[] args) {
//        Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
//        Unesite dimenziju table: 5
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite dimenziju table:");
        int a = s.nextInt();
int sum= a*a;
        for (int i=1; i<=sum; i++ ) {

            System.out.print("_|");
     if (i%a==0)   {
         System.out.println( " ");





        }
    } } }
