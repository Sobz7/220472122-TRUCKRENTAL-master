package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ReturnTruck;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class ReturnTruckFactoryTest {
    @Test
    public void createReturnTruck(){
        ReturnTruck returnTruck = ReturnTruckFactory.createReturnTruck("01",01,00.00, LocalDate.parse("2023-04-03"));
        assertNotNull(returnTruck);
        System.out.println(returnTruck);
    }
}
