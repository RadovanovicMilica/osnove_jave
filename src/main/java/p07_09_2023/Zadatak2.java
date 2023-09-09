package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        SlackMessage message1 = new SlackMessage();
        message1.autor= "Micke Radovanovic";
        message1.date= "07-07-2023 22:00";
        message1.text= "Cao cao!";

        SlackMessage message2 = new SlackMessage();
        message2.autor= "Ilija Radovanovic";
        message2.date= "07-07-2023 22:00";
        message2.text= "Cao!";

        System.out.println(message1.autor + "-" + message1.date);
        System.out.println(message1.text);

        System.out.println();

        System.out.println(message2.autor + "-" + message2.date);
        System.out.println(message2.text);

    }

}
