package d12_09_2023;

public class ZeleniKarton {
    private String imeStudenta;
    private String brojIndexa;
    private String nazivPredmeta;
    private String imeProfesora;
    private int ocena;


    public ZeleniKarton (){
    }
    public ZeleniKarton(String imeStudenta, String brojIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
        this.imeStudenta = imeStudenta;
        this.brojIndexa = brojIndexa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public boolean daLiJeIspitPolozen (){
       boolean polozenIspit= false;
        if (ocena > 5){
            polozenIspit= true;
        }
        return polozenIspit;
    }

    public void stampaj (){
        System.out.println("Naziv predmeta: " + this.nazivPredmeta + " ocena: " + this.ocena);
        System.out.println("Strudnet: " + this.imeStudenta + ", " + this.brojIndexa);
        System.out.println("Profesor: " + this.imeProfesora);
        System.out.println("");
    }

    public String getImeStudenta() {
        return imeStudenta;
    }
    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }
    public String getBrojIndexa() {
        return brojIndexa;
    }
    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }
    public String getImeProfesora() {
        return imeProfesora;
    }
    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }
    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
