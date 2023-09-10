<<<<<<< HEAD
/*package za.ac.cput.controller;
=======
package za.ac.cput.controller;/*package za.ac.cput.controller;
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e

import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import za.ac.cput.domain.Protection;

import za.ac.cput.factory.ProtectionFactory;

import za.ac.cput.service.ProtectionService;

import java.util.Set;

@RestController
@RequestMapping("/protection")
public class ProtectionController {

    @Autowired
    private static ProtectionService protectionService;
    Protection protection ;



    @PostMapping("/create")

    public Protection create(@RequestBody ProtectionService protectionService  ) {
        Protection newProtection = ProtectionFactory.createProtection(protection.getTruckId(), protection.getPolicyType(), protection.getStartDate(), protection.getEndDate());
        return protectionService.create(newProtection);
    }

    @GetMapping("/read/{id}")
    public Protection read(@PathVariable String insuranceId){
        return protectionService.read(insuranceId);
    }

    @Disabled
    @PostMapping("/update")
    public Protection update(Protection protection){
        return protectionService.update();
    }

    @DeleteMapping("delete/{insuranceId}")
    public boolean delete(@PathVariable String id){
        return protectionService.delete(insuranceId);
    }

    @GetMapping("/getAll")
    public Set<Protection> getall() {
        return protectionService.getAll();
    }

}
*/