//ReturnTruckFactory Class
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023

package za.ac.cput.factory;

import za.ac.cput.domain.ReturnTruck;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class ReturnTruckFactory {
    public static ReturnTruck createReturnTruck(String returnId, int rentalId, double overdueCharge, LocalDate returnDate){
        if(Helper.isNullorEmpty(String.valueOf(returnId))||Helper.isNullorEmpty(String.valueOf(rentalId))||Helper.isNullorEmpty(String.valueOf(overdueCharge))||Helper.isNullorEmpty(String.valueOf(returnDate)))
            return null;
        return new ReturnTruck.Builder()
                .setReturnId(returnId)
                .setRentalId(rentalId)
                .setOverdueCharge(overdueCharge)
                .setReturnDate(returnDate)
                .build();

    }

}
