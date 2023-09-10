/*
LoginDetailRepository.java
2nd Repository Class
@Author: Siyakha Manisi (219239657)
09 April 2023
* */

/*
package za.ac.cput.repository.impl;

import za.ac.cput.domain.LoginDetail;
import za.ac.cput.repository.ILoginDetailRepository;

import java.util.HashSet;
import java.util.Set;

public class LoginDetailRepository implements ILoginDetailRepository {
    public static LoginDetailRepository repo = null;
    private Set<LoginDetail> loginDB = null;

    private LoginDetailRepository()
    {
        loginDB = new HashSet<LoginDetail>();
    }
    public static LoginDetailRepository getRepository()
    {
        if (repo == null) {
            repo = new LoginDetailRepository();
        }
        return repo;
    }

    @Override
    public LoginDetail create(LoginDetail ld)
    {
        boolean success = loginDB.add(ld);
        if (!success)
            return null;
        return ld;
    }

    @Override
    public LoginDetail read(String username)
    {
        LoginDetail ld = loginDB.stream()
                .filter(l -> l.getUsername().equals(username))
                .findAny()
                .orElse(null);
        return ld;
    }

    @Override
    public LoginDetail update(LoginDetail ld)
    {
        LoginDetail oldDetails = read(ld.getUsername());
        if (oldDetails != null)
        {
            loginDB.remove(oldDetails);
            loginDB.add(ld);
            return ld;
        }
        return null;
    }

    @Override
    public boolean delete(String username)
    {
        LoginDetail detailToDelete = read(username);
        if (detailToDelete == null)
            return false;
        loginDB.remove(detailToDelete);
        return true;
    }
    @Override
    public Set<LoginDetail> getAll()
    {
        return loginDB;
    }
}
*/



