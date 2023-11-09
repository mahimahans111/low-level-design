package VehicleDriveStrategy1;

import VehicleDriveStrategy1.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
