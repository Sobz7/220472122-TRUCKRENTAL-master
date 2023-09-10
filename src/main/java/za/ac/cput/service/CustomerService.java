//Domain  Customer class
// Pojo Customer
// Author: Jordy Meye (220072841)
// Date: 10 06 2023
package za.ac.cput.service;

import za.ac.cput.domain.Customer;

import java.util.List;
import java.util.Set;

public interface CustomerService extends  IService<Customer, String>{
//create, read, update, delete
 Set<Customer> getAll();
}
