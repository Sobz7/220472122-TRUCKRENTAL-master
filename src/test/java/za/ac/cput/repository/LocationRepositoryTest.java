/*

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;
import za.ac.cput.repository.impl.LocationRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LocationRepositoryTest {

    private static LocationRepository repository = LocationRepository.getRepository();
    private static Brand brand = BrandFactory.createBrand( "353", "Cape Town" , "Plein Street");


    @Test
    void a_create() {

        Location created = repository.create(location);

         assertEquals(location, created.getLocationId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Location read2 = repository.read(Location.getlocationId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {

        Location updated = new Location.Builder().copy(location).setlocationId("353").setlocationName("Cape Town").setAddress("Plein Street").build();

        assertNotNull(repository.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = repository.delete(location.getId());
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
