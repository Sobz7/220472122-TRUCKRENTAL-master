import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {
    private static final Location location = LocationFactory.createLocation(  "353", "Cape Town" , "Plein Street");

    @Autowired
private TestRestTemplate restTemplate;
private final String basedURL = "http://localhost:8080/location";

    @Test
    void a_create() {
        String url = basedURL +  "/create";
        System.out.println(url);
        ResponseEntity<Location> postResponse = restTemplate.postForEntity(url, location, Location.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        Brand savedBrand  = postResponse.getBody();
       //assertEquals(location.getLocationId(), savedLocation.getLocationId());
        System.out.printf("saved data " + savedLocation );
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read() {
        String url = basedURL + "/read/" + location.getLocationId(); 
        System.out.println("URL: " + url);
        ResponseEntity<Location> response = restTemplate.getForEntity(url, Location.class);
       // assertNotNull(response.getBody());
        //assertEquals(location.getLocationId(), response.getBody().getLocationId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Location updated = new location.Builder()
                .copy(location)
                .setlocationId("353")
                .setlocationName("Cape Town")
                .setAddress("Plein Street")
                .build();

        String url = basedURL + "/update/" + location.getLocationId();
        System.out.printf("URL" + url);
        System.out.printf("post data" + updated);
        ResponseEntity<Location> response = restTemplate.postForEntity(url, updated, Location.class);
        System.out.println(response);
        assertNotNull(response.getBody());
    }

    @Disabled
    @Test
    void d_delete() {
        String url = basedURL + "/delete/" + location.getLocationId();
        System.out.printf("URL" + url);
        restTemplate.delete(url);
    }

    @Test
    void e_getAll() {
        String url = basedURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(basedURL, HttpMethod.GET, entity, String.class);
        System.out.print("show all");
        System.out.println(response.getBody());
    }
}