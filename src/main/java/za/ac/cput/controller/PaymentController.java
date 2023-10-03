package za.ac.cput.controller;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.TruckRental.domain.Payment;
import za.ac.cput.TruckRental.repository.IPaymentRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api/v1/payment")
public class PaymentController {

    //@Autowired
    private final IPaymentRepository iPaymentRepository;

    public PaymentController(IPaymentRepository iPaymentRepository) {
        this.iPaymentRepository = iPaymentRepository;
    }

    @PostMapping
    public void addPayment(@RequestBody NewPaymentRequest request) {
        Payment payment = new Payment();
        payment.setPaymentId(request.paymentId());
        payment.setPaymentType(request.paymentType());
        payment.setPaymentAmount(request.paymentAmount());
        payment.setPaymentDate(request.paymentDate());
        iPaymentRepository.save(payment);
    }
    @GetMapping()
    public List<Payment> getPayments() {
        return iPaymentRepository.findAll();
    }
    record NewPaymentRequest(

            int paymentId,
            String paymentType,
            double paymentAmount,
            LocalDate paymentDate

    ) {
    }
    @PutMapping("{paymentId}")
    public void updatePayment(@RequestBody NewPaymentRequest request) {
        Payment payment = new Payment();
        payment.setPaymentId(request.paymentId());
        payment.setPaymentType(request.paymentType());
        payment.setPaymentAmount(request.paymentAmount());
        payment.setPaymentDate(request.paymentDate());
        iPaymentRepository.save(payment);
    }
    @DeleteMapping("{paymentId}")
    public void deletePayment(@PathVariable("paymentId") Integer id) {
        iPaymentRepository.deleteById(id);
    }
}
/*
    PaymentService paymentService;
    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment) {
        Payment payment1 = PaymentFactory.createPayment(
                payment.getPaymentId(),
                payment.getPaymentType(),
                payment.getPaymentAmount(),
                payment.getPaymentDate());
        return paymentService.create(payment1);
    }

    @GetMapping("/read/{id}")
    public Payment read(@PathVariable String id) {
        return paymentService.read();
    }

    @PostMapping("/update")
    public Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id, String paymentId) {
        paymentService.delete();
        return true;
    }
     public Set<Payment> getAll() {
        return PaymentService.getAll();
    }
*/

