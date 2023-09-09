package p08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 3.6 litra)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//[Vozac]
//	[Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//                [Trenutna brzina auta] km/h je trenutna brzina.

        Auto auto= new Auto();
        auto.vozac= "Marko Markovic";
        auto.marka= "Citroen";
        auto.brojVrata= 5;
        auto.potrosnjaNa100km= 5.4;
        auto.trenutnaBrzina = 70;
        auto.kubikaza= 2000;
        auto.registrovanDo = 9;
        auto.godinaProizvodnje= 1950;
        auto.registracija= "NS-258-NM";
        auto.ukljucenaKlima= true;
        auto.maximalnaBrzina= 240;

auto.stampaj();

        if (auto.jePrekoracio(80)){
        System.out.println("Prekoracio je brzinu od 80");
        System.out.println("Kazna je " + auto.kazna(80));
        }else  {
        System.out.println("Nije prekoracio ogranicenje od 80");
}
        if (auto.oldTimer()) {
            System.out.println("Auto je old timer.");
        }

        if (auto.registrovan(9)) {
            System.out.println("Jos uvek vazi registracija");
        } else {
            System.out.println("Registracija je istekla");
        }

        System.out.println("Cena registracije " + auto.cenaRegistracije());

        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();
        auto.dodajGas();

        auto.koci();

        System.out.print("Trenutna potrosnja " + auto.trenutnaPotrosnja());

        auto.stampajTablu();
    }
}
