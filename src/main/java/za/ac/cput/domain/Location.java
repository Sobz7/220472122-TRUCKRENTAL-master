package za.ac.cput.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Location {

    private int locationId;

    private String locationName;

    private String address;

    

    private Location (){}
    
    private Location (Builder builder)
    {
        this.locationId = builder.locationId;
        this.locationName = buider.locationName;
        this.address = builder.address;
        
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return Address;
    
    }



         @Override
    public String toString() {
        return "Location [locationId=" + locationId +
         ", locationName=" + locationName + 
         ", address=" + address + "]";
    }

        public static class Builder {

            private String locationId;
            private String locationName;
            private String address;
        
    
            public Builder setLocationId(int locationId) {
                this.locationId = locationId;
                return this;
            }
    
            public Builder setLocationName(String locationName) {
                this.locationName = locationName;
                return this;
            }
    
            public Builder setAddress(String address) {
                this.address = address;
                return this;
            }
    
    
        
            public Builder copy (Location location){
                this.locationId= location.locationId;
                this.locationName = location.locationName;
                this.address= location.address;
                return this;
            }
    
            public Location build(){return new Location(this);}
        }
    }

    
    


