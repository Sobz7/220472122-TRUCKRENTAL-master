package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;
import za.ac.cput.service.impl.AdminServiceImpl;
import java.util.Set;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/create")
    public Admin create(@RequestBody Admin admin){
        Admin newAdmin = AdminFactory.createAdmin(admin.getAdminId(),admin.getName(),admin.getSurname(),admin.getEmail());
        return adminService.create(newAdmin);
    }

    @GetMapping("/read/{id}")
    public Admin read(@PathVariable String id)
    {
        return adminService.read(id);
    }

    @PostMapping("/update")
    public Admin update (@RequestBody Admin admin)
    {
        return adminService.update(admin);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete (@PathVariable String id) {adminService.delete(id);
        return true;
    }

    @GetMapping("/getAll")
    public Set<Admin> getAll(){
        return adminService.getAll();
    }



}
