<<<<<<< HEAD
/*
//CustomerRepository Test.java
// Class for the Customer Repository Test
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import za.ac.cput.repository.impl.CustomerRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CustomerRepositoryTest {

    private static CustomerRepository repository = CustomerRepository.getRepository();
    private static Customer customer = CustomerFactory.createCustomer( "ray", "walker" , "ray@gmail.com" , "obs", "yzyzyyydy");


    @Test
    void a_create() {

        Customer created = repository.create(customer);

         assertEquals(customer, created.getCustomerId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Customer read2 = repository.read(customer.getCustomerId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {


        Customer updated = new Customer.Builder().copy(customer).setName("meye").setSurname("Ndong").setEmail("andy@outlook.com").setAddress("rondebosch").setLicenseNumber("zggzgzgz").build();


        assertNotNull(repository.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = repository.delete(customer.getCustomerId());
        assertTrue(success);
        System.out.println("deleted: " + success);

    }


    @Test
    void d_getAll() {
        System.out.println("show all: ");
        System.out.println(repository.getAll());

    }
}


 */
=======
//
////CustomerRepository Test.java
//// Class for the Customer Repository Test
//// Author: Jordy Meye (220072841)
//// Date: 06 06 2023
//
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.Customer;
//import za.ac.cput.factory.CustomerFactory;
//import za.ac.cput.repository.impl.CustomerRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class CustomerRepositoryTest {
//
//    private static CustomerRepository repository = CustomerRepository.getRepository();
//    private static Customer customer = CustomerFactory.createEmployee("yzyzyyydy" , "ray", "walker" , "ray@gmail.com" , "obs", "yzyzyyydy");
//
//
//    @Test
//    void a_create() {
//
//        Customer created = repository.create(customer);
//
//        // assertEquals(employee, created.getCustomerId());
//        System.out.println("create: " + created);
//    }
//
//    @Test
//    void b_read() {
//        Customer read2 = repository.read(customer.getCustomerId());
//        assertNotNull(read2);
//        System.out.println("read: " + read2);
//
//    }
//
//    @Test
//    void c_update() {
//
//
//        Customer updated = new Customer.Builder().copy(customer).setName("meye").setSurname("Ndong").setEmail("andy@outlook.com").setAddress("rondebosch").setLicenseNumber("zggzgzgz").build();
//
//
//        assertNotNull(repository.update(updated));
//        System.out.println("updated: " + updated);
//
//    }
//
//    @Test
//    void e_delete() {
//
//        boolean success = repository.delete(customer.getCustomerId());
//        assertTrue(success);
//        System.out.println("deleted: " + success);
//
//    }
//
//
//    @Test
//    void d_getAll() {
//        System.out.println("show all: ");
//        System.out.println(repository.getAll());
//
//    }
//}
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
