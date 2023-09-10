//ReturnTruck Repository test Class
//Author: Chenique Jacobs (220388172)
//Date: 08/04/2023
/*
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.factory.ReturnTruckFactory;
import za.ac.cput.repository.impl.ReturnTruckRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReturnTruckRepositoryTest {
    private static ReturnTruckRepository returnTruckRepository = ReturnTruckRepository.getRepository();
    private static ReturnTruck returnTruck = ReturnTruckFactory.createReturnTruck(01,01,00.00, LocalDate.parse("2023-04-03"));

    @Test
    void a_create(){
        ReturnTruck created = returnTruckRepository.create(returnTruck);
        assertEquals(returnTruck.getReturnId(),created.getReturnId());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read(){
        ReturnTruck read = returnTruckRepository.read(returnTruck.getReturnId());
        //assertNotNull(read);
        System.out.println("Read: "+ read);

    }

    @Test
    void c_update(){
        ReturnTruck updated = new ReturnTruck.Builder().copy(returnTruck).setOverdueCharge(100.00)
                .setReturnDate(LocalDate.parse("2023-04-09"))
                .build();
        //assertNotNull(returnTruckRepository.update(updated));
        System.out.println("Updated: "+ updated);
    }

    @Test
    void d_delete(){
        boolean success = returnTruckRepository.delete(returnTruck.getReturnId());
        assertTrue(success);
        System.out.println("Deleted: "+success);
    }

    @Test
    void e_getAll(){
        System.out.println("Show all: "+ returnTruckRepository.getAll());
    }

}

 */