package d15_08_2023;

public class Vezbanje6 {
    public static void main(String[] args) {

        String videoName= "Tea Tairovic- Bibi Habibi (Official video| album Balerina)";
        int duration= 149;
        int falesPerSecond= 20;
        int height= 1920;
        int width= 1080;
        int resolution= height * width;
        double sizeKb= resolution / 1024.0;
        double sizeMb= sizeKb / 1024;
        double minNetworkSpeed= sizeMb * falesPerSecond;

        System.out.println(videoName);
        System.out.println(duration);
        System.out.println("Number of frames per second: " + falesPerSecond);
        System.out.println("Resolution: " + height + "x" + width);
        System.out.println("Minimal network speed: " + minNetworkSpeed + "Mb/s");

    }
}
