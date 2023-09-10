import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.Brand;
import za.ac.cput.factory.BrandFactory;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {
    private static final Brand brand = BrandFactory.createCustomer(  "353", "UD truck" , "Pick up truck" , "black");

    @Autowired
private TestRestTemplate restTemplate;
private final String basedURL = "http://localhost:8080/brand";

    @Test
    void a_create() {
        String url = basedURL +  "/create";
        System.out.println(url);
        ResponseEntity<Brand> postResponse = restTemplate.postForEntity(url, brand, Brand.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        Brand savedBrand  = postResponse.getBody();
       //assertEquals(brand.getBrandId(), savedBrand.getBrandId());
        System.out.printf("saved data " + savedBrand );
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read() {
        String url = basedURL + "/read/" + brand.getBrandId(); 
        System.out.println("URL: " + url);
        ResponseEntity<Brand> response = restTemplate.getForEntity(url, Brand.class);
       // assertNotNull(response.getBody());
        //assertEquals(brand.getBrandId(), response.getBody().getBrandId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Brand updated = new brand.Builder()
                .copy(brand)
                .setbrandId("353")
                .setbrandName("UD truck")
                .setModel("Pick up truck")
                .setColor("black")
                .build();

        String url = basedURL + "/update/" + brand.getBrandId();
        System.out.printf("URL" + url);
        System.out.printf("post data" + updated);
        ResponseEntity<Brand> response = restTemplate.postForEntity(url, updated, Brand.class);
        System.out.println(response);
        assertNotNull(response.getBody());
    }

    @Disabled
    @Test
    void d_delete() {
        String url = basedURL + "/delete/" + brand.getBrandId();
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