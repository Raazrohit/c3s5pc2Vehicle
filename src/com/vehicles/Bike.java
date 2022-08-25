package com.vehicles;

public class Bike extends VehiclesManufacturers {

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufactureInformation() {

        return "Bike{Manufacturer name: '" +getVehicleName() + "', " + "Model Name: '" + getVehicleModelName() +
                "' ,Type: '" + getVehicleType() + "'}.";
    }
    public int maxSpeed(String vehicleType){
        if(getVehicleType().equalsIgnoreCase("SportsBike")){
            return 250;
        } else if (getVehicleType().equalsIgnoreCase("cruiser")) {
            return 150;
        }
        return 0;
    }
}