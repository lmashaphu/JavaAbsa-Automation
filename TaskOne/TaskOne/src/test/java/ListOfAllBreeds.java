/*
 *@author: lethabo
 * decription: Diagram 1
 */

import static io.restassured.RestAssured.*;
import config.TestConfig;
import org.junit.Test;

public class ListOfAllBreeds extends TestConfig {

    @Test
    public void listOfAllBreedsTest() {

        given().
                log().
                all().
        when().
                get("breeds/list/all").
        then().
                log().
                all();
    }
}
