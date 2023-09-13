package d11_09_2023;

public class FacebookPost {
    private String opis;
    private Korisnik objavljivac;

    public FacebookPost(){
    }
    public FacebookPost (String opis, Korisnik objavljivac){
        this.opis = opis;
        this.objavljivac = objavljivac;
    }


    public void stampaj (){
        System.out.println("Ime i prezime: " + this.objavljivac.getIme() + " " + this.objavljivac.getPrezime());
        System.out.println("Objava:" + this.opis);
    }
    public String getOpis (){
        return this.opis;
    }
    public void setOpis (String opis){
        this.opis = opis;
    }

    public Korisnik getObjavljivac (){
        return this.objavljivac;
    }
    public void setObjavljivac (Korisnik objavljivac){
        this.objavljivac= objavljivac;
    }
}
