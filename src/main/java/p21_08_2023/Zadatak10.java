package p21_08_2023;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
//
//        Napisati program koji sakriva uneti password..
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************

        Scanner s= new Scanner(System.in);
        System.out.println("Molimo unesite password: ");
        String password= s.next();

        System.out.println("Skriveni password");

        for (int i=0; i<password.length(); i++) {
            System.out.print("*");
        }



    }
}
