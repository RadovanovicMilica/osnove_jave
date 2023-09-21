package d18_09_2023;

public class VideoPlayer {

    private double trenutnoVreme;
    private double duzina;
    private double jacina;
    private int kvalitet;

    public VideoPlayer() {
    }

    public VideoPlayer(double trenutnoVreme, double duzina, double jacina, int kvalitet) {
        this.trenutnoVreme = trenutnoVreme;
        this.duzina = duzina;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }

    public double getTrenutnoVreme() {
        return trenutnoVreme;
    }
    public void setTrenutnoVreme(double trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }
    public double getDuzina() {
        return duzina;
    }
    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }
    public double getJacina() {
        return jacina;
    }
    public void setJacina(double jacina) {
        this.jacina = jacina;
    }
    public int getKvalitet() {
        return kvalitet;
    }
    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

    public void stampaj (){
        System.out.println("Treutno vreme: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacina);
        System.out.println("Kvalitet: " + this.kvalitet);
    }
}




