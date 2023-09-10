package za.ac.cput.service.impl;

import za.ac.cput.domain.Payment;
import za.ac.cput.repository.impl.PaymentRepository;
import za.ac.cput.service.PaymentService;

import java.util.Set;

public abstract class PaymentServiceImpl implements PaymentService {
    private static PaymentServiceImpl service = null;
    private PaymentRepository repository = null;

    private PaymentServiceImpl(){
        repository = PaymentRepository.getRepository();
    }
    public static PaymentServiceImpl getService(){
        if (service ==null){
            service = new PaymentServiceImpl() {
                @Override
                public Payment read(int paymentId) {
                    return null;
                }

                @Override
                public boolean delete(int paymentId) {
                    return false;
                }
            };
        }
        return service;
    }

    @Override
    public Payment create(Payment payment) {
        Payment created = repository.create(payment);
        return created;
    }

    @Override
    public Payment read(String s) {
        return null;
    }

    @Override
    public Payment read(Integer paymentId) {
        Payment read = repository.read(paymentId);
        return read;
    }

    @Override
    public Payment update(Payment payment) {
        Payment updated = repository.update(payment);
        return updated;
    }

    @Override
    public boolean delete(String s, String paymentId) {
        Payment rentalToDelete = read(paymentId);
        if (rentalToDelete == null)
            return false;
        s.isEmpty();
        return true;
    }

    @Override
    public boolean delete(Integer paymentId) {
        boolean success = repository.delete(paymentId);
        return success;
    }

    @Override
    public Set<Payment> getAll() {
        return repository.getAll();
    }
}
