//Admin Repository test Class
//Author: Chenique Jacobs (220388172)
//Date: 08/04/2023
/*
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.repository.impl.AdminRepository;

import static org.junit.jupiter.api.Assertions.*;

class AdminRepositoryTest {
    private static AdminRepository adminRepository = AdminRepository.getRepository();
    private static Admin admin = AdminFactory.createAdmin(001,"Jordy","Meye","jordymeye@gmail.com");

    @Test
    void a_create(){
        Admin created = adminRepository.create(admin);
        assertEquals(admin.getAdminId(),created.getAdminId());
        System.out.println("Create: "+created);
    }

    @Test
    void b_read(){
        Admin read = adminRepository.read(String.valueOf(admin.getAdminId()));
        //assertNotNull(read);
        System.out.println("Read: "+ read);
    }

    @Test
    void c_update(){
        Admin updated = new Admin.Builder().copy(admin).setName("Chenique")
                .setSurname("Jacobs")
                .setEmail("cheniquejacobs@gmail.com")
                .build();
        //assertNotNull(adminRepository.update(updated));
        System.out.println("Updated:" + updated);
    }

    @Test
    void d_delete(){
        boolean success = adminRepository.delete(String.valueOf(admin.getAdminId()));
        //assertTrue(success);
        System.out.println("Deleted: "+ success);
    }

    @Test
    void e_getAll(){
        System.out.println("Show all: "+ adminRepository.getAll());
    }

}
*/
