package com.vehicles;

public class VehiclesServices {

    public static void main(String[] args) {
        Bike bike = new Bike("BMW","X1","SportsBike");
        Car car = new Car("Santro","2014","Sedan");

        System.out.println("Bike type is " + bike.getVehicleType() +" its speed is " + bike.maxSpeed(bike.getVehicleType()));
        System.out.println("ManufactureInformation = " + bike.getManufactureInformation());
        System.out.println("Car type is " + car.getVehicleType() +" its speed is " + car.maxSpeed(car.getVehicleType()));
        System.out.println("ManufactureInformation = " + car.getManufactureInformation());


    }
}
