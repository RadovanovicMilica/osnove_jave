package p08_09_2023;

public class SmartAirConditioning {
    public String marka;
    public int potrosnjaStrujeHladjenje;
    public int potrosnjaStrujeGrejanje;
    public int temperatura;
    public String mod;

    public void stampa (){
        System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura);
    } // kraj stampe

    public double mesecnaPotrosja () {
        double potrosnja= 0;

        if (this.mod.equals("hladi") ) {
          potrosnja = potrosnja + (30.0 * 15 * this.potrosnjaStrujeHladjenje);
        } else if (this.mod.equals("greje")) {
            potrosnja = potrosnja + (30.0 * 15 * this.potrosnjaStrujeGrejanje);
        }
        return potrosnja;

    } // kraj mesecnePotrosnje
    public double mesecniRacun () {

        double cena = 0;
        double potrosnja= this.mesecnaPotrosja();
//int zelena = 350;
//int plava = zelena ++;
        if(potrosnja <= 350) {
            cena = potrosnja * 6;
        } else if (potrosnja > 350) {
            cena = (350 * 6) + ((potrosnja-350) * 9);
        }
return cena;

    } // kraj racun
}

//    metodu koja racuna koliko klima novca potrosi za mesec dana
//Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//        Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//        Metoda vraca ukupnu cenu za taj mesec
