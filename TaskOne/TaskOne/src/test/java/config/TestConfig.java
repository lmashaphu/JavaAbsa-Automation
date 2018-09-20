/*
 *@author: lethabo
 * date: 11/9/18
 */

package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.config.RestAssuredConfig;
import org.junit.BeforeClass;

public class TestConfig {

    public static RequestSpecification dogAPI_requestSpec;
    public static ResponseSpecification dogAPI_responseSpec;

    @BeforeClass
    public static void setup() {

        /*RequestSpec dogAPI*/
        dogAPI_requestSpec = new RequestSpecBuilder().
                setBaseUri("https://dog.ceo").
                setBasePath("/api/").
                addHeader("Content-Type", "application/json"). //set the Header
                addHeader("Accept", "application/json").
                build();

        RestAssured.requestSpecification = dogAPI_requestSpec; //To set "dogAPI_requestSpec"

        /*ResponseSpec*/
        dogAPI_responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                build();

        RestAssured.responseSpecification = dogAPI_responseSpec; //To set "dogAPI_responseSpec"
    }
}
