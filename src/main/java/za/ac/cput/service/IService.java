//Domain  Customer class
// Pojo Customer
// Author: Jordy Meye (220072841)
// Date: 10 06 2023

package za.ac.cput.service;

public interface IService <T, ID> {

    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}