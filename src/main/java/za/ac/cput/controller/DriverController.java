/*
DriverController.java
1st Controller entity
@Author: Siyakha Manisi (219239657)
09 September 2023
*/

package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Driver;
import za.ac.cput.factory.DriverFactory;
import za.ac.cput.service.impl.DriverServiceImpl;
import java.util.Set;

@RestController
@RequestMapping ("/driver")
public class DriverController {
    @Autowired
    DriverServiceImpl driverService;

    @PostMapping("/create")
    public Driver create (@RequestBody Driver driver) {
        Driver newDriver = DriverFactory.createDriver(driver.getName(), driver.getSurname(),
                driver.getEmail(), driver.getTelephone(), String.valueOf(driver.getIdNumber()), driver.getLicenseNo(), driver.getRentalID());
        return driverService.create(newDriver);
    }

    @GetMapping("/read/{id}")
    public Driver read(@PathVariable String id){
        return driverService.read(id);
    }

    @PostMapping("/update")
    public Driver update(@RequestBody Driver driver){
        return driverService.update(driver);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete (@PathVariable String id){
        driverService.delete(id);
        return true;
    }

    @GetMapping("/getAll")
    public Set<Driver> getAll(){
        return driverService.getAll();
    }

}
