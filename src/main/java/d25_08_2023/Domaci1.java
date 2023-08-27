package d25_08_2023;

public class Domaci1 {
    public static void main(String[] args) {

//        1.	Napisati metodu stampajVrednostZa10Vecu u kojoj
//        se stampa prosledjena vrednost za 10 veca.Iz main-a
//        pozvati izvrsenje metode za razlicite vrednosti.

        int prosledjenaVrednost = 0;
        int uvecavanje = prosledjenaVrednost + 10;
        int zaStampu = stampajVrednostZa10Vecu(5) + uvecavanje;

        System.out.println(zaStampu);

    } // kraj main

    public static int stampajVrednostZa10Vecu(int a) {
        System.out.println(a);
       return a;  }
}






