package p08_09_2023;

public class SlackMessage {

    public String autor;
    public String date;
    public String text;
    public String lastUpdateAt;

        public void stampa () {
            System.out.println(this.autor + " - " + this.date);
            System.out.println(this.text);

        }


        public String converToString (){

            String result= autor + "-" + date + "- " + text;
            return result;
        }
public void update (String noviText, String updatedAt){
       this.text = noviText;
       this.lastUpdateAt= updatedAt;

}
    }

