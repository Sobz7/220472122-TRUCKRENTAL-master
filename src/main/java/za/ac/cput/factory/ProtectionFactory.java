<<<<<<< HEAD
/**
 * //PRotection Factory class
=======

//PRotection Factory class
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
// java class
// Author: Jordy Meye (220072841)
// Date: 24 03 2023


package za.ac.cput.factory;

import za.ac.cput.domain.Protection;
import za.ac.cput.util.Helper;

public class ProtectionFactory {

    public static Protection createProtection(  String truckId, String policyType, String startDate, String endDate){
        String insuranceId = Helper.generateId();


        return new Protection.Builder().setInsuranceId(insuranceId).setTruckId(truckId).setPolicyType(policyType).setStartDate(startDate).setEndDate(endDate).build();
    }
}
<<<<<<< HEAD
*/
=======

>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
