package d17_08_2023;

import java.util.Scanner;

public class Domacizadatak6 {

    public static void main(String[] args) {

//        Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
//        tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne.
//        Hint: Potrebno je da se vrsi konkatanacija nad jednom promenljivom.

        Scanner s= new Scanner(System.in);

        System.out.println("Unesite a");
        int a= s.nextInt();
        System.out.println("Unesite b");
        int b= s.nextInt();
        System.out.println("Unesite c");
        int c= s.nextInt();
        System.out.println("Unesite d");
        int d= s.nextInt();

        String p= "#";


//

        if (a >= 0) {
            p = p + a;
            System.out.println(p); }
            else {
                p = a+p;
            System.out.println(p);
        }
            if (b>= 0) {
                p = p + b;
                System.out.println(p); }
            else {
                p = b+p;
                System.out.println(p);}
            if (c >= 0) { p= p+c;
                System.out.println(p); }
            else { p= c + p;
                System.out.println(p);}
      if (d>= 0) {
          p= p+d;
            System.out.println(p); }
            else { p=d+p;
            System.out.println(p);}

        System.out.println("String p ima vrednost= " + p);





    }
}
