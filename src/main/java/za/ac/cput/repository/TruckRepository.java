package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Truck;

@Repository
public interface TruckRepository extends JpaRepository<Truck, String> {
}
