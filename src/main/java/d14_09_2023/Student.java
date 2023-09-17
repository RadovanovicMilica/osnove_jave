package d14_09_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndexa;
    private String punoIme;
    private String tipStudija;
    private ArrayList <Ispit> ispiti;

    public Student(String brojIndexa, String punoIme, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }
    public String getBrojIndexa() {
        return brojIndexa;
    }
    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public String getPunoIme() {
        return punoIme;
    }
    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public String getTipStudija() {
        return tipStudija;
    }
    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }
    public void dodajIspit (Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double prosekOcena (){
       double prosek=0;
       for (Ispit ispit: this.ispiti) {
           prosek = prosek + ispit.getOcena();
           prosek= prosek  / this.ispiti.size();
       }
return prosek;
}

    public void stampaj (){
        System.out.println("Broj indeksa: " + this.brojIndexa);
        System.out.println("Ime i prezime studenta: " + this.punoIme);
        System.out.println("Tip studija: " + this.tipStudija);
        System.out.println("Predmeti: ");
        System.out.println("Naziv predmeta: " + this.ispiti.getClass() );
        System.out.println("Naziv predmeta: " + this.ispiti.getClass() );
        System.out.println("Naziv predmeta: " + this.ispiti.getClass() );
        System.out.println("Prosecna ocena: " + this.prosekOcena());
    }

}




