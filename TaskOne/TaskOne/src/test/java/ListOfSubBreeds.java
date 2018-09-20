/*
 *@author: lethabo
 * decription: Diagram 3
 */

import static io.restassured.RestAssured.*;
import config.TestConfig;
import org.junit.Test;

public class ListOfSubBreeds extends TestConfig {

    @Test
    public void listOfSubBreedsTest() {

        given().
                log().
                all().
        when().
                get("breed/retriever/list").
        then().
                log().
                all();
    }
}
