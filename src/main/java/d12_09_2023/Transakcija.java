package d12_09_2023;

public class Transakcija {
    private int iD;
    private Racun saKogSePrenosi;
    private Racun naKojiSePrenosi;


    public Transakcija() {
    }
    public Transakcija(int iD, Racun saKogSePrenosi, Racun naKojiSePrenosi) {
        this.iD = iD;
        this.saKogSePrenosi = saKogSePrenosi;
        this.naKojiSePrenosi = naKojiSePrenosi;
    }

    public double provizija(int iznosZaPrenos) {
        if (iznosZaPrenos < 4500) {
            return 45;
        } else {
            return 0.01 * iznosZaPrenos;
        }
    }
    public void izvrsiTransakciju (int zaPrenos){
        double ukupnoZaPrenos = zaPrenos + provizija(zaPrenos);
       this.saKogSePrenosi.skiniSaRacuna(ukupnoZaPrenos);
    }

    public void stampaj (){
        System.out.println(this.iD);
        System.out.println("Racun sa:" + this.saKogSePrenosi.getImeIPrezime() + this.saKogSePrenosi.getBroj());
        System.out.println("Racun na: " + this.naKojiSePrenosi.getImeIPrezime() + this.naKojiSePrenosi.getBroj());
//        System.out.println("Transakcija je: " + izvrsiTransakciju(saKogSePrenosi.skiniSaRacuna(naKojiSePrenosi.uplatiNaRacun()));
    }

    public int getiD() {
        return iD;
    }
    public void setiD(int iD) {
        this.iD = iD;
    }
    public Racun getSaKogSePrenosi() {
        return saKogSePrenosi;
    }
    public void setSaKogSePrenosi(Racun saKogSePrenosi) {
        this.saKogSePrenosi = saKogSePrenosi;
    }
    public Racun getNaKojiSePrenosi() {
        return naKojiSePrenosi;
    }
    public void setNaKojiSePrenosi(Racun naKojiSePrenosi) {
        this.naKojiSePrenosi = naKojiSePrenosi;
    }
}
