import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;
import config.EndPoint;
import static org.hamcrest.CoreMatchers.hasItems;
import config.TestConfig;
import org.junit.Test;

public class TaskOne extends TestConfig {

    @Test
    public void getListOfAllBreeds() {

        when().
                get(EndPoint.GET_ALLBREEDS);
    }

    @Test
    public void verifyRetriever() {

        when().
                get(EndPoint.GET_ALLBREEDS).
        then().
                assertThat().
                body("message.retriever", hasItems("chesapeake", "curly", "flatcoated", "golden"));
    }

    @Test
    public void getListOfSubBreeds() {

        when().
                get(EndPoint.GET_SUBBREEDS);
    }

    @Test
    public void getImageRandom() {

        when().
                get(EndPoint.GET_RANDOMIMAGE);
    }
}
