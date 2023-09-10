package za.ac.cput.service;

import za.ac.cput.domain.Location;

import java.util.List;
import java.util.Set;

public interface LocationService extends  IService<Location, String>{
//create, read, update, delete
 Set<Location> getAll();
}