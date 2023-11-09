package VehicleDriveStrategy1;

import VehicleDriveStrategy1.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){super( new SportsDriveStrategy());}
}
