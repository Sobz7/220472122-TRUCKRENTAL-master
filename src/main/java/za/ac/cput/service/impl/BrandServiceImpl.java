package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Brand;
import za.ac.cput.repository.IBrandRepository;
//import za.ac.cput.repository.impl.BrandRepository;
import za.ac.cput.service.BrandService;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    private static BrandService service = null;
    @Autowired

    private IBrandRepository repository;




@Override
    public Brand create (Brand brandId){
    return this.repository.save(brandId);
    }


    @Override
    public Brand read(int brandId) {
        return repository.findBybrandId(brandId);
    }

   @Override
    public Brand update(Brand brand) {
        if (this.repository.existsById(brand.getBrandId()))
            return this.repository.save(brand);
        return null;
    }

    @Override

    public void delete (int brandId){
         this.repository.deleteById(brandId);

    }


    public Set<Brand> getAll(){return this.repository.findAll().stream().collect(Collectors.toSet());
    }

}
