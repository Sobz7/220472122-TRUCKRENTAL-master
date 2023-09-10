//Admin Service Implementation
//Author: Chenique Jacobs (220388172)
//Date: 14/06/2023
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Admin;
import za.ac.cput.repository.IAdminRepository;
import za.ac.cput.service.AdminService;

import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService {

    private static AdminServiceImpl service = null;

    @Autowired
    private IAdminRepository repository;


    @Override
    public Admin create(Admin adminId){
        return this.repository.save(adminId);
    }

    @Override
    public Admin read(String adminId){
        return repository.findByAdminId(adminId);
    }

    @Override
    public Admin update(Admin admin){
        if (this.repository.existsById(admin.getAdminId()))
            return this.repository.save(admin);
        return null;
    }

    @Override
    public void delete (String adminId){
        this.repository.deleteById(adminId);
    }

    public Set<Admin> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }



}
