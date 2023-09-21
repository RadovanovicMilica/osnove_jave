package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza {
private int cenaKaucije;
private boolean daLiSePlacaKaucija;
private int osnovnaCenaS;

    public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, int cenaKaucije, boolean daLiSePlacaKaucija, int osnovnaCenaS) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.cenaKaucije = cenaKaucije;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCenaS = osnovnaCenaS;
    }

    public int getCenaKaucije() {
        return cenaKaucije;
    }
    public void setCenaKaucije(int cenaKaucije) {
        this.cenaKaucije = cenaKaucije;
    }
    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }
    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }
    public int getOsnovnaCenaS() {
        return osnovnaCenaS;
    }
    public void setOsnovnaCenaS(int osnovnaCenaS) {
        this.osnovnaCenaS = osnovnaCenaS;
    }
    @Override
    public double cena() {
        double cenaS=0;
        if(this.daLiSePlacaKaucija == true){
            cenaS = this.osnovnaCenaS * 1.2 * this.cenaKaucije;
        } else if (this.daLiSePlacaKaucija == false) {
            cenaS = this.osnovnaCenaS * 1.2;
        }
        return cenaS;
    }
    @Override
    public void stampaj() {
        System.out.println(getBarkod() + " " + getNaziv() + " " + tezina() );
        System.out.println("Cena kaucije za fla]u: " + this.cenaKaucije);
        System.out.println("Da li se placa kaucija? " + this.daLiSePlacaKaucija);
        System.out.println("Cena proizvoda je: " + cena());

    }
}
