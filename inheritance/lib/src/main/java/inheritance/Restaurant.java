package inheritance;

import java.util.ArrayList;

public class Restaurant extends Store {

   private String name;
   private int star;
   private int priceCat; //number f dollar sign , $ = 1-10$, $$ = 11-20 $ , $$$ = 21-30$ , $$$$ = +31 $ ...
   private String reviewString;
   private ArrayList<String> revArr = new ArrayList<String>();
   private int oldStar;
   private ArrayList<Integer> starss =new ArrayList<Integer>();

   public Restaurant(String name , int star , int priceCat){
      this.name=name;
      if(star < 0 ){
         this.star=0;
      }
     else if(star>5){
         this.star=5;
      }else{
         this.star=star;
      }
      starss.add(this.star);
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

   public String addReview(String rev, String auth, int starNnew){
      oldStar=star;

      Review review = new Review(rev, auth, starNnew );

      if(starNnew < 0 ){
         starss.add(0);
      }
      else if(starNnew>5){
         starss.add(5);
      }else{
         starss.add(starNnew);
      }
      int sum=0;
      for (Integer integer : starss) {
         sum = sum+integer;
      }
      System.out.println(sum);
      System.out.println(starss);
      star = sum/(starss.size());

      reviewString = name + " Resturant "+ review.toString();
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



   public String get(){
      //System.out.println("Name: "+name+" - Stars: "+star+" - Price category: "+priceCat);
      return "Name: "+name+" - Stars: "+star+" - Price category: "+priceCat ;
   }


}