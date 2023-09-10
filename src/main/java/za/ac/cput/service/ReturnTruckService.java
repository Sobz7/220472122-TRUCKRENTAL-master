package za.ac.cput.service;

import za.ac.cput.domain.ReturnTruck;
import java.util.Set;
public interface ReturnTruckService extends IService<ReturnTruck,String> {
    public Set<ReturnTruck> getAll();
}
