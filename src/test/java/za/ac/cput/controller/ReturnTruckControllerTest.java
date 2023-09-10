/*
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
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.factory.ReturnTruckFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReturnTruckControllerTest {
    private static final ReturnTruck returnTruck = ReturnTruckFactory.createReturnTruck("01",01,00.00, LocalDate.parse("2023-04-03"));

    @Autowired
    private TestRestTemplate restTemplate;
    private final String basedURL = "http://localhost:8080/returnTruck";

    @Test
    void a_create(){
        String url = basedURL + "/create";
        System.out.println(url);
        ResponseEntity<ReturnTruck> postResponse = restTemplate.postForEntity(url, returnTruck, ReturnTruck.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        ReturnTruck savedReturnTruck = postResponse.getBody();

        System.out.println("saved data " + savedReturnTruck);
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read(){
        String url = basedURL + "/read/" + returnTruck.getReturnId();
        System.out.println("URL: "+ url);
        ResponseEntity<ReturnTruck> response = restTemplate.getForEntity(url, ReturnTruck.class);

        System.out.println(response.getBody());

    }

    @Test
    void c_update(){
        ReturnTruck updated = new ReturnTruck.Builder()
                .copy(returnTruck)
                .setOverdueCharge(100.00)
                .setReturnDate(LocalDate.parse("2023-04-09"))
                .build();

        String url = basedURL + "/update/" + returnTruck.getReturnId();
        System.out.println("URL "+ url);
        System.out.println("post data" + updated);
        ResponseEntity<ReturnTruck> response = restTemplate.postForEntity(url, updated, ReturnTruck.class);
        System.out.println(response);
        assertNotNull(response.getBody());

    }

    @Disabled
    @Test
    void d_delete(){
        String url = basedURL + "/delete/" + returnTruck.getReturnId();
        System.out.println("URL " + url);
        restTemplate.delete(url);
    }

    @Test
    void e_getAll(){
        String url = basedURL + "/getAl";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(basedURL, HttpMethod.GET,entity,String.class);
        System.out.println("Show All");
        System.out.println(response.getBody());

    }



}
 */
