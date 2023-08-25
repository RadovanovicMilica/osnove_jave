package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {

        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<Boolean> required = new ArrayList<>();

        inputs.add ("First Name");
        inputs.add ("First Name");
        inputs.add ("First Name");
        inputs.add ("First Name");


        required.add (true);
        required.add (true);
        required.add (true);
        required.add (false);
        required.add (false);

        for (int i=0; i< inputs.size(); i++){
            System.out.print(inputs.get(i) + ":");
            if (required.get (i)) {
                System.out.print("*");
            }
            System.out.println("___________");
        }


    }
}
