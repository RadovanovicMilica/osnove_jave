package d19_09_2023;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> clanoviDoma;

    public PlaninarskiDom() {
        ArrayList<Planinar> planinari= new ArrayList<>();
    }
    public PlaninarskiDom(String naziv, int godinaOsnivanja, ArrayList<Planinar> clanoviDoma) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.clanoviDoma = clanoviDoma;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }
    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }
    public ArrayList<Planinar> getClanoviDoma() {
        return clanoviDoma;
    }
    public void setClanoviDoma(ArrayList<Planinar> clanoviDoma) {
        this.clanoviDoma = clanoviDoma;
    }
    public void uclaniPlaninara(Planinar planinar){
        clanoviDoma.add(planinar);
    }
    public int brojUspesnihPlaninara(Planina planina){
    int broj=0;
    for(int i=0; i< clanoviDoma.size(); i++){
        Planinar planinar= clanoviDoma.get(i);
    if(planinar.uspesanUspon(planina)){
        broj++;
    }
}
        return broj;

    }
    public void izbaciPlaninara(int identifikacioniBroj){
    for(int i=0; i< this.clanoviDoma.size(); i++){
        Planinar planinar= this.clanoviDoma.get(i);
        if (planinar.getiD()==identifikacioniBroj){
            this.clanoviDoma.remove(i);
            return;
        }
    }
    }
    public double mesecniPrihod(){
        double zarada=0;
        for (Planinar planinar: clanoviDoma){
            zarada= zarada + planinar.clanarina();
        }
        return zarada;
    }
    public void stampaj(){
        System.out.println("Naziv planinarskog doma: " + this.naziv + " Godina osnivanja : " + this.godinaOsnivanja);
        System.out.println("Clanovi planinarskog doma: " + this.clanoviDoma);
       for(Planinar planinar: clanoviDoma){
           System.out.println(planinar);
       }
    }


}
