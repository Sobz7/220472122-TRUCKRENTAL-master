package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Rental;
import za.ac.cput.factory.RentalFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
class RentalServiceImplTest {

    private static RentalServiceImpl service = null;
    private static final Rental rental = RentalFactory.createRental(122,12,123,"2023-04-04","2023-05-30",42750.0);

    public RentalServiceImplTest() {service = RentalServiceImpl.getService();}
    @Test
    void a_create() {
        Rental created = service.create(rental);
        System.out.println("Create : "+ created);
    }

    @Test
    void b_read() {
        assert rental != null;
        Rental read1 = service.read((Integer) rental.getRentalId());
        assertNotNull(read1);
        System.out.println("Read : "+ read1);
    }

    @Test
    void c_update() {
        Rental updated = new Rental.Builder().copy(rental).setStartDate(LocalDate.parse("2023-04-05"))
                .setEndDate(LocalDate.parse("2023-05-31"))
                .build();
        assertNotNull(service.update(updated));
        System.out.println("updated: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = service.delete((Integer) (rental != null ? rental.getRentalId() : -1));
        assertTrue(success);
        System.out.println("Deleted :"+ success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show all :");
        System.out.println(service.getAll());
    }
}