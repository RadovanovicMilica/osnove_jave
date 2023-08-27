package d24_08_2023;

import java.util.ArrayList;

public class DomaciZadatak6 {
    public static void main(String[] args) {

//        6.	Napisati program koji vrsi proveru linkova sa stranice. Program cuva 3 niza:
//●	niz linkova
//●	niz ocekivanih status kodova za linkove iz prvog niza (expected status codes)
//●	niz status kodova koje vracaju linkovi iz prvog niza (actual status codes)
//
//        Nizovi potrebni za ovaj primer:
//●	linkovi
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/shop/
//○	https://cms.demo.katalon.com/account/
//○	https://cms.demo.katalon.com/cart/
//○	https://cms.demo.katalon.com/test/
//●	expected status codes
//○	200
//○	200
//○	404
//○	204
//○	200
//●	actual status codes
//○	200
//○	200
//○	400
//○	200
//○	404
//        Program za svaki link vrsi proveru ocekivane i dobijene vrednosti za status kod. Ukoliko se actual
//        i expected vrednosti ne poklapaju ispisati gresku u formatu:
//        Assertion Error: Link <link> expected status code <expected code> but got <actual code>
//        Primer izvrsenja:
//        Assertion Error: https://cms.demo.katalon.com/account/ expected 404 but got 400
//        Assertion Error: https://cms.demo.katalon.com/cart/ expected 204 but got 200
//        Assertion Error: https://cms.demo.katalon.com/test/ expected 200 but got 404

        ArrayList<String> nizLinkova= new ArrayList<>();
        nizLinkova.add("https://cms.demo.katalon.com/cart/");
        nizLinkova.add("https://cms.demo.katalon.com/shop/");
        nizLinkova.add("https://cms.demo.katalon.com/account/");
        nizLinkova.add("https://cms.demo.katalon.com/cart/");
        nizLinkova.add("https://cms.demo.katalon.com/test/");

        ArrayList<Integer> expectedStatusCodes= new ArrayList<>();
        expectedStatusCodes.add(200);
        expectedStatusCodes.add(200);
        expectedStatusCodes.add(404);
        expectedStatusCodes.add(204);
        expectedStatusCodes.add(200);

        ArrayList<Integer> actuslStatusCodes= new ArrayList<>();
        actuslStatusCodes.add(200);
        actuslStatusCodes.add(200);
        actuslStatusCodes.add(400);
        actuslStatusCodes.add(200);
        actuslStatusCodes.add(404);




       for (int i=0; i< nizLinkova.size(); i++){
           String link= nizLinkova.get(i);
           int expectedCode= expectedStatusCodes.get(i);
           int actualCode= actuslStatusCodes.get(i);

           if (expectedCode != actualCode) {
               System.out.println("Assertion Error: " + link + " " +  expectedCode + " but got " + actualCode);
           }

        }




    } // kraj main
}
