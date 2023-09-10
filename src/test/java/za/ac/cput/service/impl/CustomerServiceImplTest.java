package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
<<<<<<< HEAD

=======
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    private  CustomerServiceImpl service ;
    private static Customer customer = CustomerFactory.createCustomer("raymond", "walker" , "ray@gmail.com" , "observatory", "1687532");



    @Test
    void a_create() {

        Customer created = service.create(customer);

        assertNotNull(created.getCustomerId(), created.getCustomerId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Customer read2 = service.read(customer.getCustomerId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {


        Customer updated = new Customer.Builder().copy(customer).setName("Burger").setSurname("Naidoo").setEmail("Kruben@outlook.com").setAddress("rondebosch").setLicenseNumber("zggzgzgz").build();

        updated = service.update(updated);
        assertNotNull(service.update(updated));
        System.out.println(customer.getCustomerId()); //updated.getCustomerId());

    }

    @Test
    void e_delete() {

        service.delete(customer.getCustomerId());
        assertEquals(service.getAll().size(),0);
        System.out.println(service.getAll());

    }


    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(service.getAll());

    }
}