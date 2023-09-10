/*
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.factory.ReturnTruckFactory;
import za.ac.cput.service.impl.ReturnTruckServiceImpl;
import java.util.Set;

@RestController
@RequestMapping("/returnTruck")
public class ReturnTruckController {

    @Autowired
    ReturnTruckServiceImpl returnTruckService;

    @PostMapping("/create")
    public ReturnTruck create(@RequestBody ReturnTruck returnTruck){
        ReturnTruck returnTruck1 = ReturnTruckFactory.createReturnTruck(returnTruck.getReturnId(),returnTruck.getRentalId(),returnTruck.getOverdueCharge(), returnTruck.getReturnDate());
        return returnTruckService.create(returnTruck1);
    }

    @GetMapping("/read/{id}")
    public ReturnTruck read(@PathVariable String id){
        return returnTruckService.read(id);
    }

    @PostMapping("/update")
    public ReturnTruck update(@RequestBody ReturnTruck returnTruck){
        return returnTruckService.update(returnTruck);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete (@PathVariable String id){
        returnTruckService.delete(id);
        return true;
    }

    @GetMapping("/getAll")
    public Set<ReturnTruck> getAll(){
        return returnTruckService.getAll();
    }

}

 */
