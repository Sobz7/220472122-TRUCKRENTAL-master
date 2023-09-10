//ReturnTruck Class
//Author: Chenique Jacobs (220388172)
//Date: 07/04/2023

package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;

import java.time.LocalDate;

@Entity
public class ReturnTruck implements Serializable {
    @Id
    private String returnId;
    private int rentalId;
    private double overdueCharge;
    private LocalDate returnDate;

    protected ReturnTruck(){}

    private ReturnTruck(String returnId,int rentalId,double overdueCharge,LocalDate returnDate){}


    public ReturnTruck(Builder builder){
        this.returnId = builder.returnId;
        this.rentalId = builder.rentalId;
        this.overdueCharge = builder.overdueCharge;
        this.returnDate = builder.returnDate;
    }

    public String getReturnId() {
        return returnId;
    }

    public int getRentalId() {
        return rentalId;
    }

    public double getOverdueCharge() {
        return overdueCharge;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        return "ReturnTruck{" +
                "returnId=" + returnId +
                ", rentalId=" + rentalId +
                ", overdueCharge=" + overdueCharge +
                ", returnDate=" + returnDate +
                '}';
    }

    public static class Builder{
        private String returnId;
        private int rentalId;
        private double overdueCharge;
        private LocalDate returnDate;

        public Builder setReturnId(String returnId){
            this.returnId = returnId;
            return this;
        }

        public Builder setRentalId(int rentalId){
            this.rentalId= rentalId;
            return this;
        }

        public Builder setOverdueCharge(double overdueCharge){
            this.overdueCharge = overdueCharge;
            return this;
        }

        public Builder setReturnDate(LocalDate returnDate){
            this.returnDate = returnDate;
            return this;
        }

        public Builder copy(ReturnTruck returnTruck){
            this.returnId = returnTruck.returnId;
            this.rentalId = returnTruck.rentalId;
            this.overdueCharge = returnTruck.overdueCharge;
            this.returnDate = returnTruck.returnDate;
            return this;
        }

        public ReturnTruck build(){
            return new ReturnTruck(this);
        }

    }

}
