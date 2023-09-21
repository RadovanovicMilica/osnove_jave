package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer pesma= new VideoPlayer();
        pesma.setDuzina(500);
        TimeControl vreme=new TimeControl(true);
        AudioControl zvuk= new AudioControl(false);
        QualityOptimizerControl qualityOptimizerControl= new QualityOptimizerControl(50);

        vreme.izvrsiAkciju(pesma);
        zvuk.izvrsiAkciju(pesma);
        qualityOptimizerControl.izvrsiAkciju(pesma);

        pesma.setTrenutnoVreme(0);
        pesma.setJacina(250);
        pesma.setKvalitet(50);

        pesma.stampaj();
    }
}
