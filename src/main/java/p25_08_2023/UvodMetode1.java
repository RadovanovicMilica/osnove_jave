package p25_08_2023;

public class UvodMetode1 {
    public static void main(String[] args) {

        String ime= "Milica";
        String prezime= "Radovanovic";

        printUser("Milica" , "Radovanovic", true); // prosledjene vrednosti (parametri)


    } // kraj main


    public static void printUser (String firstName, String lastName, boolean active) {
    if (active) {
    System.out.println("o");
    } else {
    System.out.println("x");
}
        System.out.println(firstName + " " + lastName);
    }
}
