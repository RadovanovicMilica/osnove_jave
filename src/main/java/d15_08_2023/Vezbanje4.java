package d15_08_2023;

public class Vezbanje4 {
    public static void main(String[] args) {

        String file="Summer_photo.log";
       int height= 1920;
       int width= 1080;
       int resolution= height * width;
       double sizeKb= resolution / 1024.0;
       double sizeMb= sizeKb / 1024;

        System.out.println("File:" + " " + file);
        System.out.println("Resolution:" + width + "x" + height);
        System.out.println("Size: "  + sizeKb + "Kb");
        System.out.println("Size: " + sizeMb + "Mb");





    }
}
