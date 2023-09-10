//Return Truck Respository interface
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.ReturnTruck;

@Repository
public interface IReturnTruckRepository extends JpaRepository<ReturnTruck, String > {
    ReturnTruck findReturnTruckId(String returnTruckId);
}
