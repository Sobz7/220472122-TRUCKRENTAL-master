<<<<<<< HEAD
/** package za.ac.cput.controller;
=======
package za.ac.cput.controller; /** package za.ac.cput.controller;
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Protection;
import za.ac.cput.factory.ProtectionFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProtectionControllerTest {

    private static Protection protection = ProtectionFactory.createProtection("128976" , "do not return", "16 july ", "10 august" );
    @Autowired
    private TestRestTemplate restTemplate;
    private final String basedURL = "http://localhost:8080/protection";
    @Test
    void create() {
        String url = basedURL +  "/create";
        ResponseEntity<Protection> postResponse = restTemplate.postForEntity(url, protection, Protection.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Protection savedPro  = postResponse.getBody();
        System.out.printf("saved data" + protection );
        assertEquals(protection.getInsuranceId(), savedPro.getInsuranceId());
    }

    @Test
    void read() {
        String url = basedURL + "/read" + protection.getInsuranceId();
        System.out.printf("URL" +url);
        ResponseEntity<Protection> response = restTemplate.getForEntity(url, Protection.class);
        assertEquals(protection.getInsuranceId(), response.getBody().getInsuranceId());
        System.out.println(response.getBody());
    }

    @Test
    void update() {
        Protection updated = new Protection.Builder().copy(protection).setTruckId("cbd-56").setPolicyType("unknown").setStartDate("april").setEndDate("may").build();
        String url = basedURL + "/update";
        System.out.printf("URL" + url);
        System.out.printf("post data" + updated);
        ResponseEntity<Protection> response= restTemplate.postForEntity(url, updated, Protection.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = basedURL + "/delete" + protection.getInsuranceId();
        System.out.printf("URL" +url);
        restTemplate.delete(url);
    }

    @Test
    void getall() {
        String url = basedURL + "/getAll" ;
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.printf("show all");
         //System.out.printf(response);
        System.out.println(response.getBody());
    }
}
*/