package za.ac.cput.factory;

import za.ac.cput.domain.Truck;
import za.ac.cput.util.Helper;

public class TruckFactory {
    public static Truck createTruck(String model, int year, boolean availability, String licencePlate , double currentMileage, int brandId){
        if (Helper.isNullorEmpty(model)|| Helper.isNullorEmpty(licencePlate)){
            return null;
        }
        String random_Id = Helper.generateId().toString();
        return Truck.builder().truckId(random_Id).model(model)
                .year(year).availability(availability).licensePlate(licencePlate).currentMileage(currentMileage).brandId(brandId).build();
    }
}
