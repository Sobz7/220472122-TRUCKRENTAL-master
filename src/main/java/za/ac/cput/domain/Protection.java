<<<<<<< HEAD
/*
//Domain  Protection class
// Pojo Portection
// Author: Jordy Meye (220072841)
// Date: 24 03 2023

package za.ac.cput.domain;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;

=======
package za.ac.cput.domain;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e

@Entity
public class Protection implements Serializable {

<<<<<<< HEAD
//@OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//private ArrayList<Customer> customer = new ArrayList<>();
=======

>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
    @Id
    private String insuranceId;
    private String truckId;
    private String policyType;
    private String startDate;
    private String endDate;

<<<<<<< HEAD
=======

>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
    protected Protection(){}

    public Protection(Builder builder){
        this.insuranceId= builder.insuranceId;
        this.truckId= builder.truckId;
        this.policyType= builder.policyType;
        this.startDate = builder.startDate;
        this.endDate= builder.endDate;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Protection{" +
                "insuranceId='" + insuranceId + '\'' +
                ", truckId='" + truckId + '\'' +
                ", policyType='" + policyType + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public static class Builder{

        private String insuranceId;
        private String truckId;
        private String policyType;
        private String startDate;
        private String endDate;

        public Builder setInsuranceId(String insuranceId) {
            this.insuranceId = insuranceId;
            return this;
        }

        public Builder setTruckId(String truckId) {
            this.truckId = truckId;
            return this;
        }

        public Builder setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder copy(Protection protection){
            this.insuranceId = protection.insuranceId;
            this.truckId= protection.truckId;
            this.policyType= protection.policyType;
            this.startDate = protection.startDate;
            this.endDate= protection.endDate;
            return this;

        }

        public Protection build(){
            return new Protection(this);
        }
    }
<<<<<<< HEAD
}
*/
=======
}
>>>>>>> 76685f55c2dfca669fefd840bee826eb1458435e
