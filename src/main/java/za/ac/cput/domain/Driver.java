/*
Driver.java
1st Domain entity
@Author: Siyakha Manisi (219239657)
09 April 2023
* */
package za.ac.cput.domain;

import java.util.Objects;

public class Driver {
    private String driverID;
    private String name;
    private String surname;
    private String email;
    private int idNumber;
    private String licenseNo;
    private int telephone;
    private int rentalID;

    private Driver() {

    }

    private Driver(Builder builder) {
        this.driverID = builder.driverID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.idNumber = builder.idNumber;
        this.licenseNo = builder.licenseNo;
        this.telephone = builder.telephone;
        this.rentalID = builder.rentalID;

    }

    public String getDriverID() {
        return driverID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getLicenseNo() {
        return licenseNo;
    }


    public int getTelephone() {
        return telephone;
    }

    public int getRentalID() {
        return rentalID;
    }

    @Override
    public boolean equals(Object e)
    {
        if (this == e) return true;
        if (e == null || getClass() != e.getClass()) return false;
        Driver driver = (Driver) e;
        return Objects.equals(driverID, driver.driverID) && Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname) && Objects.equals(email, driver.email) && Objects.equals(idNumber, driver.idNumber) && Objects.equals(licenseNo, driver.licenseNo) && Objects.equals(telephone, driver.telephone) && Objects.equals(rentalID, driver.rentalID);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(driverID, name, surname, email, idNumber, licenseNo, telephone, rentalID);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID='" + driverID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", licenseNo='" + licenseNo + '\'' +
                ", telephone=" + telephone +
                ", rentalID=" + rentalID +
                '}';
    }

    public static class Builder {
        String driverID;
        String name;
        String surname;
        String email;
        int idNumber;
        String licenseNo;
        int telephone;
        int rentalID;

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setIdNumber(int idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder setLicenseNo(String licenseNo) {
            this.licenseNo = licenseNo;
            return this;
        }

        public Builder setTelephone(int telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder setRentalID(int rentalID) {
            this.rentalID = rentalID;
            return this;
        }

        public Builder copy(Driver driver) {
            this.driverID = driver.driverID;
            this.name = driver.name;
            this.surname = driver.surname;
            this.idNumber = driver.idNumber;
            this.licenseNo = driver.licenseNo;
            this.telephone = driver.telephone;
            this.rentalID = driver.rentalID;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }
    }
}
