package d07_09_2023;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Zadatk3 {
    public static void main(String[] args) {

        Proizvod naAkciji = new Proizvod();
        naAkciji.naziv = "Burek";
        naAkciji.cena = 115.5;

        Proizvod nemaNaStanju= new Proizvod();
        nemaNaStanju.naziv = "Kifla";
        nemaNaStanju.cena = 40.7;

        Proizvod istekaoRok = new Proizvod();
        istekaoRok.naziv = "Jogurt";
        istekaoRok.cena = 35.0;


        System.out.println("Trenutno na akciji imamo: " + naAkciji.naziv + " " + naAkciji.cena + " RSD");
        System.out.println();
        System.out.println("Jos malo pa nestalo : " + nemaNaStanju.naziv + " " + nemaNaStanju.cena + " RSD");
        System.out.println();
        System.out.println("Akcija zbog skorog isteka roka: " + istekaoRok.naziv + " " + istekaoRok.cena + " RSD");
    }
}
