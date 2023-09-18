package d15_09_2023;

public class Trener extends Osoba{
    private int godineIskustva;
    private String trenerskaPozicija;

    public Trener (){
    }
    public Trener(int godineIskustva, String trenerskaPozicija) {
        this.godineIskustva = godineIskustva;
        this.trenerskaPozicija = trenerskaPozicija;
    }
    public Trener(String punoIme, String jmbg, int godinaRodjenja, int godineIskustva, String trenerskaPozicija) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.trenerskaPozicija = trenerskaPozicija;
    }
    @Override
    public void stampaj (){
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Pozicija trenera: " + this.trenerskaPozicija);
        System.out.println();
    }
}


