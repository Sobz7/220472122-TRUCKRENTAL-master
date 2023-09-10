/*
IDriverRepository.java
1st interface
@Author: Siyakha Manisi (219239657)
09 April 2023
* */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Driver;

import java.util.Set;

@Repository
public interface IDriverRepository extends JpaRepository<Driver, String> {
    Driver findByDriverId(String driverID);
}

