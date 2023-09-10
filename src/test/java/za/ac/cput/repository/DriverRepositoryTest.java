/*
DriverRepositoryTest.java
1st Repo Test Class
@Author: Siyakha Manisi (219239657)
09 April 2023
* */
/*
package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.repository.impl.DriverRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class DriverRepositoryTest {
    private static DriverRepository drepo = DriverRepository.getRepository();
    private static Driver driver = DriverFactory.createDriver("Roman", "Reigns", "tribalchief@gmail.com", 890528, "890528RR", 52546, 10);


    @Test
    void a_create()
    {
        Driver created = drepo.create(driver);
        assertNotNull(driver.getDriverID(), created.getDriverID());
        System.out.println("Created: " + created);

    }

    @Test
    void b_read()
    {
        Driver read = drepo.read(driver.getDriverID());
        assertNotNull(read);
        System.out.println("Reads:" + read);

    }

    @Test
    void c_update()
    {
        Driver updated = new Driver.Builder().copy(driver).setName("Steven")
                .setSurname("Rogers")
                .setEmail("captainamerica@gmail.com")
                .setIdNumber(391010)
                .setLicenseNo("738092CA")
                .setTelephone(2531)
                .setRentalID(21)
                .build();
        assertNotNull(drepo.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete()
    {
        boolean success = drepo.delete(driver.getDriverID());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll()
    {
        System.out.println("Clients shown: ");
        System.out.println(drepo.getAll());

    }
}
 */