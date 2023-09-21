package d18_09_2023;

public class TimeControl extends Control{
    private boolean videoNapredNazad;
    public TimeControl() {
    }
    public TimeControl(boolean videoNapredNazad) {
        this.videoNapredNazad = videoNapredNazad;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double novoVreme=0;
        if (videoNapredNazad== true){
            novoVreme= videoPlayer.getTrenutnoVreme() + 15;
            if (novoVreme <0){
                novoVreme = 0;
            }
        } else {
            novoVreme= videoPlayer.getTrenutnoVreme()-15;
            if (novoVreme > videoPlayer.getDuzina()){
                novoVreme= videoPlayer.getDuzina();
            }
        }
    }
}
