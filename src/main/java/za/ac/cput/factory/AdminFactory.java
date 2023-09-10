//AdminFactory Class
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023
package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(String adminId, String name, String surname, String email){
        if(!Helper.isValidEmail(email))
            return null;

        if(Helper.isNullorEmpty(String.valueOf(adminId))||Helper.isNullorEmpty(name)||Helper.isNullorEmpty(surname))
            return null;

        return new Admin.Builder()
                .setAdminId(adminId)
                .setName(name)
                .setSurname(surname)
                .setEmail(email)
                .build();

    }
}
