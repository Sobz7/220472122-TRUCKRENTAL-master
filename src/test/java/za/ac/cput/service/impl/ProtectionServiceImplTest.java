<<<<<<< HEAD
/** package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Customer;
import za.ac.cput.domain.Protection;
import za.ac.cput.factory.ProtectionFactory;
import za.ac.cput.service.ProtectionService;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class ProtectionServiceImplTest {

    private static ProtectionService service = null;
    private static Protection protection = ProtectionFactory.createProtection("128976" , "do not return", "16 july ", "10 august" );
    public ProtectionServiceImplTest() {
        service = ProtectionServiceImpl.getService();
    }
    @Test
    void a_create() {
        Protection created = service.create(protection);

        assertNotNull(created);
        System.out.println("create: " + created);
    }

    @Test
    void b_read() {
        Protection read2 = service.read(protection.getInsuranceId());
        assertNotNull(read2);
        System.out.println("read: " + read2);
    }

    @Test
    void c_update() {
        Protection updated = new Protection.Builder().copy(protection).setInsuranceId("12-cd-s").setTruckId("CS25N").setPolicyType("Private").setStartDate("June").setEndDate("October").build();



        //assertNotNull(service.update());
        System.out.println("updated: " + updated);
    }

    @Test
    void testUpdate() {
    }

    @Test
    void d_delete() {
        boolean success = service.delete(protection.getInsuranceId());
        assertTrue(success);
        System.out.println("deleted: " + success);
    }

    @Test
    void getAll() {
        System.out.println("show all: ");
        System.out.println(service.getAll());
    }
}
 */
=======
//package za.ac.cput.service.impl;
//
// import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.TestMethodOrder;
// import org.springframework.beans.factory.annotation.Autowired;
// import za.ac.cput.domain.Customer;
// import za.ac.cput.domain.Protection;
// import za.ac.cput.factory.ProtectionFactory;
// import za.ac.cput.service.ProtectionService;
//
// import static org.junit.jupiter.api.Assertions.*;
// @TestMethodOrder(MethodOrderer.MethodName.class)
// class ProtectionServiceImplTest {
//
//     @Autowired
// private static ProtectionService service;
// private static Protection protection = ProtectionFactory.createProtection("128976" , "do not return", "16 july ", "10 august" );
//
// @Test
// void a_create() {
// Protection created = service.create(protection);
//
// assertNotNull(created.getInsuranceId(), created.getInsuranceId());
// System.out.println("create: " + created);
// }
//
// @Test
// void b_read() {
// Protection read2 = service.read(protection.getInsuranceId());
// assertNotNull(read2);
// System.out.println("read: " + read2);
// }
//
// @Test
// void c_update() {
// Protection updated = new Protection.Builder().copy(protection).setInsuranceId("12-cd-s").setTruckId("CS25N").setPolicyType("Private").setStartDate("June").setEndDate("October").build();
//
//     updated = service.update(updated);
//     assertNotNull(service.update(updated));
//     System.out.println(protection.getInsuranceId()); //updated.getCustomerId());
//
// }
//
//
// @Test
// void d_delete() {
//     service.delete(protection.getInsuranceId());
//     assertEquals(service.getAll().size(),0);
//     System.out.println(service.getAll());
// }
//
// @Test
// void getAll() {
// System.out.println("show all: ");
// System.out.println(service.getAll());
// }
// }
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
