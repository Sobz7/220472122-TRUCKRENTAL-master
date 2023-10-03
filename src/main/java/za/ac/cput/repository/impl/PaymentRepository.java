// Payment Repository Class.java
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.repository.impl;


import za.ac.cput.TruckRental.repository.IPaymentRepository;


public abstract class PaymentRepository implements IPaymentRepository {
/*
    private static PaymentRepository repository = null;
    private Set<Payment> paymentDB = null;

    private PaymentRepository() {
        paymentDB = new HashSet<Payment>();
    }
    @Override
    public Payment create(Payment payment) {
        boolean success = paymentDB.add(payment);
        if (!success)
            return null;
        return payment;
    }

    @Override
    public Payment read(int paymentId) {
        for (Payment e : paymentDB) {
            if (Objects.equals(e.getPaymentId(), paymentId)) ;
            return e;
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        Payment oldPayment = read((Integer) payment.getPaymentId());
        if (oldPayment != null) {
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(int paymentId) {
        Payment paymentToDelete = read(paymentId);
        if (paymentToDelete == null)
            return false;
        paymentDB.remove(paymentToDelete);
        return true;
    }

    @Override
    public Set<Payment> getAll() {
        return paymentDB;
    }*/
}
