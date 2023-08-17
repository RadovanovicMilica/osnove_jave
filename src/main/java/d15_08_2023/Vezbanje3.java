package d15_08_2023;

public class Vezbanje3 {
    public static void main(String[] args) {
//        •	Napisati program koji vrši grubu procenu koliko je vremena potrebno da se skine fajl.
//        Program od informacija čuva naziv fajla, veličinu fajla i brzinu skidanja.
//        Veličina fajla je u Mb a brzina skidanja u Mb/s.

        String fileName= "Profile_image.png";
        int size= 30;
        int downloadSpeed= 4;
        int estimatedTime= 10;

        System.out.println("File:" + fileName);
        System.out.println("Size:" + size + "Mb");
        System.out.println("Download speed:" + downloadSpeed + "Mb/s");
        System.out.println("Estimated Time:" + estimatedTime + "s");




    }
}
