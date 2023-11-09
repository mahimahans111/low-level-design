package VehicleDriveStrategy1;

import VehicleDriveStrategy1.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;
    Vehicle(DriveStrategy driveObject){
        this.driveObj = driveObject;
    }

    public void drive(){
        this.driveObj.drive();
    }
}
