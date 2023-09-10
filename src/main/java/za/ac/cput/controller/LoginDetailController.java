/*
LoginDetailController.java
2nd Controller Entity
@Author: Siyakha Manisi (219239657)
09 April 2023
* */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.factory.LoginDetailFactory;
import za.ac.cput.service.impl.LoginDetailServiceImpl;
import java.util.Set;


public class LoginDetailController {
    @Autowired
    LoginDetailServiceImpl loginDetailService;

    @PostMapping("/create")
    public LoginDetail create(@RequestBody LoginDetail ld) {
        LoginDetail lgd = LoginDetailFactory.createLoginDetail(ld.getUsername(), ld.getPassword());
        return loginDetailService.create(lgd);
    }

    @GetMapping("/read/{id}")
    public LoginDetail read(@PathVariable String id) {
        return loginDetailService.read(id);
    }

    @PostMapping("/update")
    public LoginDetail update(@RequestBody LoginDetail ld) {
        return loginDetailService.update(ld);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        loginDetailService.delete(id);
        return true;
    }

    @GetMapping("/getAll")
    public Set<LoginDetail> getAll() {
        return loginDetailService.getAll();
    }
}


