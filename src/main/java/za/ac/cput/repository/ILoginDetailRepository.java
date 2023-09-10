/*
ILoginDetailRepositoru.java
2nd Interface
@Author: Siyakha Manisi (219239657)
09 April 2023
* */

package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.LoginDetail;

import java.util.Set;

@Repository
public interface ILoginDetailRepository extends JpaRepository<LoginDetail, String> {

    LoginDetail findByldId(LoginDetail ldId);
}
