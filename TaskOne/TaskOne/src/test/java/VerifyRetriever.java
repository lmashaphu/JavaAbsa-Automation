/*
 *@author: lethabo
 * decription: Diagram 2
 */

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.IsEqual.equalTo;
import config.TestConfig;
import org.junit.Test;

public class VerifyRetriever extends TestConfig {

    @Test
    public void verifyRetrieverTest() {

        given().
                log().
                ifValidationFails().
        when().
                get("breeds/list/all").
        then().
                assertThat().
                body("message.retriever", hasItems("chesapeake", "curly", "flatcoated", "golden"));
    }
}
