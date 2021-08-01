package inheritance;

import java.util.ArrayList;

public class Restaurant {

   private String name;
   private int star;
   private int priceCat; //number f dollar sign , $ = 1-10$, $$ = 11-20 $ , $$$ = 21-30$ , $$$$ = +31 $ ...
   private String reviewString;
   private ArrayList<String> revArr = new ArrayList<String>();
   private int oldStar;

   public Restaurant(String name , int star , int priceCat){
      this.name=name;
      if(star < 0 )this.star=0;
      if(star>5){
         this.star=5;
      }else{
         this.star=star;
      }

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

   public String addReview(String rev, String auth, int starnew){
      oldStar=star;
      Review review = new Review(rev, auth, starnew );

      if(starnew < 0 )this.star=0;
      if(starnew>5){
         star=5;
      }else{
         star=starnew;
      }

     // star = starnew;
      reviewString = "Review For " +name + " Resturant "+ review.toString();
     // System.out.println("Review For " +name + " Resturant "+ review.toString());
      review.testing();
    //  System.out.println("star new: "+star);
      revArr.add(reviewString);
      return reviewString;
   }

   public ArrayList<String> getRev(){
      //System.out.println("getting Rev");
      return revArr;
   }

   public String  getName(){
      return name;
   }

   public String  updatedStarRev(){
    //  System.out.println("Old rating: "+oldStar + " - New rating: "+star);
      return "Old rating: "+oldStar + " - New rating: "+star ;
   }

   public String get(){
      //System.out.println("Name: "+name+" - Stars: "+star+" - Price category: "+priceCat);
      return "Name: "+name+" - Stars: "+star+" - Price category: "+priceCat ;
   }


}