package d25_08_2023;

public class Domaci2 {
    public static void main(String[] args) {


//        2.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu
//        vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

int broj1= 5;
int broj2= 9;
        System.out.println(spajanjeBrojeva(5 , 9 ) + " nova vrednost");



    } // main kraj
    public static int spajanjeBrojeva (int broj1, int broj2){
    int novaVrednost= broj1 * 10 + broj2;

    return novaVrednost;

}




}   //klasa kraj

