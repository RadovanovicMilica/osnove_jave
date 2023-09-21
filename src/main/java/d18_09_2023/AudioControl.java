package d18_09_2023;

public class AudioControl extends Control{
    private boolean zvukPlusMinus;
    public AudioControl() {
    }
    public AudioControl(boolean zvukPlusMinus) {
        this.zvukPlusMinus = zvukPlusMinus;
    }
    public boolean isZvukPlusMinus() {
        return zvukPlusMinus;
    }
    public void setZvukPlusMinus(boolean zvukPlusMinus) {
        this.zvukPlusMinus = zvukPlusMinus;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int noviZvuk=0;
        if (zvukPlusMinus == true){
            noviZvuk+=1;
            if (noviZvuk> 100){
                noviZvuk=100;
            }
        } else {
            noviZvuk-=1;
            if (noviZvuk< 0)
                noviZvuk=0;
        }
    }
}
