package d12_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        FizickoLice Micke= new FizickoLice("Micke" , "012525", "0501989");
        FizickoLice Nada = new FizickoLice("Nada", "0800986", "2801986");


        Ugovor zaStan = new Ugovor("05.08.2023.", Micke, Nada, 50000, "Vrsacka 18, NS");


        zaStan.stampaj();

    }
}
