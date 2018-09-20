/*
 *@author: lethabo
 * decription: Diagram 4
 */

import static io.restassured.RestAssured.*;
import config.TestConfig;
import org.junit.Test;

public class RandomImage extends TestConfig {

    @Test
    public void randomImageTest() {

        given().
                log().
                all().
        when().
                get("breed/retriever/golden/images/random").
        then().
                log().
                all();
    }
}
