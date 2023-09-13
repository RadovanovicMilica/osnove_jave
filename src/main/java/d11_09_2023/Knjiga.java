package d11_09_2023;

import p08_09_2023.Auto;

public class Knjiga {
    private String ISBN;
    private String naziv;
    private int godinaIzdanja;
    private Autor pisao;

    public Knjiga() {
    }
    public Knjiga (String ISBN, String naziv, int godinaIzdanja, Autor pisao){
        this.ISBN= ISBN;
        this.naziv = naziv;
        this.godinaIzdanja= godinaIzdanja;
        this.pisao = pisao;
    }

    public void stampaj (){
        System.out.println("Jedinstveni identifikacioni broj knjige: " + this.ISBN);
        System.out.println("Naziv knjige: " + this.naziv + "; Godina izdanja: " + this.godinaIzdanja);
        System.out.println("Ime autora: " + this.pisao.getIme() + " " + this.pisao.getPrezime());
    }
    public String getISBN (){
        return  this.ISBN;
    }
    public void setISBN (String ISBN){
        this.ISBN = ISBN;
    }
    public String getNaziv (){
        return this.naziv;
    }
    public void setNaziv (String naziv){
        this.naziv = naziv;
    }
    public int getGodinaIzdanja (){
        return getGodinaIzdanja();
    }
    public void setGodinaIzdanja (int godinaIzdanja){
        this.godinaIzdanja = godinaIzdanja;
    }
    public Autor getPisao (){
        return this.pisao;
    }
    public void setPisao (Autor pisao ){
        this.pisao= pisao;
    }
}

