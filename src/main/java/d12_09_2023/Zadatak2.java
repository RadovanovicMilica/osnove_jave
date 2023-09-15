package d12_09_2023;

import p11_09_2023.Student;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

        ArrayList <ZeleniKarton> listaStudenata= new ArrayList<>();
        ZeleniKarton student = new ZeleniKarton();

       listaStudenata.add(new ZeleniKarton("Micke", "50/08", "Ekogeomorfologija", "Slavoljub", 8)) ;
       listaStudenata.add(new ZeleniKarton("Ivana", "42/08", "Ekogeomorfologija", "Slavoljub", 7)) ;
       listaStudenata.add(new ZeleniKarton("Aca", "35/08", "Ekogeomorfologija", "Slavoljub", 9)) ;
       listaStudenata.add(new ZeleniKarton("Dijana", "08/08", "Ekogeomorfologija", "Slavoljub", 5)) ;
       listaStudenata.add(new ZeleniKarton("Ana", "24/08", "Ekogeomorfologija", "Slavoljub", 8)) ;

        double zbirnaOcena=0.0;
        int brojOcena=0;

        for (int i=0; i<listaStudenata.size(); i++){
        student =listaStudenata.get(i);
        int ocena= student.getOcena();
        zbirnaOcena= zbirnaOcena + ocena;

        brojOcena++;
       student.stampaj();
}
        double prosek= zbirnaOcena / brojOcena;
        System.out.println("Prosecna ocena za sve studente je: "+ prosek);


    }
}