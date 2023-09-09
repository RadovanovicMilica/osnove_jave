package d08_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaProizvodaUGramima;


    public void stampaj (){
        System.out.println(this.naziv + " " + this.cena + " RSD  " + this.tezinaProizvodaUGramima + " gr");

    } //kraj stampaj

    public void povecajCenu (double povecanje) {
    this.cena =this.cena + povecanje;
    } //kraj povecajCenu

    public double cenaSaPopustom (double popust) {

      double snizenaCena=  (cena *  popust) / 100;
      return  snizenaCena;
    } // kraj cenaSaPopustom

    public double racunajPostarinu (){
    double postarina= 0;

    if (this.tezinaProizvodaUGramima <= 100) {
        postarina=  200;
    } else if (this.tezinaProizvodaUGramima >100 || postarina <=500) {
        postarina= 400;
    } else if (this.tezinaProizvodaUGramima > 500) {
        postarina= 1000;
    }
return postarina;
    } // kraj racunajPostarinu
}





