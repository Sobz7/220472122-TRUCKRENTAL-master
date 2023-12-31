package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Integer> {


    Brand findByBrandId(int brandId);
}
