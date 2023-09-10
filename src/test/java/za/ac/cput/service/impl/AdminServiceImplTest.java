//Admin Service Implementation Test Class
//Author: Chenique Jacobs (220388172)
//Date: 14/06/2023
package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class AdminServiceImplTest {

    @Autowired
    private AdminServiceImpl service;
    private static Admin admin = AdminFactory.createAdmin("1001", "Chenique", "Jacobs", "cheniquejacobs@gmail.com");


    @Test
    void a_create() {
        Admin created = service.create(admin);

        assertNotNull(created.getAdminId());
        System.out.println("create: " + created);

    }

    @Test
    void b_read() {
        Admin read = service.read(admin.getAdminId());
        assertNotNull(read);
        System.out.println("read: " + read);

    }

    @Test
    void c_update() {
        Admin updated = new Admin.Builder().copy(admin).setName("Jordy").setSurname("Meye").setEmail("meyej@gmail.com").build();
        updated = service.update(updated);
        assertNotNull(service.update(updated));
        System.out.println(admin.getAdminId());

    }

    @Test
    void e_delete() {
        service.delete(admin.getAdminId());
        assertEquals(service.getAll().size(), 0);
        System.out.println(service.getAll());
    }

    @Test
    void d_getAll() {
        System.out.println("Show all: ");
        System.out.println(service.getAll());
    }
}