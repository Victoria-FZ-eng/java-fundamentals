/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String [] args){
        System.out.println("Hello from Lab06 & Lab07");

 //--------------------------------------------------------------------------------------------
 //           lab06
 //--------------------------------------------------------------------------------------------
      //  Restaurant mac = new Restaurant("Mac", 4, 1);
      //  mac.testing();
       // System.out.println(mac.toString());

       // Restaurant housh = new Restaurant("Al-Housh", 4 , 2);
       // housh.testing();
       // System.out.println(housh.toString());

//        Review macr = new Review("Fast Delivering", "Victoria", 4 );
//        macr.testing();
//        System.out.println(macr.toString());

       // mac.addReview("Fast Delivering", "Victoria", 1 );
//        mac.addReview("wwwwwwwwwwwwwwwwwwwwwww", "Viwqeqweia", 2 );
//        mac.addReview("qqqqqqqqqqqq", "Viqwria",  4);
       // mac.getRev();

     //   viewRev("asd",5,8,"sfsdf", "sdfsdfsdfsdf");
       // checkStar("asd",2,8,"sfsdf", "sdfsdfsdfsdf", 4);
      //  addRest("Popyes",4,1);


        //--------------------------------------------------------------------------------------------
        //           lab07
        //--------------------------------------------------------------------------------------------

        Store shop = new Shop("Amedd","Coffee",1);
        shopSt("Natural Looks", "Perfumes ,lotions, butter, masks, bath bubbles,.....", 5);
        shopReview(shop,"very Good", "Vickey", 4);
        viewReview(shop);

       // Store theater = new Theater("Taj");
        theaterSt("Disney");
        Theater theater = new Theater("new");
        addMvs(theater, "Movie 1", "Movie 2");
        removeMvs(theater,2);
        shopReview(theater,"very Good", "Vickey", 4,3);
        shopReview(theater,"very Good", "Vickey", 4);

    }
    //--------------------------------------------------------------------------------------------
    //           lab06
    //--------------------------------------------------------------------------------------------
    public static ArrayList<String> viewRev(String name, int star, int price, String auth, String desc){
        Restaurant res = new Restaurant(name, star, price);
        res.addReview(desc, auth, star );
        //res.getRev();
        return  res.getRev() ;

    }

    public static String checkStar(String name, int star, int price, String auth, String desc , int newStar){
        Restaurant res = new Restaurant(name, star, price);
       // res.addReview(desc, auth, star );
        res.addReview(desc, auth, newStar );
        System.out.println( res.getRev());
        System.out.println(res.toString());
        return  res.toString();
    }

    public static String addRest(String name, int star, int price){
        Restaurant res = new Restaurant(name, star, price);
        System.out.println(res.get());
        return res.get();
    }

    //--------------------------------------------------------------------------------------------
    //           lab07
    //--------------------------------------------------------------------------------------------

    public static String shopSt(String name, String desc, int dol){
        Shop shop = new Shop(name,desc,dol);
        System.out.println(shop.toString());
       return shop.toString();
    }
    public static String shopReview(Store str,String rev, String auth, int star){

        System.out.println(str.addReview(rev,auth,star));
       return str.addReview(rev,auth,star);
    }
    public static ArrayList<String> viewReview(Store str){

       return str.viewReviews();
    }
    public static String theaterSt(String name){
        Store theater = new Theater(name);
        System.out.println(theater.toString());
        return theater.toString();
    }
    public static String addMvs(Theater thea, String mv1, String mv2){
        thea.addMovie(mv1);
        thea.addMovie(mv2);
        System.out.println(thea.toString());
        return thea.toString();
    }
    public static String removeMvs(Theater thea, int mvidx){
        thea.removeMovie(mvidx);
        System.out.println(thea.toString());
        return thea.toString();
    }
    public static String shopReview(Store str,String rev, String auth, int star, int idx){

        System.out.println(str.addReview(rev,auth,star,idx));
        return str.addReview(rev,auth,star,idx);
    }
}
