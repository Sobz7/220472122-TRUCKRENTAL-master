package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Brand;

import static org.junit.jupiter.api.Assertions.*;

class BrandFactoryTest {

    @Test
    public void createBrand(){

        Brand brand = BrandFactory.createBrand( "353", "UD Truck" , "Pick up truck" , "Black");
        assertNotNull(brand);
        System.out.println(brand);

    }
}