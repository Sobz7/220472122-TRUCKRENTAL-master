/* package za.ac.cput.service.impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Rental;
import za.ac.cput.repository.impl.RentalRepository;
import za.ac.cput.service.RentalService;

import java.util.Set;

import static org.apache.catalina.security.SecurityUtil.remove;

@Repository
public class RentalServiceImpl implements RentalService {

    private static RentalServiceImpl service = null;
    private RentalRepository repository = null;

    private RentalServiceImpl(){
        repository = RentalRepository.getRepository();
    }

    public static RentalServiceImpl getService(){
        if (service ==null){
            service = new RentalServiceImpl();
        }
        return service;
    }

    @Override
    public Rental create(Rental rental) {
        Rental created = repository.create(rental);
        return created;
    }

    @Override
    public Rental read(String s) {
        return null;
    }

    @Override
    public Rental update() {
        return null;
    }

    @Override
    public Rental read(Integer rentalId) {
        Rental read = repository.read(rentalId);
        return read;
    }


    public Rental update(Rental rental) {
        Rental updated = repository.update(rental);
        return updated;
    }

    @Override
    public boolean delete(String s, String rentalId) {
        Rental rentalToDelete = read(rentalId);
        if (rentalToDelete == null)
            return false;
        s.isEmpty();
        return true;
    }

    @Override
    public boolean delete(Integer rentalId) {
        boolean success = repository.delete(rentalId);
        return success;
    }

    @Override
    public Set<Rental> getAll() {
        return repository.getAll();
    }
}
*/