package d12_09_2023;

public class FizickoLice {

    private String imeIPrezime;
    private String licnaKarta;
    private String jmbg;
    private boolean ranijeKupovao;

    public FizickoLice (){
    }
    public FizickoLice(String imeIPrezime, String licnaKarta, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.licnaKarta = licnaKarta;
        this.jmbg = jmbg;
    }

    public void stampaj (){
        System.out.println(this.imeIPrezime + this.licnaKarta);
    }



    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public String getLicnaKarta() {
        return licnaKarta;
    }
    public String getJmbg() {
        return jmbg;
    }
    public boolean isRanijeKupovao() {
        return ranijeKupovao;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void setLicnaKarta(String licnaKarta) {
        this.licnaKarta = licnaKarta;
    }
    public void setRanijeKupovao(boolean ranijeKupovao) {
        this.ranijeKupovao = ranijeKupovao;
    }
}
