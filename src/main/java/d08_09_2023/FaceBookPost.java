package d08_09_2023;

public class FaceBookPost {
    public String imeIPrezimeObjavljivaca;
    public String prezimeIImeKorisnikaProfila;
    public String textObjave;
    public int brojLajkova;
    public int brojDeljenja;


   public void like (){
       brojLajkova = brojLajkova + 1;
    } // kraj like

    public void dislike () {
       brojLajkova = brojLajkova - 1;
       if (brojLajkova <0) {
           brojLajkova =0;
       }
    } // kraj dislike

    public void share (){
       brojDeljenja = brojDeljenja + 1;
    } // kraj share

    public void print () {
        System.out.println(imeIPrezimeObjavljivaca + "> > >" + prezimeIImeKorisnikaProfila);
        System.out.println(textObjave);
        System.out.println("Likes " + brojLajkova + " | " + " Shares " + brojDeljenja );
    }
}
