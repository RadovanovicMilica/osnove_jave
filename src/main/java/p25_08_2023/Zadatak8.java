package p25_08_2023;

public class Zadatak8 {
    public static void main(String[] args) {
//        Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//        Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.

int a= konvertuj("I");
        System.out.println(a);
        int b= konvertuj("V");
        System.out.println(b);


    } // kraj main
public static int konvertuj (String rimski) {
        int arapski=0;
        if (rimski.equals("I")) {
            arapski = 1;
        } else if (rimski.equals("II")) {
            arapski = 2;
        }else if  (rimski.equals("III")) {
            arapski = 3;
        }else if  (rimski.equals("IV")) {
            arapski = 4;
        }else if  (rimski.equals("V")) {
                         arapski = 5;
                     }
        return arapski;
             }
         }