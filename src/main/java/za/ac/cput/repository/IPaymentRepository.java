// IPayment Repository Class.java
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.TruckRental.domain.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Integer> {

/*
    Payment create(Payment payment);

    Payment read(int paymentId);

    Payment update(Payment payment);

    boolean delete(int paymentId);

    Set<Payment> getAll();

    Payment read(String s);

    boolean delete(String s);

   /* Payment read(int paymentId);

    default boolean delete(int paymentId) {
        return false;
    }
    public Set<Payment> getAll();*/
}
