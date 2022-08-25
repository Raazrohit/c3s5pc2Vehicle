package com.vehicles;

public class Car extends VehiclesManufacturers {
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufactureInformation() {
        return "Car{Manufacturer name: '" +getVehicleName() + "', " + "Model Name: '" + getVehicleModelName() +
                "' ,Type: '" + getVehicleType() + "'}.";
    }
    public int maxSpeed(String vehicleType){

        if(getVehicleType().equalsIgnoreCase("SportsCar")){
            return 300;
        } else if (getVehicleType().equalsIgnoreCase("Sedan")) {
            return 190;
        }
        return 0;
    }
}
