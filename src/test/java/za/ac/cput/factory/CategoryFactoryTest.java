package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Category;

import static org.junit.jupiter.api.Assertions.*;

class CategoryFactoryTest {

    @Test
    void createCategory() {
        Category category= CategoryFactory.createCategory( "Furniture1",20,"Box truck");
        assertNotNull(category);
        System.out.println(category);

    }
}