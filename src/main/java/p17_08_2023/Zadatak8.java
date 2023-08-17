package p17_08_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati program koji ucitava stranice
//        trougla a, b i c i ispisuje da li je trougao
//        pravougli. Trougao je pravougli ako je

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi vrednost stranice a" );
        int a= s.nextInt();
        System.out.println("Unesite vrednost stranice b");
        int b= s.nextInt();
        System.out.println("Unesite vrednost stranice c ");
        int c= s.nextInt();
        if (a*a + b*b == c*c) {
            System.out.println("Trougao je pravougli"); }
        else {
            System.out.println("Trougao nije pravougli"); }

    }
}
