package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
Korpa korpa= new Korpa();

    StaklenaAmbalaza vino= new StaklenaAmbalaza("123456" , "Kovacevic",  0.7, 1.1, 100, true, 950  );
    Tetrapak jogurt= new Tetrapak("987654", "Moja Kravica", 1.0, 1.3, true, 85);
    Tetrapak mleko= new Tetrapak("258987", "Zbregov", 2.0, 2.3, true, 190);
    korpa.dodajAmbalazu(vino);
    korpa.dodajAmbalazu(jogurt);
    korpa.dodajAmbalazu(mleko);
    korpa.izbaciAmbalazu(vino);
   SuperKartica kartica= new SuperKartica("555-999", "Micke R.", 20);

   double ukupnaCenaSaPopustom= korpa.ukupnaCenaKorpe(new SuperKartica());

        System.out.println(ukupnaCenaSaPopustom);
    }
}
