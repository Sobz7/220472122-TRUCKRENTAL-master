<<<<<<< HEAD
/* package za.ac.cput.service.impl;

import za.ac.cput.domain.Protection;
import za.ac.cput.repository.impl.ProtectionRepository;
import za.ac.cput.service.ProtectionService;

import java.util.Set;

public class ProtectionServiceImpl implements ProtectionService {
    private static ProtectionService service = null;
    private ProtectionRepository repository = null ;

    private ProtectionServiceImpl(){
        repository = ProtectionRepository.getRepository();
    }

    public static ProtectionService getService(){
        if(service == null){
            service = new ProtectionServiceImpl();

        }
        return service;
    }

    public Protection create (Protection protection){
        Protection created = repository.create(protection);
        return  created;
    }


    public Protection read(String insuranceId) {
        Protection read = repository.read(insuranceId);
        return read;
    }

    @Override
    public Protection update() {
        return null;
    }

    public Protection update(Protection protection) {
        Protection updated = repository.update(protection);
        return updated;
    }

    public boolean delete ( String id){
        boolean success = repository.delete(id);
        return success ;
    }


    public Set<Protection> getAll(){return repository.getAll();}

}
*/
=======
//package za.ac.cput.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.Protection;
//import za.ac.cput.repository.IProtectionRepository;
//
//import za.ac.cput.service.ProtectionService;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class ProtectionServiceImpl implements ProtectionService {
//
//    private static ProtectionService service = null;
//
//
//
//    @Autowired
//    private IProtectionRepository repository;
//
//
//
//
//    @Override
//    public Protection create ( Protection insuranceId){
//        return this.repository.save(insuranceId);
//    }
//
//
//    @Override
//    public Protection read(String insuranceId) {
//        return repository.findByProtectionId(insuranceId);
//    }
//
//    @Override
//    public Protection update(Protection protection) {
//        if (this.repository.existsById(protection.getCustomerId()))
//            return this.repository.save(protection);
//        return  null;
//    }
//
//    @Override
//
//    public void delete ( String insuranceId){
//        this.repository.deleteById(insuranceId);
//
//    }
//
//
//    public Set<Protection> getAll(){return this.repository.findAll().stream().collect(Collectors.toSet());
//    }
//
//}
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
