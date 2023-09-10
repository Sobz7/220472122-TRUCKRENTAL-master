<<<<<<< HEAD
/*
=======
package za.ac.cput.repository.impl;/*
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
//Customer Repository .java
// Class for the Customer
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.repository.impl;


import za.ac.cput.domain.Customer;
import za.ac.cput.repository.ICustomerRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository {

    private static CustomerRepository repository = null;
    private Set<Customer> customerDB =null;

    private CustomerRepository(){
        customerDB = new HashSet<Customer>();
    }

    public static CustomerRepository getRepository(){
        if(repository == null){
            repository = new CustomerRepository();
        }
        return repository;
    }



    public Customer create(Customer customer){

        boolean success = customerDB.add(customer);
        if(!success)
            return null;
        return customer;
    }



    public Customer read(String customerId) {
        for(Customer e : customerDB){

                if (e.getCustomerId().equals(customerId))
                return e;
        }
        return null;


    }




    public Customer update(Customer customer) {
        Customer oldCustomer = read(customer.getCustomerId());
        if(oldCustomer != null){
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;

        }
        return null;
    }


    public boolean delete() {
        return false;
    }


    public boolean delete(String customerId) {
        Customer customerToDelete = read(customerId);
        if(customerToDelete == null)
            return false;
        customerDB.remove(customerToDelete);
        return true;
    }


    public Set <Customer> getAll() {
        return customerDB;
    }



}


 */