package d12_09_2023;

public class Ugovor {
    private String datumSklapanja;
    private FizickoLice kupac;
    private FizickoLice prodavac;
    private int cena;
    private String adresa;

    public Ugovor(String datumSklapanja, FizickoLice kupac, FizickoLice prodavac, int cena, String adresa) {
        this.datumSklapanja = datumSklapanja;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.cena = cena;
        this.adresa = adresa;
    }

    public double procenatZarade (int cena){
        double provizija=0;
        if (kupac.isRanijeKupovao()){
            provizija = 0.02;
        } else {
            provizija= 0.03;
        }
        return  provizija;
    }

    public double agencijskaZarada (){
     double provizia=procenatZarade(cena );
      double zarada= 1000 + cena * provizia;
      return zarada;
    }

    public void stampaj(){
        System.out.println("Dana " + datumSklapanja + " godine, sklopljen je Ugovor izmedju " +
                            this.prodavac.getImeIPrezime() + " i " + this.kupac.getImeIPrezime()  +
                            " o kupovini nekretnine na adresi " + adresa + " po ceni od " + cena +
                           " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost  u iznosu od " + agencijskaZarada());
    }
}
