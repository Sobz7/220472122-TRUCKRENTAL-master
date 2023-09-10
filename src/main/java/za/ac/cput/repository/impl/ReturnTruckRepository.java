//Return Truck Class
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023
/*
package za.ac.cput.repository.impl;

import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.repository.IReturnTruckRepository;

import java.util.HashSet;
import java.util.Set;

public class ReturnTruckRepository implements IReturnTruckRepository {

    private static ReturnTruckRepository repository = null;
    private Set<ReturnTruck> returnTruckDB = null;

    private ReturnTruckRepository(){returnTruckDB = new HashSet<ReturnTruck>();
    }

    public static ReturnTruckRepository getRepository(){
        if(repository == null){
            repository = new ReturnTruckRepository();
        }
        return repository;
    }

    @Override
    public ReturnTruck create(ReturnTruck returnTruck) {
        boolean success = returnTruckDB.add(returnTruck);
        if(!success)
        return null;
        return returnTruck;
    }

    @Override
    public ReturnTruck read(String s) {
        return null;
    }

    @Override
    public ReturnTruck read(int returnId) {
        for(ReturnTruck e : returnTruckDB){
            if(e.getReturnId() == (returnId))
                return e;
        }
        return null;
    }

    @Override
    public ReturnTruck update(ReturnTruck returnTruck) {
        ReturnTruck oldReturnTruck = read(returnTruck.getReturnId());
                if(oldReturnTruck != null){
                    returnTruckDB.remove(oldReturnTruck);
                    returnTruckDB.add(returnTruck);
                    return returnTruck;
                }
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }


    public boolean delete() {
        return false;
    }

    @Override
    public boolean delete(int returnId) {
        ReturnTruck returnToDelete = read(returnId);
        if(returnToDelete == null)
        return false;
        returnTruckDB.remove(returnToDelete);
        return true;
    }

    @Override
    public Set<ReturnTruck> getAll() {
        return returnTruckDB;
    }
}
*/