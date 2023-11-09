package VehicleDriveStrategy1;

import VehicleDriveStrategy1.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{
    GoodVehicle(){ super(new NormalDriveStrategy());}
}
