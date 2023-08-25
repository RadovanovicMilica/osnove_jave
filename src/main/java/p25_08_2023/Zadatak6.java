package p25_08_2023;

public class Zadatak6 {
    public static void main(String[] args) {


//    Napisati metodu koja vraca suprotno negativni broj od
//    prosledjenog. Metoda prima broj N i vraca ga sa negativnom
//    vrednoscu.
//    Primer: Ako se metoda pozove za N=10, vraca -10
//    Ako se metoda pozove za N=-11, vraca 11

int n=10;

int minus= negativniBrojevi(n);

        System.out.println(minus);

    } // kraj main


    public static int negativniBrojevi (int n) {
       int negativniBrojevi= -1 * n;
        return negativniBrojevi;
    }


}
