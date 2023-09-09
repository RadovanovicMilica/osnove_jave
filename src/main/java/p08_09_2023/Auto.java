package p08_09_2023;

public class Auto {
    public String vozac;
    public String marka;
    public int brojVrata;
    public double potrosnjaNa100km;
    public int trenutnaBrzina;
   public int registrovanDo;
   public int godinaProizvodnje;
   public int kubikaza;
   public String registracija;
    public boolean ukljucenaKlima;
    public int maximalnaBrzina;

    public void stampaj() {
        System.out.println(this.vozac);
        System.out.println(this.marka + " - " + this.brojVrata + "ro vrata");
        System.out.println("Sa potrosnjom od " + this.potrosnjaNa100km + " l na 100km");
        System.out.println("Trenutna brzina je " + this.trenutnaBrzina);
        System.out.println("Cena registracije " + this.cenaRegistracije());
        System.out.println("Old timer" + this.oldTimer());
    }

    public boolean jePrekoracio(int ogranicenje) {
        return this.trenutnaBrzina > ogranicenje;

    }
//83,80=>3*1000
    public int kazna(int ogranicenje) {
        if (this.jePrekoracio(ogranicenje)) {
            return (this.trenutnaBrzina - ogranicenje) * 1000;
        } return 0;
        }

public boolean oldTimer(){
        return this.godinaProizvodnje < 1950;

//drugi nacin je ovo:
//        if (this.godinaProizvodnje < 1950) {
//            return  true;
//        } else  {
//            return  false;
//        }
}
        public boolean registrovan (int trenutniMesec) {
            return this.registrovanDo < trenutniMesec;
//            if (this.registrovanDo < trenutniMesec) {
//                return true;
//            } else {
//                return false;
//            }
        }
        public double cenaRegistracije() {
            double cena = this.kubikaza * 100;
               if (this.kubikaza > 2000) {
                   cena = cena * 1.3;
               }
               return cena;
            }

    public void dodajGas() {
        this.trenutnaBrzina = this.trenutnaBrzina + 10;
        if (this.trenutnaBrzina > this.maximalnaBrzina) {
            this.trenutnaBrzina = this.maximalnaBrzina;
        }
    }
    public void koci() {
        this.trenutnaBrzina = this.trenutnaBrzina - 10;
        if (this.trenutnaBrzina <0) {
            this.trenutnaBrzina=0;
        }
    }
    public double racunajFakotrKlime () {
        double faktorKlile= 1.0;
        if (this.ukljucenaKlima) {
            faktorKlile = 1.2;
        }
        return faktorKlile;
    }

    public double trenutnaPotrosnja() {
    return this.trenutnaBrzina / 100.0 *
        this.potrosnjaNa100km * this.racunajFakotrKlime();

    }
    public void  stampajTablu () {
        int crtice = this.trenutnaBrzina * 100 / this.maximalnaBrzina;
        for (int i=0; i<100; i++) {
            if (i < crtice) {
                System.out.print("|");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(this.trenutnaBrzina + " / " + this.maximalnaBrzina + "km/h" );
    }
}
