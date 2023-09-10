/*
Driver Service Implementation Class
DriverServiceImpl.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Driver;
import za.ac.cput.repository.IDriverRepository;
import za.ac.cput.service.DriverService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DriverServiceImpl implements DriverService {
    private static DriverServiceImpl service = null;

    @Autowired
    private IDriverRepository repo;

    @Override
    public Driver create (Driver driverID)
    {
        return this.repo.save(driverID);
    }

    public Driver read (String driverID)
    {
        return repo.findByDriverId(driverID);
    }

    public Driver update (Driver driver)
    {
        if(this.repo.existsById(driver.getDriverID()))
        return this.repo.save(driver);
        return null;

    }

    public void delete (String driverID)
    {
        this.repo.deleteById(driverID);

    }

    public Set<Driver> getAll()
    {
        return this.repo.findAll().stream().collect(Collectors.toSet());

    }


}
