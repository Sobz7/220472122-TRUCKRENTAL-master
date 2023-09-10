<<<<<<< HEAD
/*
//PRotectionRepository Test.java
// Class for the Protection Repository Test
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Protection;
import za.ac.cput.factory.ProtectionFactory;
import za.ac.cput.repository.impl.ProtectionRepository;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
class ProtectionRepositoryTest {

    private static ProtectionRepository repository = ProtectionRepository.getRepository();
    private static Protection protection = ProtectionFactory.createProtection("cdm" , "rmd", "do not call", "december" , "october");


    @Test
    void a_create() {

        Protection created = repository.create(protection);

        assertEquals(protection.getInsuranceId(), created.getInsuranceId());
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Protection read2 = repository.read(protection.getInsuranceId());
        assertNotNull(read2);
        System.out.println("read: " + read2);

    }

    @Test
    void c_update() {


        Protection updated = new Protection.Builder().copy(protection).setTruckId("gabonlbv").setPolicyType("do call us").setStartDate("april").setEndDate("Juin").build();
        assertNotNull(repository.update(updated));
        System.out.println("updated: " + updated);

    }

    @Test
    void e_delete() {

        boolean success = repository.delete(protection.getInsuranceId());
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
=======
//
////PRotectionRepository Test.java
//// Class for the Protection Repository Test
//// Author: Jordy Meye (220072841)
//// Date: 24 03 2023
//
//package za.ac.cput.repository;
//
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import za.ac.cput.domain.Protection;
//import za.ac.cput.factory.ProtectionFactory;
//import za.ac.cput.repository.impl.ProtectionRepository;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
//@TestMethodOrder(MethodOrderer.MethodName.class)
//class ProtectionRepositoryTest {
//
//    private static ProtectionRepository repository = ProtectionRepository.getRepository();
//    private static Protection protection = ProtectionFactory.createProtection("cdm" , "rmd", "do not call", "december" , "october");
//
//
//    @Test
//    void a_create() {
//
//        Protection created = repository.create(protection);
//
//        assertEquals(protection.getInsuranceId(), created.getInsuranceId());
//        System.out.println("create: " + created);
//    }
//
//    @Test
//    void b_read() {
//        Protection read2 = repository.read(protection.getInsuranceId());
//        assertNotNull(read2);
//        System.out.println("read: " + read2);
//
//    }
//
//    @Test
//    void c_update() {
//
//
//        Protection updated = new Protection.Builder().copy(protection).setTruckId("gabonlbv").setPolicyType("do call us").setStartDate("april").setEndDate("Juin").build();
//        assertNotNull(repository.update(updated));
//        System.out.println("updated: " + updated);
//
//    }
//
//    @Test
//    void e_delete() {
//
//        boolean success = repository.delete(protection.getInsuranceId());
//        assertTrue(success);
//        System.out.println("deleted: " + success);
//
//    }
//
//
//    @Test
//    void d_getAll() {
//        System.out.println("show all: ");
//        System.out.println(repository.getAll());
//
//    }
//}
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
