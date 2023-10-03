package za.ac.cput.service.impl;

/*
@Service
public abstract class PaymentServiceImpl implements PaymentService {
    private static PaymentServiceImpl service = null;
    private PaymentRepository repository = null;

    private PaymentServiceImpl() {
        repository = PaymentRepository.repository();
    }

    public static PaymentServiceImpl getService() {
        if (service == null) {
            service = new PaymentServiceImpl() {
                @Override
                public Payment create(Payment payment) {
                    Payment created = repository.create(payment);
                    return created;

                }

                @Override
                public Payment update(Payment payment) {
                    Payment updated = repository.update(payment);
                    return updated;
                }

                @Override
                public Payment read(Integer paymentId) {
                    Payment read = repository.read(paymentId);
                    return read;
                }

                @Override
                public boolean delete(Integer paymentId) {
                    boolean success = repository.delete(paymentId);
                    return success;
                }
            };
        }
        return service;
    }
}*/
