import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class AdidasRestAssure {

    @BeforeAll
    public static void setup(){
        baseURI= "https://petstore.swagger.io/v2/pet/";

    }

    @AfterAll
    public static void exit(){
        System.out.println("your test has finished...........");

    }







}
