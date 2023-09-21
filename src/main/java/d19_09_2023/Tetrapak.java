package d19_09_2023;

public class Tetrapak  extends Ambalaza {
    private boolean reciklaza;
    private int osnovnaCenaT;

    public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean reciklaza, int osnovnaCenaT) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.reciklaza = reciklaza;
        this.osnovnaCenaT = osnovnaCenaT;
    }
    public boolean isReciklaza() {
        return reciklaza;
    }
    public void setReciklaza(boolean reciklaza) {
        this.reciklaza = reciklaza;
    }
    public int getOsnovnaCenaT() {
        return osnovnaCenaT;
    }
    public void setOsnovnaCenaT(int osnovnaCenaT) {
        this.osnovnaCenaT = osnovnaCenaT;
    }

    @Override
    public double cena() {
        double cenaT = 0;
        if (this.reciklaza == true) {
            cenaT = tezina() * 1.5 * this.osnovnaCenaT;
        } else if (this.reciklaza == false) {
            cenaT = this.osnovnaCenaT;
        }
        return cenaT;

    }

    @Override
    public void stampaj() {
        System.out.println("Da li je proizvod pogodan za reciklazu? " + this.reciklaza);
        System.out.println("Osnovna cena proizvoda je: " + this.osnovnaCenaT);
        System.out.println("Cena proizvoda je: " + cena());

    }
}