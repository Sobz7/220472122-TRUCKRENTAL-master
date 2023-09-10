package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Rental;

import java.util.Set;

@Service
public interface RentalService extends IService<Rental, String>{
    Rental read(Integer rentalId);

    boolean delete(Integer rentalId);

    public Set<Rental> getAll();
}
