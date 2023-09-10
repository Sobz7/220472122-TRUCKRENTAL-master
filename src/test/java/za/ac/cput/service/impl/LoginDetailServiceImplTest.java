/*
LoginDetail Service Implementation Test Class
LoginDetailServiceImplTest.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.factory.LoginDetailFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class LoginDetailServiceImplTest {

    private static LoginDetailServiceImpl service;
    private static LoginDetail lgd = LoginDetailFactory.createLoginDetail("Girlie there", "MeanMe?1");

    @Test
    void a_create()
    {
        LoginDetail created = service.create(lgd);
        assertNotNull(created.getUsername(), created.getUsername());
        System.out.println("Created: " + created);

    }

    @Test
    void b_read()
    {
        LoginDetail read = service.read(lgd.getUsername());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }

    @Test
    void c_update()
    {
        LoginDetail updated = new LoginDetail.Builder().copy(lgd)
                .setPassword("123#@Cool")
                .build();
        updated = service.update(updated);
        assertNotNull(service.update(updated));
        System.out.println(lgd.getUsername());
    }

    @Test
    void e_delete()
    {
        service.delete(lgd.getUsername());
        assertEquals(service.getAll().size(), 0);
        System.out.println(service.getAll());

    }

    @Test
    void d_getAll()
    {
        System.out.println("Show All: ");
        System.out.println(service.getAll());
    }
}