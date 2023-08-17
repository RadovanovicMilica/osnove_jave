package d15_08_2023;

public class Vezbanje7 {
    public static void main(String[] args) {

//        	Napisati program koji vrši grubu procenu koliko je vremena potrebno
//        	da se baterja na telefonu napuni do 100%. Program od informacija nudi:
//        -	Naziv telefona
//                -	Kapacitet baterije u mAh (miliamper sat)
//                -	Trenutna napunjenost baterije u %
//                -	Struja punjenja u mA (miliamper)

String phoneModel= "Iphone 11 pro max";
int batterycapacity= 3000;
int batteryLevel= 20;
int charging= 1000;
double maxcharging= batterycapacity / charging;
int missingBatteryLevel= 80;
double timeOfCharging= maxcharging * missingBatteryLevel / 100;


        System.out.println("Naziv telefona: " + phoneModel);
        System.out.println("Kapacitet baterije: " + batterycapacity + "mAh");
        System.out.println("Trenutna napunjenost baterije: " + batteryLevel + "%");
        System.out.println("Struja punjenja: " + charging + "mA");
        System.out.println("Procenjeno vreme punjenja: " + timeOfCharging + "h");



    }
}
