package p25_08_2023;

public class UvodMetode2 {
    public static void main(String[] args) {

        String ime = "Milica";
        String prezime = "Radovanovic";
        boolean aktivan = true;

        printUser(ime + ", Nebojsa", prezime, aktivan);
        printUser("Petra", "Peric", false);
    }
    public static void printUser (String firstName, String lastName, boolean active) {
        if (active) {
            System.out.println("o ");
        } else {
            System.out.println("x ");
        }
        System.out.println(firstName + " " + lastName);

    }
    }



