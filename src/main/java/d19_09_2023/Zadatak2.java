package d19_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
PlaninarskiDom dom = new PlaninarskiDom();
dom.setNaziv("Gorski vuk");
dom.setGodinaOsnivanja(1989);
dom.setClanoviDoma(new ArrayList<>());

RekreativniPlaninar r1 = new RekreativniPlaninar(1, "Micke R.");
RekreativniPlaninar r2= new RekreativniPlaninar(2, "Ilija R.");
RekreativniPlaninar r3= new RekreativniPlaninar(3, "Ivana V.");

Alpinista a1= new Alpinista(1, "Janko G.");
Alpinista a2= new Alpinista(2, "Mira U.");
Alpinista a3= new Alpinista(3, "Hana R.");

dom.uclaniPlaninara(r1);
dom.uclaniPlaninara(r2);
dom.uclaniPlaninara(r3);

dom.uclaniPlaninara(a1);
dom.uclaniPlaninara(a2);
dom.uclaniPlaninara(a3);

dom.izbaciPlaninara(a2.getiD());

dom.stampaj();
r1.stampaj();
r2.stampaj();
r3.stampaj();
a1.stampaj();
a2.stampaj();
a3.stampaj();

    }
}
