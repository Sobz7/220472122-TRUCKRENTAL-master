//Customer Factory class
// java class
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

// Customer Factory class

<<<<<<< HEAD
=======
//Jordy Meye
//220072841

>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String name, String surname, String email, String address, String licenseNumber) {
        String customerId = Helper.generateId();

        if (!Helper.isValidEmail(email) || Helper.isNullorEmpty(customerId) || Helper.isNullorEmpty(name) ||
                Helper.isNullorEmpty(address) || Helper.isNullorEmpty(licenseNumber)) {
            return null;
        }

        return new Customer.Builder()
                .setCustomerId(customerId)
                .setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setAddress(address)
                .setLicenseNumber(licenseNumber)
                .build();
    }
}

