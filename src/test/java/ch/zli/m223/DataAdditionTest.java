package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DataAdditionTest {

    @Test
    public void testAdditionEndpoint() {
        given()
                .when().get("/calc/add/1/25")
                .then()
                .statusCode(200)
                .body(is("26"));
    }

}