/*
LoginDetail Service Implementation Class
LoginDetailServiceImpl.java
@Author: Siyakha Manisi (219239657)
12 June 2023
*/

package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.LoginDetail;
import za.ac.cput.repository.ILoginDetailRepository;
import za.ac.cput.service.LoginDetailService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public abstract class LoginDetailServiceImpl implements LoginDetailService{

    private static LoginDetailServiceImpl service = null;

    @Autowired
    private ILoginDetailRepository repo;

    public LoginDetail create (LoginDetail ldId)
    {
        return this.repo.save(ldId);

    }

    public LoginDetail read (LoginDetail ld)
    {
        return repo.findByldId(ld);

    }
    public LoginDetail update (LoginDetail username)
    {
        if (this.repo.existsById(username.getUsername()))
        return this.repo.save(username);
        return null;

    }

    public void delete (String username)
    {
        this.repo.deleteById(username);

    }

    public Set<LoginDetail> getAll()
    {
        return this.repo.findAll().stream().collect(Collectors.toSet());

    }

}
