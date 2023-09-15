package d12_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Racun racunS = new Racun("123-456789", "Micke R.", 10000);
        Racun racunN = new Racun("987-654321", "Nada K. ", 3000);

        racunS.stampaj();
        racunN.stampaj();

        Transakcija trans1 = new Transakcija(555 , racunS, racunN);
        trans1.izvrsiTransakciju(2000);
         racunS.stampaj();
         racunN.stampaj();
    }
}
