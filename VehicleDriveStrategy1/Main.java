package VehicleDriveStrategy1;

import VehicleDriveStrategy1.Strategy.SportsDriveStrategy;

public class Main {
    public static void main(String args[]){
        Vehicle vehicle1 = new SportsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new GoodVehicle();
        vehicle2.drive();
    }
}
