<<<<<<< HEAD
/** //Protection Repository .java
=======
package za.ac.cput.repository.impl; /** //Protection Repository .java
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
// Class for the Protection Repository
// Author: Jordy Meye (220072841)
// Date: 24 03 2023


package za.ac.cput.repository.impl;

import za.ac.cput.domain.Protection;
import za.ac.cput.repository.IProtectionRepository;

import java.util.HashSet;
import java.util.Set;

public class ProtectionRepository implements IProtectionRepository {

    private static  ProtectionRepository repository = null;
    private Set<Protection> protectionDB =null;

    private ProtectionRepository(){
        protectionDB = new HashSet<Protection>();
    }

    public static ProtectionRepository getRepository(){
        if(repository == null){
            repository = new ProtectionRepository();
        }
        return repository;
    }


    @Override
    public Protection create(Protection protection){

        boolean success = protectionDB.add(protection);
        if(!success)
            return null;
        return protection;
    }

    @Override
    public Protection read(String insuranceID) {
        for(Protection p : protectionDB){

                if (p.getInsuranceId().equals(insuranceID))
                return p;
        }
        return null;


    }

    @Override
    public Protection update(Protection protection) {
        Protection oldProtection = read(protection.getInsuranceId());
        if(oldProtection != null){
            protectionDB.remove(oldProtection);
            protectionDB.add(protection);
            return protection;

        }
        return null;
    }


    public boolean delete() {
        return false;
    }


    public boolean delete(String insuranceID) {
        Protection protectionToDelete = read(insuranceID);
        if(protectionToDelete == null)
            return false;
        protectionDB.remove(protectionToDelete);
        return true;
    }


    public Set<Protection> getAll() {
        return protectionDB;
    }

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public T read(insuranceId id) {
        return null;
    }

    @Override
    public T update(insuranceId t) {
        return null;
    }

    @Override
    public boolean delete(insuranceId id) {
        return false;
    }
}
*/