/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    // lab06 tests
    @Test void reviewTesting(){
       // Restaurant mwal = new Restaurant("Mawwal", 5, 2);
       // mwal.addReview("Good Service, and Delicious Food ", "Vickey", 4 );

        assertEquals("[Mawwal Resturant Review : Good Service, and Delicious Food  - 5 stars - author : Vickey]",String.valueOf(Library.viewRev("Mawwal",5,2,"Vickey","Good Service, and Delicious Food ")));
    }
    @Test void starUpdate(){
        assertEquals("Resturant Name: Mawwal - 3 stars - Price Category : 2.$",Library.checkStar("Mawwal",1,2,"Vickey","Good Service, and Delicious Food ",5));

    }
    @Test void testResturant(){

        assertEquals("Name: US EAGLE - Stars: 5 - Price category: 3", Library.addRest("US EAGLE",5,3));
    }
// lab07 tests
@Test void testShop(){

    assertEquals("Shop Name: Tallet Al-Borj - Shop Description: Shoes and Bags - All ages - Price Category : 3.$", Library.shopSt("Tallet Al-Borj","Shoes and Bags - All ages", 3));
}
    // testing reviewing for all theater , resturant, shop
@Test void testStoresRev(){

    Shop shop = new Shop("Greenii","Plants",2);
    shop.addReview("very Good", "Vickey", 4);
    assertEquals("[Review : very Good - 4 stars - author : Vickey]", String.valueOf(Library.viewReview(shop)));

    Theater thea = new Theater("HollyWood Cinemas");
    thea.addReview("Nice", "Vickey", 5);
    assertEquals("[Review : Nice - 5 stars - author : Vickey]", String.valueOf(Library.viewReview(thea)));
}
// testing adding and removing methods
@Test void Theater(){
        Theater thea = new Theater("Blah");
        thea.addMovie("1");
        thea.removeMovie(3);
        assertEquals("Theater Name: Blah - Movies Available: [Pirates Of The Caribbean, She's The Man, Maleficent, 1, 2, 3]", Library.addMvs(thea,"2","3"));
}
// testing adding the watched movie to reviews
@Test void testStoresRevNew(){

    Theater thea = new Theater("HollyWood Cinemas");
    thea.addReview("Nice", "Vickey", 5);
    assertEquals("[Review : Nice - 5 stars - author : Vickey]", String.valueOf(Library.viewReview(thea)));

    Theater thea2 = new Theater("HollyWood Cinemas");
    thea2.addReview("Nice", "Vickey", 5,2);
    assertEquals("[Review : Nice - 5 stars - author : Vickey - Movie Watched: Maleficent]", String.valueOf(Library.viewReview(thea2)));
}

}
