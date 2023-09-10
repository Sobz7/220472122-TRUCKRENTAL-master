package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.factory.ReturnTruckFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.class)
@SpringBootTest
public class ReturnTruckServiceImplTest {

    @Autowired
    private ReturnTruckServiceImpl service;
    private static ReturnTruck returnTruck = ReturnTruckFactory.createReturnTruck("01",01,00.00, LocalDate.parse("2023-04-03"));



    @Test
    void a_create(){
        ReturnTruck created = service.create(returnTruck);

        assertNotNull(created.getReturnId());
        System.out.println("create: "+ created);
    }

    @Test
    void b_read(){
        ReturnTruck read = service.read(returnTruck.getReturnId());
        assertNotNull(read);
        System.out.println("read: "+ read);
    }

    @Test
    void c_update(){
        ReturnTruck updated = new ReturnTruck.Builder().copy(returnTruck).setOverdueCharge(100.00).setReturnDate(LocalDate.parse("2023-04-09")).build();
        updated = service.update(updated);
        assertNotNull(service.update(updated));
        System.out.println(returnTruck.getReturnId());

    }

    @Test
    void e_delete(){
        service.delete(returnTruck.getReturnId());
        assertEquals(service.getAll().size(),0);
        System.out.println(service.getAll());

    }

    @Test
    void d_getAll(){
        System.out.println("Show all");
        System.out.println(service.getAll());
    }

}
