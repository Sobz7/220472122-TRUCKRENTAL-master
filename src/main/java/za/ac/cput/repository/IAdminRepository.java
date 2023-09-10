//Admin Repository Interface
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023
package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, String>{
    Admin findByAdminId(String adminId);
}
