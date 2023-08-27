package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        7.	Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu
//        iskoristi funkciju i ispisti odgovarajucu poruku.
//
//                Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4


        Scanner s= new Scanner(System.in);
        System.out.println("Unesite broj a:");
        int a= s.nextInt();
        System.out.println("Unesite broj b: ");
int b= s.nextInt();
        System.out.println("Unesite broj c: ");
        int c= s.nextInt();

        int najmanjiBroj = vracanjeNajmanjegBroja(a, b, c );
        System.out.println("Najmanji broj je: " + najmanjiBroj);

    } // kraj main

    public static int vracanjeNajmanjegBroja ( int a, int b, int c){
 if (a <=b && a<=c) {
     return a;
 } else if (b<= a && b<=c) {
     return b;

 }else {
     return c;
 }


//        return

    }

}
