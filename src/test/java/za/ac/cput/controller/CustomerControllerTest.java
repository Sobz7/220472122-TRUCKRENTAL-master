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
<<<<<<< HEAD

=======
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
import org.springframework.http.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
=======
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {
<<<<<<< HEAD
    private static final Customer customer = CustomerFactory.createCustomer(  "raymond", "walker" , "ray@gmail.com" , "observatory", "1687532");
=======
    private static final Customer customer = CustomerFactory.createCustomer(  "emily", "smith" , "emily@gmail.com" , "rondebosch", "756983");
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e

    @Autowired
private TestRestTemplate restTemplate;
private final String basedURL = "http://localhost:8080/customer";

    @Test
    void a_create() {
        String url = basedURL +  "/create";
        System.out.println(url);
        ResponseEntity<Customer> postResponse = restTemplate.postForEntity(url, customer, Customer.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        assertNotNull(postResponse.getStatusCode(), String.valueOf(HttpStatus.OK));
        Customer savedCustomer  = postResponse.getBody();
       //assertEquals(customer.getCustomerId(), savedCustomer.getCustomerId());
        System.out.printf("saved data " + savedCustomer );
        System.out.println(postResponse.getBody());
    }

    @Test
    void b_read() {
        String url = basedURL + "/read/" + customer.getCustomerId(); // Make sure the customer ID is correct here
        System.out.println("URL: " + url);
        ResponseEntity<Customer> response = restTemplate.getForEntity(url, Customer.class);
<<<<<<< HEAD
       // assertNotNull(response.getBody());
        //assertEquals(customer.getCustomerId(), response.getBody().getCustomerId());
=======
       assertNotNull(response.getBody());
        assertEquals(customer.getCustomerId(), response.getBody().getCustomerId());
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Customer updated = new Customer.Builder()
                .copy(customer)
                .setName("nana")
                .setSurname("nadia")
                .setEmail("nadia@gmail.com")
                .setAddress("mowbray")
                .setLicenseNumber("csd10")
                .build();

        String url = basedURL + "/update/" + customer.getCustomerId();
        System.out.printf("URL" + url);
        System.out.printf("post data" + updated);
        ResponseEntity<Customer> response = restTemplate.postForEntity(url, updated, Customer.class);
        System.out.println(response);
        assertNotNull(response.getBody());
    }

    @Disabled
    @Test
    void d_delete() {
        String url = basedURL + "/delete/" + customer.getCustomerId();
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