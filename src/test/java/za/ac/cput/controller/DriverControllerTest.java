package za.ac.cput.controller;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class DriverControllerTest {
    private static final Driver driver = DriverFactory.createDriver("Siyakha", "Manisi", "siyakhamanisi@gmail.com",
            780920, "202321D", 71819, 5);

    @Autowired
    private TestRestTemplate restTemplate;
    private final String basedURL = "http://localhost:8080/driver";

    @Test
    void a_create()
    {
        String url = basedURL + "/create";
        System.out.println(url);

        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(url, driver, Driver.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        Driver savedDriver = postResponse.getBody();

        System.out.println("saved data " + savedDriver);
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read()
    {
        String url = basedURL + "/read/" + driver.getDriverID();
        System.out.println("URL: "+ url);
        ResponseEntity<Driver> response = restTemplate.getForEntity(url, Driver.class);

        System.out.println(response.getBody());

    }

    @Test
    void c_update()
    {
        Driver updated = new Driver.Builder()
                .copy(driver)
                .setName("Tshego")
                .setSurname("Fatso")
                .setEmail("tshegofatso@gmail.com")
                .build();

        String url = basedURL + "/update/" + driver.getDriverID();
        System.out.println("URL "+ url);
        System.out.println("post data "+ updated);
        ResponseEntity<Driver> response = restTemplate.postForEntity(url, updated, Driver.class);
        System.out.println(response);
        assertNotNull(response.getBody());

    }

    @Disabled
    @Test
    void d_delete()
    {
        String url = basedURL + "/delete/" + driver.getDriverID();
        System.out.println("URL "+ url);
        restTemplate.delete(url);

    }

    @Test
    void e_getAll()
    {
        String url = basedURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(basedURL, HttpMethod.GET, entity, String.class);
        System.out.println("Show all");
        System.out.println(response.getBody());

    }


}