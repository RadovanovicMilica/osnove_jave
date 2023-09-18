package d15_09_2023;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private boolean kapitenskaTitula;

    public Igrac (){
    }
    public Igrac(int broj, String pozicija, boolean kapitenskaTitula) {
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapitenskaTitula = kapitenskaTitula;
    }
    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapitenskaTitula) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapitenskaTitula = kapitenskaTitula;
    }
    public int getBroj() {
        return broj;
    }
    public void setBroj(int broj) {
        this.broj = broj;
    }
    public String getPozicija() {
        return pozicija;
    }
    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }
    public boolean isKapitenskaTitula() {
        return kapitenskaTitula;
    }
    public void setKapitenskaTitula(boolean kapitenskaTitula) {
        this.kapitenskaTitula = kapitenskaTitula;
    }
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Broj koji igrac nosi: " + this.broj);
        System.out.println("Pozicija igraca: " + this.pozicija);
        System.out.println("Kapitesnska titula: " + this.kapitenskaTitula);
        System.out.println();
    }
}


