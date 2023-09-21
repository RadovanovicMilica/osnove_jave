package d19_09_2023;

public class RekreativniPlaninar extends Planinar{
private int tezinaOpreme;
private String okrug;
private double maxUsponBezOpreme;
    public RekreativniPlaninar(int iD, String punoIme) {
        super(iD, punoIme);
    }

    @Override
    public double clanarina() {
        int clanarinaRekreativca=1000;
        return clanarinaRekreativca;
    }
    @Override
    public boolean uspesanUspon(Planina planina) {
        boolean daLiCeSePopeti= false;
        double rezultatZaZadatuPlaninu=0;
        if(this.maxUsponBezOpreme < planina.getVisina()){
          daLiCeSePopeti= false;
        } else if (this.maxUsponBezOpreme > planina.getVisina()) {
            rezultatZaZadatuPlaninu= planina.getVisina() - (this.tezinaOpreme * 50);
        } if (rezultatZaZadatuPlaninu < planina.getVisina()){
            daLiCeSePopeti= false;
        }else if (rezultatZaZadatuPlaninu > planina.getVisina()){
            daLiCeSePopeti = true;
        }
        return daLiCeSePopeti ;
    }
    @Override
    public void stampaj() {
        System.out.println("Rekreativac " + this.getiD());
        System.out.println("Ime i prezime: " + getPunoIme());
        System.out.println("Okrug: " + this.okrug);

    }
}
