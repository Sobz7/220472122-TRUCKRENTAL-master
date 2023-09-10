package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Location;
import za.ac.cput.repository.ILocationRepository;
//import za.ac.cput.repository.impl.LocationRepository;
import za.ac.cput.service.LocationService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {

    private static LocationService service = null;
    @Autowired

    private ILocationRepository repository;




@Override
    public Location create (Location locationId){
    return this.repository.save(locationId);
    }


    @Override
    public Location read(int locationId) {
        return repository.findBylocationId(locationId);
    }

   @Override
    public Location update(Location location) {
        if (this.repository.existsById(location.getLocationId()))
            return this.repository.save(location);
        return null;
    }

    @Override

    public void delete (int locationId){
         this.repository.deleteById(locationId);

    }


    public Set<Brand> getAll(){return this.repository.findAll().stream().collect(Collectors.toSet());
    }

}