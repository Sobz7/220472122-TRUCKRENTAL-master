// IRental Repository Class.java
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.TruckRental.domain.Rental;

@Repository
public interface IRentalRepository extends JpaRepository<Rental, Integer> {

/*
    Rental read(int rentalId);

    boolean delete(int rentalId);

    public Set<Rental> getAll();
*/
}

