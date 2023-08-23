package p22_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji simulira ponasanje jednog test case-a.
//        Test case ima 5 provera, a program validira jednu po jednu proveru
//        sve dok ne proveri sve ili dok neka provera ne failuje.
//        Korisnik sa tastature za svaku proveru unosi expected rec i actual
//        rec. U slucaju fail-a ispisati odgovarajucu poruku.
//                Primer izvrsenja 1:
//        Unesite expected: hello
//        Unesite actual: hello
//        Unesite expected: hello1
//        Unesite actual: hello1
//        Unesite expected: hello2
//        Unesite actual: hello
//        Test failed: Expected hello2 but got hello.

        Scanner s= new Scanner(System.in);
    boolean hasError= false;
    int i=0;
     String errorMessage= "";
        while (!hasError && i<5) {
            System.out.println("Unesite actual rezultat: ");
            String actual = s.next();
            System.out.println(" Unesite ocekivani rezultst: ");
            String expected = s.next();


            if (!actual.equals(expected)) {
                hasError = true;
                errorMessage= "Expected " + expected + "but got " +actual + ".";
            }
            i++;
        }
            if (hasError) {
                System.out.println("Test faild!" + errorMessage);
            } else {
                System.out.println("Test passed!");


        }

    } // kraj main
} // kraj class
