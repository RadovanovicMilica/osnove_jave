package p25_08_2023;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati metodu koja proverava da li je trougao pravougli. Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//                Trougao je pravougli ukoliko je a*a+b*b=c*c

        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(proveraTrougla(a, b, c));

    } // kraj main

    public static boolean proveraTrougla(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;

        }   // kraj
    }
}
