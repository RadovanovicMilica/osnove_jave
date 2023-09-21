package d19_09_2023;

public class Alpinista extends Planinar{
    private int poeni;

    public Alpinista(int iD, String punoIme) {
        super(iD, punoIme);
    }

    @Override
    public double clanarina() {
        int pocetnaClanarina=1500;
        int clanarinaSaPopustom= pocetnaClanarina - (this.poeni * 50);
        return clanarinaSaPopustom;
    }
    @Override
    public boolean uspesanUspon(Planina planina) {
       boolean daLiCeUspeti= false;
        int savladaniUsponi=4000;
        if(savladaniUsponi < planina.getVisina()){
            daLiCeUspeti = true;
        }else {
            daLiCeUspeti= false;
        }

        return daLiCeUspeti;
    }
    @Override
    public void stampaj() {
        System.out.println("Alpinista: " + getiD() );
        System.out.println("Ime i prezime: " + getPunoIme());
        System.out.println("Ostvareni poeni: " + this.poeni);
    }
}
