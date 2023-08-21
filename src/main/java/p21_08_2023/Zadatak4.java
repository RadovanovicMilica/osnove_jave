package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju

//        prod=1
//        prod= prod *2 =1*2=2
//        prod= prod *2 =1*2=2
//        prod= prod *2 =2*2=4
//        prod= prod *2 =4*2=8
//        prod= prod *2 =8*2=16
//        prod= prod *2 =16*2=32
//        prod= prod *2 =32*2=64
//        prod= prod *2 =64*2=128

        int osnova= 2;
        int stepen = 7;
        int prod= 1;
        for (int i=0; i<7; i ++){
            prod= prod * osnova;
        }
        System.out.println(stepen + " broja " + osnova + " je " + prod);
    }
}
