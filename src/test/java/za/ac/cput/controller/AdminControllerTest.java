package za.ac.cput.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AdminControllerTest {
    private static final Admin admin = AdminFactory.createAdmin("1001","Chenique","Jacobs", "cheniquejacobs@gmail.com");

    @Autowired
    private TestRestTemplate restTemplate;
    private final String basedURL = "http://localhost:8080/admin";

    @Test
    void a_create(){
        String url = basedURL + "/create";
        System.out.println(url);
        ResponseEntity<Admin> postResponse = restTemplate.postForEntity(url, admin,Admin.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        Admin savedAdmin = postResponse.getBody();

        System.out.println("saved data "+savedAdmin);
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read(){
        String url = basedURL + "/read/" + admin.getAdminId();
        System.out.println("URL: "+ url);
        ResponseEntity<Admin> response = restTemplate.getForEntity(url,Admin.class);

        System.out.println(response.getBody());
    }

    @Test
    void c_update(){
        Admin updated = new Admin.Builder()
                .copy(admin)
                .setName("Jordy")
                .setSurname("Meye")
                .setEmail("meyej@gmail.com")
                .build();

        String url = basedURL + "/update/" + admin.getAdminId();
        System.out.println("URL "+ url);
        System.out.println("post data "+ updated);
        ResponseEntity<Admin> response = restTemplate.postForEntity(url, updated, Admin.class);
        System.out.println(response);
        assertNotNull(response.getBody());
    }

    @Disabled
    @Test
    void d_delete(){
        String url = basedURL + "/delete/" + admin.getAdminId();
        System.out.println("URL "+ url);
        restTemplate.delete(url);
    }

    @Test
    void e_getAll(){
        String url = basedURL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(basedURL, HttpMethod.GET, entity, String.class);
        System.out.println("Show all");
        System.out.println(response.getBody());
    }
}
