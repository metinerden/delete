import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.*;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
public class Adidas_MTN extends AdidasRestAssure{

    /* 1. Get "available" pets. Assert expected results content-Type: application/json,
          status code=200 and assert that there is no sold and pending product inside
          the payload
      2.Post a new available pet to the store. Assert new pet added.
      3. Update this pet photoUrls to "CanonUltraSight". Assert status updated.
      4. Delete this pet. Assert deletion.*/
    @Test
    public void Spartan1() {
        Response response = RestAssured.get(baseURI+"findByStatus?status=available").
                prettyPeek();


    }

}
