package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Rental;
import za.ac.cput.factory.RentalFactory;
import za.ac.cput.service.impl.RentalServiceImpl;
import java.util.Set;
    @RestController
    @RequestMapping(path = "/rental")
    public class RentalController {

        @Autowired
        RentalServiceImpl rentalService;

        @PostMapping("/create")
        public Rental create(@RequestBody Rental rental) {
            Rental rental1 = RentalFactory.createRental(rental.getRentalId(), rental.getCustomerId(), rental.getTruckId(), rental.getStartDate(), rental.getEndDate(), rental.getRentalCost());
            return rentalService.create(rental1);
        }

        @GetMapping("/read/{id}")
        public Rental read(@PathVariable String id) {
            return rentalService.read(id);
        }

        @PostMapping("/update")
        public Rental update(@RequestBody Rental rental) {
            return rentalService.update(rental);
        }

        @DeleteMapping("/delete/{id}")
        public boolean delete(@PathVariable String id, String rentalId) {
            rentalService.delete(id, rentalId);
            return true;
        }

        @GetMapping("/getAll")
        public Set<Rental> getAll() {
            return rentalService.getAll();
        }
    }