package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
<<<<<<< HEAD

import za.ac.cput.service.CustomerService;
=======
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
import za.ac.cput.service.impl.CustomerServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;


    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer) {
        Customer newCustomer = CustomerFactory.createCustomer(customer.getName(), customer.getSurname(), customer.getEmail(), customer.getAddress(), customer.getLicenseNumber());
        return customerService.create(newCustomer);
    }

    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id) {
        return customerService.read(id);
    }

    @PostMapping("/update")
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/delete/{id}")
   // public boolean delete(@PathVariable .Scalar.String id){ customerService.delete(id);}

    @GetMapping("/getAll")
    public Set<Customer> getAll() {
        return customerService.getAll();
    }
}
