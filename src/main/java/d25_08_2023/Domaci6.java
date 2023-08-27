package d25_08_2023;

public class Domaci6 {
    public static void main(String[] args) {
//        6.	Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        int brojM= 5;
        int brojN=10;


        System.out.println("Izmedju brojeva M i N ima " + funkcijaCelihBrojeva(brojM, brojN));



    } // kraj main

    public static int funkcijaCelihBrojeva (int brojM, int brojN) {

       int count = 0;
       for (int i=brojM + 1; i< brojN; i++) {
           count++;
       }
return count;





    } // kraj nove
}
