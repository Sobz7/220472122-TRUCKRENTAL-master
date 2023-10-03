// Payment Class.Domain
// Payment POJO Class
// Author: Sobantu Malotana (220472122)
// Date: 07 April 2023

package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Payment {
@Id
@GeneratedValue
    private int paymentId;
    private String paymentType;
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(){}
    private Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.paymentType = builder.paymentType;
        this.paymentAmount = builder.paymentAmount;
        this.paymentDate = builder.paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + paymentAmount +
                ", paymentDate='" + paymentDate + '\'' +
                '}';
    }
    public static class Builder{

        private int paymentId;
        private String paymentType;
        private double paymentAmount;
        private LocalDate paymentDate;

        public Builder setPaymentId(int paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder setPaymentAmount(double paymentAmount) {
            this.paymentAmount = paymentAmount;
            return this;
        }

        public Builder setPaymentDate(LocalDate paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            this.paymentType = payment.paymentType;
            this.paymentAmount = payment.paymentAmount;
            this.paymentDate = payment.paymentDate;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }

    }

}
