package d15_08_2023;

public class Vezbanje1 {
    public static void main(String[] args) {

//        •	Napisati program koji za datu boju traži kontrastnu boju. Svaka boja se
//        sadrži od tri komponente RGB (red, green, blue).  Svaka komponenta boje je
//        u opsegu od 0 do 255 (informativno). Program nalazi kontrastnu boju tako što
//        svaku komponentu boje oduzme od 255.


        int originalR= 135;
        int originalG= 155;
        int originalB= 55;

        int contrastR= 255 - originalR;
        int contrastG= 255 - originalG;
        int contrastB= 255 - originalB;

        System.out.println("originalR");
        System.out.println("Originalna boja: RGB ("+ originalR +", "+ originalG +" , "+ originalB +")");
        System.out.println("Kontrastna boja: RGB ("+ contrastR +", "+ contrastG +", "+ contrastB +")");





    }
}
