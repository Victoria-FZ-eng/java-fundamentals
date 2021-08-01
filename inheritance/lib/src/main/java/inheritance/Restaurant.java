package inheritance;

public class Restaurant {

   private String name;
   private int star;
   private int priceCat; //number f dollar sign , $ = 1-10$, $$ = 11-20 $ , $$$ = 21-30$ , $$$$ = +31 $ ...

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

}