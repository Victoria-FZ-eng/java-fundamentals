package inheritance;

public class Restaurant {

   private String name;
   private int star;
   private int priceCat; //number f dollar sign , $ = 1-10$, $$ = 11-20 $ , $$$ = 21-30$ , $$$$ = +31 $ ...
   private String reviewString;

   public Restaurant(String name , int star , int priceCat){
      this.name=name;
      this.star=star;
      this.priceCat=priceCat;
   }

   public void testing(){
      System.out.println("Hello from Resturant " + name);
   }

   @Override
   public String toString(){

      return "Resturant Name: " + name + " - "+
              star +" stars - " +
              "Price Category : " +priceCat + ".$";
   }

   public String addReview(String rev, String auth, int star){
      Review review = new Review(rev, auth, star );
      reviewString = "Review For " +name + " Resturant "+ review.toString();
      System.out.println("Review For " +name + " Resturant "+ review.toString());
      review.testing();
      return reviewString;
   }

   public String getRev(){
      System.out.println("getting Rev");
      return reviewString;
   }

   public String  getName(){
      return name;
   }


}