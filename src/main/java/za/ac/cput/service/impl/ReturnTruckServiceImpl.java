//ReturnTruck Service Interface
//Author: Chenique Jacobs (220388172)
//Date: 13/06/2023

/*
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.repository.IReturnTruckRepository;
import za.ac.cput.service.ReturnTruckService;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ReturnTruckServiceImpl implements ReturnTruckService {
    private static ReturnTruckServiceImpl service = null;

    @Autowired
    private IReturnTruckRepository repository;

    @Override
    public ReturnTruck create (ReturnTruck returnTruckId){
        return this.repository.save(returnTruckId);
    }

    @Override
    public ReturnTruck read(String returnTruckId){
        return repository.findReturnTruckId(returnTruckId);
    }

    @Override
    public ReturnTruck update(ReturnTruck returnTruck){
        if(this.repository.existsById(returnTruck.getReturnId()))
            return  this.repository.save(returnTruck);
        return null;
    }

    @Override
<<<<<<< HEAD
    public ReturnTruck update() {
        return null;
    }


    public ReturnTruck update(ReturnTruck returnTruck) {
        ReturnTruck updated = repository.update(returnTruck);
        return updated;
=======
    public void delete(String returnTruckId){
        this.repository.deleteById(returnTruckId);
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
    }

    public Set<ReturnTruck> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }



}
*/