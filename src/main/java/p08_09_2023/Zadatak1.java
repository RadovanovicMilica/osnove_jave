package p08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        SlackMessage message1 = new SlackMessage();
        message1.autor= "Micke Radovanovic";
        message1.date= "07-07-2023 22:00";
        message1.text= "Cao cao!";


        SlackMessage message2 = new SlackMessage();
        message2.autor= "Ilija Radovanovic";
        message2.date= "07-07-2023 22:00";
        message2.text= "Cao!";


        message1.stampa();
        message2.stampa();
        message1.update("Novi tekst" , "09-09-2023 19:00");
        message1.text= "Novi text";
        message1.lastUpdateAt = "";
       String convertedInfo= message1.converToString();
        System.out.println(convertedInfo);

    }
}
