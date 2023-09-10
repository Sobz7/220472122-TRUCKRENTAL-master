package za.ac.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.factory.PaymentFactory;
import za.ac.cput.service.PaymentService;
import za.ac.cput.service.impl.PaymentServiceImpl;

import java.util.Set;
@RestController
@RequestMapping("/payment")
public class PaymentController {

    PaymentServiceImpl paymentService;
    @PostMapping("/create")
    public Payment create(@RequestBody Payment payment) {
        Payment payment1 = PaymentFactory.createPayment(payment.getPaymentId(), payment.getPaymentType(), payment.getPaymentAmount(), payment.getPaymentDate());
        return paymentService.create(payment1);
    }

    @GetMapping("/read/{id}")
    public Payment read(@PathVariable String id) {
        return paymentService.read(id);
    }

    @PostMapping("/update")
    public Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id, String paymentId) {
        paymentService.delete(id, paymentId);
        return true;
    }

    @GetMapping("/getAll")
    public Set<Payment> getAll() {
        return PaymentService.getAll();
    }
}

