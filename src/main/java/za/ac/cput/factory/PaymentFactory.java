// Payment Factory Class
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.factory;


import za.ac.cput.TruckRental.domain.Payment;
import za.ac.cput.TruckRental.util.Helper;

import java.time.LocalDate;

public class PaymentFactory {

    public static Payment createPayment(int paymentId, String paymentType, double paymentAmount, LocalDate paymentDate){
        // paymentType.isEmpty() || paymentType.equalsIgnoreCase("null")
        if(Helper.isNullorEmpty(paymentType) || Helper.isNullorEmpty(String.valueOf(paymentDate)))
            return null;

        return new Payment.Builder().setPaymentId(paymentId)
                .setPaymentType(paymentType)
                .setPaymentAmount(paymentAmount)
                .setPaymentDate(paymentDate)
                .build();
    }


}
