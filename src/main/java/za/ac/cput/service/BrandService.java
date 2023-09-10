package za.ac.cput.service;

import za.ac.cput.domain.Brand;

import java.util.List;
import java.util.Set;

public interface BrandService extends  IService<Brand, String>{
//create, read, update, delete
 Set<Brand> getAll();
}