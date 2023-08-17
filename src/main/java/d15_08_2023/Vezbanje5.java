package d15_08_2023;

public class Vezbanje5 {
    public static void main(String[] args) {


        String originalImage= "Profile-image.png";
        int height= 1920;
        int width= 1080;
        int resolution= height * width;
        double sizeKb= resolution / 1024.0;
        double sizeMb= sizeKb / 1024;

        String newImage="Resized-profile-image.png";
        double scale1= 1.3 ;
        double newResolution1= 2496 * 1404;
        double sizeNewKb= newResolution1 / 1024.0;
        double sizeNewMb= sizeNewKb / 1024;

        String newImage2= "Resized_profile_image.png";
        double scale2= 0.8;
        double newResolution2= 1536*864;
        double sizeNew1Kb= newResolution2 / 1024.0;
        double sizeNew1Mb= sizeNew1Kb / 1024;


        System.out.println("Original image: " + originalImage);
        System.out.println("Size: " + sizeMb + "Mb");
        System.out.println("Scale: " + scale1);
        System.out.println("Resized image: " + newImage);
        System.out.println("Size: " + sizeNewMb  + "Mb");
        System.out.println(" ");
        System.out.println("Original image: " + originalImage);
        System.out.println("Scale: " + scale2);
        System.out.println("Resized image: " + newImage2);
        System.out.println("Size: " + sizeNew1Mb + "Mb");


    }
}
