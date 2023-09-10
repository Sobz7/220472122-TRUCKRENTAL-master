package za.ac.cput.factory;

import za.ac.cput.domain.Brand;
import za.ac.cput.util.Helper;

public class BrandFactory {

    public static Brand createBrand(int brandId, String brandName, String model, String color) {

        if (!Helper.isNullorEmpty(String.valueOf(brandId)) || Helper.isNullorEmpty(brandName)) 
                
            return null;
        

        return new Customer.Builder()
                .setBrandId(brandId)
                .setBrandName(brandName)
                .setModel(model)
                .setColor(color)
                .build();
    }
}
