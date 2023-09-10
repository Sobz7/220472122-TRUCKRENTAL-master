package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Truck implements Serializable {
    @Id
    private String truckId;
    private String model;
    private int year;
    private boolean availability;
    private String licensePlate;
    private double currentMileage;
    private int brandId;
}


