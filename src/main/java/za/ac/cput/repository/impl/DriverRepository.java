/*
DriverRepository.java
1st Repository Class
@Author: Siyakha Manisi (219239657)
09 April 2023
* */

/*
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Driver;
import za.ac.cput.repository.IDriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverRepository implements IDriverRepository {
    public static DriverRepository repo = null;

    private Set<Driver> driverDB = null;

    private DriverRepository()
    {
        driverDB = new HashSet<Driver>();
    }

    public static DriverRepository getRepository() {
        if (repo == null) {
            repo = new DriverRepository();
        }
        return repo;
    }

    @Override
    public Driver create(Driver driver)
    {
        boolean success = driverDB.add(driver);
        if (!success)
            return null;
        return driver;
    }
    @Override
    public Driver read(String driverID)
    {
        Driver driver = driverDB.stream()
                    .filter(d -> d.getDriverID().equals(driverID))
                    .findAny()
                    .orElse(null);

                    return driver;
    }

    @Override
    public Driver update(Driver driver)
    {
        Driver oldDriver = read(driver.getDriverID());
        if (oldDriver != null)
        {
            driverDB.remove(oldDriver);
            driverDB.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public boolean delete(String driverID)
    {
        Driver driverToDelete = read(driverID);
        if (driverToDelete == null)
            return false;
        driverDB.remove(driverToDelete);
        return true;
    }
    @Override
    public Set<Driver> getAll()
    {
        return driverDB;
    }
};
*/



