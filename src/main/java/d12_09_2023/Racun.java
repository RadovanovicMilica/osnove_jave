package d12_09_2023;

public class Racun {
     private String broj;
     private String imeIPrezime;
     private double stanje;


     public Racun (){
     }
     public Racun (String broj, String imeIPrezime, int stanje){
         this.broj=broj;
         this.imeIPrezime=imeIPrezime;
         this.stanje=stanje;
     }

     public void uplatiNaRacun (double iznos){
         this.stanje = this.stanje + iznos;
     }

     public void skiniSaRacuna (double iznosZaSkidanje){
         this.stanje= this.stanje - iznosZaSkidanje;
     }

     public void stampaj (){
         System.out.println(this.imeIPrezime + " " + this.broj);
         System.out.println("Stanje na racunu je: " + this.stanje + "rsd");
     }


    public String getBroj() {
        return broj;
    }
    public void setBroj(String broj) {
        this.broj = broj;
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public double getStanje() {
        return stanje;
    }
}
