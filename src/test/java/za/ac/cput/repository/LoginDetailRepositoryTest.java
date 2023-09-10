/*
LoginDetailRepositoryTest.java
2nd Repo Test Class
@Author: Siyakha Manisi (219239657)
09 April 2023
* */
/*
package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.factory.LoginDetailFactory;
import za.ac.cput.repository.impl.LoginDetailRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class LoginDetailRepositoryTest {
    private static LoginDetailRepository ldrepo = LoginDetailRepository.getRepository();
    private static LoginDetail ld = LoginDetailFactory.createLoginDetail("SiyahM2851", "123#@2022Sm");
    @Test
    void a_create()
    {
        LoginDetail created = ldrepo.create(ld);
        assertNotNull(ld.getUsername(), created.getUsername());
        System.out.println("Create: " + created);

    }

    @Test
    void b_read()
    {
        LoginDetail read = ldrepo.read(ld.getUsername());
        assertNotNull(read);
        System.out.println("Reads: " + read);

    }

    @Test
    void c_update()
    {
        LoginDetail updated = new LoginDetail.Builder().copy(ld)
                .setPassword("Siyah#!653")
                .build();
        assertNotNull(ldrepo.update(updated));
        System.out.println("Updated: " + updated);

    }

    @Test
    void e_delete()
    {
        boolean success = ldrepo.delete(ld.getUsername());
        assertTrue(success);
        System.out.println("Deleted: " + success);

    }

    @Test
    void d_getAll()
    {
        System.out.println("Get All: ");
        System.out.println(ldrepo.getAll());

    }
}
 */