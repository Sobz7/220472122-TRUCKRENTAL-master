package za.ac.cput.controller;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.factory.LoginDetailFactory;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class LoginDetailControllerTest {
    private static final LoginDetail lgd = LoginDetailFactory.createLoginDetail("Siyah M", "123#@Fast");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String basedURL = "http://localhost:8080/logindetail";

    @Test
    void a_create()
    {
        String url = basedURL +  "/create";
        System.out.println(url);

        ResponseEntity<LoginDetail> postResponse = restTemplate.postForEntity(url, lgd, LoginDetail.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));

        LoginDetail savedDetails  = postResponse.getBody();

        System.out.printf("saved data " + savedDetails );
        System.out.println(postResponse.getBody());

    }

    @Test
    void b_read()
    {
        String url = basedURL + "/read/" + lgd.getUsername(); // Make sure the customer ID is correct here
        System.out.println("URL: " + url);
        ResponseEntity<LoginDetail> response = restTemplate.getForEntity(url, LoginDetail.class);
        assertNotNull(response.getBody());
        assertEquals(lgd.getUsername(), response.getBody().getUsername());
        System.out.println(response.getBody());

    }

    @Test
    void c_update()
    {
        LoginDetail updated = new LoginDetail.Builder()
                .copy(lgd)
                .setUsername("Unathi M")
                .setPassword("2830#@Yeah")
                .build();

        String url = basedURL + "/update/" + lgd.getUsername();
        System.out.printf("URL" + url);
        System.out.printf("post data" + updated);
        ResponseEntity<LoginDetail> response = restTemplate.postForEntity(url, updated, LoginDetail.class);
        System.out.println(response);
        assertNotNull(response.getBody());

    }

    @Disabled
    @Test
    void d_delete()
    {
        String url = basedURL + "/delete/" + lgd.getUsername();
        System.out.printf("URL" + url);
        restTemplate.delete(url);

    }

    @Test
    void e_getAll()
    {
        String url = basedURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(basedURL, HttpMethod.GET, entity, String.class);
        System.out.print("show all");
        System.out.println(response.getBody());

    }


}