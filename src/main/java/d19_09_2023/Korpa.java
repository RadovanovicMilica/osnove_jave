package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> nizAmbalaza;

    public Korpa() {
       this.nizAmbalaza= new ArrayList<>();
    }

    public void dodajAmbalazu(Ambalaza ambalaza){
        nizAmbalaza.add(ambalaza);
    }
    public void izbaciAmbalazu(Ambalaza ambalaza){
        nizAmbalaza.remove(ambalaza.getBarkod());
    }
    private double ukupnaCenaSaPopustom( double popust){
        double ukupnaCenaPopust=0;
        for(Ambalaza ambalaza: nizAmbalaza){
            double cenaAmbalaze= ambalaza.cena();
            if(popust >0){
                cenaAmbalaze-=popust;
            }
          ukupnaCenaPopust+= cenaAmbalaze;
        }
        return ukupnaCenaPopust;
    }
    public double ukupnaCenaKorpe (SuperKartica superKartica){
    double ukupnaCena=0;
     for (Ambalaza ambalaza: nizAmbalaza){
         double cenaAmbalaze= ambalaza.cena();
         if (superKartica.getPopust() > 0){
             cenaAmbalaze = cenaAmbalaze - superKartica.getPopust();
         }
         ukupnaCena = ukupnaCena + cenaAmbalaze;
     }
    return ukupnaCena;
    }

}
