package p07_09_2023;

public class uvodOOP {
    public static void main(String[] args) {


        User m = new User();
        m.ime= "Milica";
        m.email= "mickebgbd5@gmail.com";
m.starost= 30;


        User p = new User();
p.ime= "Ilija";
p.email= "ilija009";
p.starost= m.starost + 3;

m.stampaj();
p.stampaj();

        System.out.println("ime:" + m.ime);
        System.out.println("email: "+ m.email);
        System.out.println("starost: " + m.starost);

        System.out.println("ime:" + p.ime);
        System.out.println("email: "+ p.email);
        System.out.println("starost: " + p.starost);

    }

//    public static void stampajUsera (String ime, String email, int starost ) {
//        System.out.println("Ime " + ime);
//        System.out.println("Email" + email);
//        System.out.println("Starost: " + starost);
//    }
}
