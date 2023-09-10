package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Brand;
import za.ac.cput.factory.BrandFactory;

import za.ac.cput.service.BrandService;
import za.ac.cput.service.impl.BrandServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    BrandServiceImpl brandService;


    @PostMapping("/create")
    public Brand create(@RequestBody Brand brand) {
        Brand newBrand = BrandFactory.createBrand(brand.getbrandId(), brand.getbrandName(), brand.getModel(), customer.getColor(), brand.getbrandId());
        return brandService.create(newBrand);
    }

    @GetMapping("/read/{id}")
    public Brand read(@PathVariable String id) {
        return brandService.read(id);
    }

    @PostMapping("/update")
    public Brand update(@RequestBody Brand brand) {
        return brandService.update(brand);
    }

    @DeleteMapping("/delete/{id}")
   // public boolean delete(@PathVariable .Scalar.String id){ brandService.delete(id);}

    @GetMapping("/getAll")
    public Set<Brand> getAll() {
        return brandService.getAll();
    }
}
