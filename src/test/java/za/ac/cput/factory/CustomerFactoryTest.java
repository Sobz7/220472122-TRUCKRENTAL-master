//CustomerFactory Test.java
// Test for the Customer Factory
// Author: Jordy Meye (220072841)
// Date: 24 03 2023
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerFactoryTest {

    @Test
    public void createEmployee(){

        Customer customer = CustomerFactory.createCustomer( "raymond", "walker" , "ray@gmail.com" , "observatory", "1687532");
        assertNotNull(customer);
        System.out.println(customer);

    }
}