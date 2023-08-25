package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi3 {
    public static void main(String[] args) {
        ArrayList<Integer> broj = new ArrayList<>();

        broj.add (5);
        broj.add (10);
        broj.add (15);
        broj.add (20);
        broj.add (25);
//        0, 1, 2, 3, 4, 5, ...
        for (int i=0;i <= broj.size(); i++) {
//        for (int i=0;i <= 6; i++)
           int x= broj.get(i);
            System.out.println(x + ",");

    }

} }
