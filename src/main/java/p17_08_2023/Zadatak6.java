package p17_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji ucitava brojeve a, b i c sa tastature
//        i za svaki broj proverava da li je validan. Ukoliko je broj nije validan,
//        ispisuje se greska za svaki broj.
//                Broj nije validan ukoliko je broj negativan.

        Scanner s= new Scanner(System.in);

        System.out.println("Ukucaj a");
        int a= s.nextInt();
        System.out.println("Ukucaj b");
        int b= s.nextInt();
        System.out.println("Ukucaj c");
        int c= s.nextInt();

        if (a<0) {
            System.out.println("Broj " + a + "je nevalidan"); }
        if (b<0) {
            System.out.println("Broj " + b + "je nevalidan");
            if (c<0) {
                System.out.println("Broj " + c + "je nevalidan");

            }
        }
    }
}
