
//Admin Repository Class
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023

/*
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Admin;
import za.ac.cput.repository.IAdminRepository;

import java.util.HashSet;
import java.util.Set;

public class AdminRepository implements IAdminRepository {

    private static AdminRepository repository = null;
    private Set<Admin> adminDB = null;

    private AdminRepository(){
        adminDB = new HashSet<Admin>();
    }

    public static AdminRepository getRepository(){
        if(repository ==null){
            repository = new AdminRepository();
        }
        return repository;

    }

    @Override
    public Admin create(Admin admin) {
        boolean success = adminDB.add(admin);
        if(!success)
            return null;
        return admin;
    }



    @Override
    public Admin read(String adminId) {
        for(Admin e : adminDB){
            if(e.getAdminId() == Integer.parseInt((adminId)));
                return e;
        }
        return null;
    }

    @Override
    public Admin update(Admin admin) {
        Admin oldAdmin = read(String.valueOf(admin.getAdminId()));
        if(oldAdmin !=null){
            adminDB.remove(oldAdmin);
            adminDB.add(admin);
            return admin;
        }
        return null;
    }


    public boolean delete() {
        return false;
    }

    @Override
    public boolean delete(String adminId) {
        Admin adminToDelete = read(adminId);
        if(adminToDelete ==null)
        return false;
        adminDB.remove(adminToDelete);
        return true;
    }

    @Override
    public Set<Admin> getAll() {
        return adminDB;
    }
}
*/