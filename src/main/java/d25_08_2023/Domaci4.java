package d25_08_2023;

public class Domaci4 {
    public static void main(String[] args) {
//        4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//        Napomena: Metoda nista ne vraca

stampanjeKaraktera(6, "/");
        System.out.println();

    } // kraj main

    public static void stampanjeKaraktera (int n, String karakter) {

        for (int i=0; i < n; i++) {
            System.out.print(karakter);
        }
    }


} // kraj klase
