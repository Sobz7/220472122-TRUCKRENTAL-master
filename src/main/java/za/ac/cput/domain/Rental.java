// Rental Class.Domain
// Rental POJO Class
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Rental {
@Id
@GeneratedValue
    private int rentalId;
    private int customerId;
    private  int truckId;
    private LocalDate startDate;
    private LocalDate endDate;
    private double rentalCost;

    public Rental(){}
    private Rental(Builder builder){
        this.rentalId = builder.rentalId;
        this.customerId = builder.customerId;
        this.truckId = builder.truckId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.rentalCost = builder.rentalCost;

    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTruckId() {
        return truckId;
    }

    public void setTruckId(int truckId) {
        this.truckId = truckId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }
    @Override
    public String toString() {
        return "Rental{" +
                "rentalId=" + rentalId +
                ", customerId=" + customerId +
                ", truckId=" + truckId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", rentalCost=" + rentalCost +
                '}';
    }
    public static class Builder{

        private int rentalId;
        private int customerId;
        private  int truckId;
        private LocalDate startDate;
        private LocalDate endDate;
        private double rentalCost;

        public Builder setRentalId(int rentalId) {
            this.rentalId = rentalId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setTruckId(int truckId) {
            this.truckId = truckId;
            return this;
        }

        public Builder setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setRentalCost(double rentalCost) {
            this.rentalCost = rentalCost;
            return this;
        }
        public Builder copy (Rental rental){
            this.rentalId = rental.rentalId;
            this.customerId = rental.customerId;
            this.truckId = rental.truckId;
            this.startDate = rental.startDate;
            this.endDate = rental.endDate;
            this.rentalCost = rental.rentalCost;
            return this;
        }
        public Rental build(){
            return new Rental(this);
        }

    }
}
