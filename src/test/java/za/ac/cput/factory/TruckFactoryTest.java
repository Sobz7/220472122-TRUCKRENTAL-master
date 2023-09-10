package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Truck;

import static org.junit.jupiter.api.Assertions.*;

class TruckFactoryTest {
    @Test
    void createTruck() {
        Truck createTruck = TruckFactory.createTruck("Ford", 2017, true, "CP56789", 456, 23 );
        assertNotNull(createTruck);
        System.out.println("Created: " + createTruck);
    }
}