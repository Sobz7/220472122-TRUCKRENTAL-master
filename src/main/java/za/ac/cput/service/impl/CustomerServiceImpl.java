//Domain  Customer class
// Pojo Customer
// Author: Jordy Meye (220072841)
// Date: 10 06 2023
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Customer;
import za.ac.cput.repository.ICustomerRepository;
<<<<<<< HEAD
//import za.ac.cput.repository.impl.CustomerRepository;
=======
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
import za.ac.cput.service.CustomerService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static CustomerService service = null;
    @Autowired

    private ICustomerRepository repository;




@Override
    public Customer create ( Customer customerId){
    return this.repository.save(customerId);
    }


    @Override
    public Customer read(String customerId) {
        return repository.findByCustomerId(customerId);
    }

   @Override
    public Customer update(Customer customer) {
        if (this.repository.existsById(customer.getCustomerId()))
            return this.repository.save(customer);
        return  null;
    }

    @Override

    public void delete ( String customerId){
         this.repository.deleteById(customerId);

    }


    public Set<Customer> getAll(){return this.repository.findAll().stream().collect(Collectors.toSet());
    }

}
