package d18_09_2023;

public class QualityOptimizerControl extends Control {
    private double brzinaNeta;

    public QualityOptimizerControl(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }
    public double getBrzinaNeta() {
        return brzinaNeta;
    }
    public void setBrzinaNeta(double brzinaNeta) {
        this.brzinaNeta = brzinaNeta;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        double kvalitet= videoPlayer.getKvalitet();
   kvalitet= this.brzinaNeta * 10.1;
   if (this.brzinaNeta==20){
       kvalitet=240;
   } else if (this.brzinaNeta== 5) {
       kvalitet=144;
   } else if (this.brzinaNeta== 50) {
       kvalitet=720;
   }

    }
}
