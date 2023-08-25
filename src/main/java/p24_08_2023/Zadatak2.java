package p24_08_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i menja vrednost elementa na poziciji
//        3 tako sto je povecava 10 puta.
//                Npr: 1,4,5,6,7 => 1,4,5,60,8
//        int a = 10;
//        a = a * 10;

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add (1);
        broj.add (4);
        broj.add (5);
        broj.add (6);
        broj.add (7);


        int a= broj.get(3);
        a= a*10;
      broj.set (3, a);



        System.out.println(broj);
    }
}
