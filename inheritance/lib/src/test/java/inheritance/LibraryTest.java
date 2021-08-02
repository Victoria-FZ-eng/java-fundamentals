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
@Test void testShopRev(){

    Shop shop = new Shop("Greenii","Plants",2);
    shop.addReview("very Good", "Vickey", 4);
    assertEquals("[Review : very Good - 4 stars - author : Vickey]", String.valueOf(Library.viewReview(shop)));
}

}
