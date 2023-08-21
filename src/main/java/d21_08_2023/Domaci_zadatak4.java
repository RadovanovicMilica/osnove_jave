package d21_08_2023;

import java.util.Scanner;

public class Domaci_zadatak4 {
    public static void main(String[] args) {

//        4.	Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija. Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//●	like
//●	smile
//●	heart

        Scanner s= new Scanner(System.in);
        System.out.println("Uneiste broj N reakcija");
        int n= s.nextInt();

        int likeCounter= 0;
        int smileCounter= 0;
        int heartCounter= 0;

//
        for (int i=1; i<=n; i++) {
            System.out.println("Unesite reakciju:");
            String reakcija= s.next();

            if (reakcija.equals("like")) {
               likeCounter= likeCounter + 1;
            } else if (reakcija.equals("smile")) {
               smileCounter= smileCounter +1;
            } else if (reakcija.equals ("heart")) {
               heartCounter= heartCounter + 1;
            }

        } // kraj fora

        System.out.println("SUMMARY: " + "LIKE " +  likeCounter + " | " + "SMILE " + smileCounter + " | " + "HEART " + heartCounter);



    } // zatvaram main
} // zatvaram klasu
