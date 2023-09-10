/*

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Brand;
import za.ac.cput.factory.BrandFactory;
import za.ac.cput.repository.impl.BrandRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BrandRepositoryTest {

    private static BrandRepository repository = BrandRepository.getRepository();
    private static Brand brand = BrandFactory.createBrand( "353", "UD Truck" , "Pick up truck" , "Black");


    @Test
    void a_create() {

        Brand created = repository.create(brand);

         assertEquals(brand, created.getBrandId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Brand read2 = repository.read(Brand.getbrandId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {

        Brand updated = new Brand.Builder().copy(brand).setbrandId("353").setbrandName("UD truck").setModel("Pick up truck").setColor("Black").build();

        assertNotNull(repository.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = repository.delete(brand.getId());
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