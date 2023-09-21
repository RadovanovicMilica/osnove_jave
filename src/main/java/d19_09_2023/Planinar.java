package d19_09_2023;

public abstract class Planinar {
    private int iD;
    private String punoIme;
    public Planinar(int iD, String punoIme) {
        this.iD = iD;
        this.punoIme = punoIme;
    }
    public int getiD() {
        return iD;
    }
    public String getPunoIme() {
        return punoIme;
    }
    public abstract void stampaj();
    public abstract double clanarina ();
    public abstract boolean uspesanUspon(Planina planina);

}
