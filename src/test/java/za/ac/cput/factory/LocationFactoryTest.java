package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;

import static org.junit.jupiter.api.Assertions.*;

class LocationFactoryTest {

    @Test
    public void createLocation(){

        Location location = LocationFactory.createLocation( "353", "Cape Town" , "Plein Street");
        assertNotNull(location);
        System.out.println(location);

    }
}
