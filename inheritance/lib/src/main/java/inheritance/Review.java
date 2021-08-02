package inheritance;

public class Review {
    String body;
    String author;
    int star;
    int mvidx;


    public Review(String body, String author, int star){
        this.author = author;
        this.body = body;
        this.star = star;
    }

    public void testing(){
        System.out.println("Dear "+author + ": Thank You for your feedback");
    }

    @Override
    public String toString(){

        return "Review : " + body + " - "+ star +" stars - " + "author : " +author ;
    }

    public Review(String body, String author, int star, int mvidx){
        this.author = author;
        this.body = body;
        this.star = star;
        this.mvidx=mvidx;
    }

}