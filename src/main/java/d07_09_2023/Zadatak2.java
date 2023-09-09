package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Automobili naProdaju = new Automobili();
        naProdaju.marka= "Opel";
        naProdaju.model= "Zafira";
        naProdaju.godinaProizvodnje= 2009;

        Automobili kupljeni= new Automobili();
        kupljeni.marka= "Citroen";
        kupljeni.model= "C4 Picasso";
        kupljeni.godinaProizvodnje= 2015;

        Automobili zaOtpad= new Automobili();
        zaOtpad.marka= "Jugo";
        zaOtpad.model= "45";
        zaOtpad.godinaProizvodnje= 1985;

        System.out.println("Prodajem auto: " + naProdaju.marka + " " + naProdaju.model + " " + naProdaju.godinaProizvodnje + " godiste");
        System.out.println();

        System.out.println("Kupujem auto: " + kupljeni.marka + " " + kupljeni.model + " " +  kupljeni.godinaProizvodnje + " godiste");
        System.out.println();

        System.out.println("Prodajem auto za otpad: " + zaOtpad.marka + " " + zaOtpad.model + " " + zaOtpad.godinaProizvodnje + " godiste ");
    }
}
