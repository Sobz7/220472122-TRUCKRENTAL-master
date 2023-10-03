package za.ac.cput.controller;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.TruckRental.domain.Rental;
import za.ac.cput.TruckRental.exception.ResourceNotFoundException;
import za.ac.cput.TruckRental.repository.IRentalRepository;

import java.lang.module.ResolutionException;
import java.util.List;


@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(path = "api/v1/rentals")
public class RentalController {

    //@Autowired
    private final IRentalRepository iRentalRepository;

    public RentalController(IRentalRepository iRentalRepository) {
        this.iRentalRepository = iRentalRepository;
    }

    @PostMapping
    public Rental createRental(@RequestBody Rental rental) {
        return iRentalRepository.save(rental);
    }

    @GetMapping()
    List<Rental> getAllRentals() {
        return iRentalRepository.findAll();
    }

    @GetMapping("{rentalId}")
    public ResponseEntity<Rental> getRentalById(@PathVariable Integer rentalId) {
        Rental rental = iRentalRepository.findById(rentalId)
                .orElseThrow(() -> new ResolutionException("Rental does not Exists with id:" + rentalId));
        return ResponseEntity.ok(rental);
    }

    @PutMapping("{rentalId}")
    public ResponseEntity<Rental> updateRental(@PathVariable Integer rentalId, @RequestBody Rental rental) {
        Rental updateRental = iRentalRepository.findById(rentalId)
                .orElseThrow(() -> new ResourceNotFoundException("Rental does not Exists with id:" + rentalId));

        updateRental.setCustomerId(rental.getCustomerId());
        updateRental.setTruckId(rental.getTruckId());
        updateRental.setStartDate(rental.getStartDate());
        updateRental.setEndDate(rental.getEndDate());
        updateRental.setRentalCost(rental.getRentalCost());

        iRentalRepository.save(updateRental);

        return ResponseEntity.ok(updateRental);
    }
    @DeleteMapping("{rentalId}")
    public void deleteRental(@PathVariable("rentalId") Integer id) {
        iRentalRepository.deleteById(id);
    }

}
    /*
    record NewRentalRequest(
            int rentalId,
            int customerId,
            int truckId,
            LocalDate startDate,
            LocalDate endDate,
            double rentalCost

    ) {

    }
    @PutMapping("{rentalId}")
    public void updateRental(@RequestBody NewRentalRequest request) {
        Rental rental = new Rental();
        rental.setRentalId(request.rentalId());
        rental.setCustomerId(request.customerId());
        rental.setTruckId(request.truckId());
        rental.setStartDate(request.startDate());
        rental.setEndDate(request.endDate());
        rental.setRentalCost(request.rentalCost());
        iRentalRepository.save(rental);
    }


}
/*
    @GetMapping("/read/{id}")
    public Rentals createRental(Rental rental){
    return IRentalRepository.save(rental);
    }
    }

    @PostMapping("/update")
    public Rental update(@RequestBody Rental rental) {
        return rentalService.update(rental);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id, String rentalId) {
        rentalService.delete();
        return true;
    }

    @GetMapping("/getAll")
    public Set<Rental> getAll() {
        return rentalService.read();
    }*\
}
*/