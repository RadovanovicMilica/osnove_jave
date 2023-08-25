package p24_08_2023;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("FORD");
        cars.add("MAZDA");

        String x1= cars.get(0); //vrednost ce biti bmw
        String x2= cars.get(1); // vrednost ce biti ford
        String x3= cars.get(2); // vrednost ce biti mazda

        cars.set(2, "Nissan");

        System.out.println("KRAJ");

    } // kraj main
} // kraj class
